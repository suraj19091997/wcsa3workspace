package eliminateDuplicate;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/suraj/multiselectdropdown.html");
		WebElement element = driver.findElement(By.id("menu"));
		
		Select sel = new Select(element);
		
		//all options of dropDown
		  List<WebElement> ops = sel.getOptions();
		 
		  HashSet<String> set = new HashSet<String>();
		 
		  for(int i=0;i<ops.size();i++)
		  {
			  WebElement allOps = ops.get(i);
			  String text = allOps.getText();
			  // remove duplicate
			  // order not be maintened
			  set.add(text);
		  }
		  
		  for(String se:set)
		  {
			  System.out.println(se);
		  }

}
}