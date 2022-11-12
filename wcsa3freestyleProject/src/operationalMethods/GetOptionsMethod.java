package operationalMethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/suraj/singleselectdropdown.html");
		WebElement element = driver.findElement(By.id("menu"));
		Select sel = new Select(element);
		List<WebElement> allOps = sel.getOptions();
		for(WebElement ops:allOps)
		{
			//String dropDownOps = ops.getText();
			//System.out.println(dropDownOps);
			//Thread.sleep(2000);
			
			if(ops.getText().equals("puran poli"))
			{
				ops.click();
				break;
			}
		}

}
}
