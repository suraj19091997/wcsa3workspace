package operationalMethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOpsMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/suraj/multiselectdropdown.html");
		WebElement element = driver.findElement(By.id("menu"));
		Select sel = new Select(element);
		for(int i=2;i<=8;i++)
		{
			sel.selectByIndex(i);
			Thread.sleep(2000);
		}
		 List<WebElement> allops = sel.getAllSelectedOptions();
	  for(WebElement ops:allops)
	  {
		  String options = ops.getText();
		  System.out.println(options);
	  }
}
}

