package webElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClearMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://desktop-r6157p8/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
	  
		WebElement usn = driver.findElement(By.name("username"));
		usn.sendKeys("admin");
		Thread.sleep(4000);
		usn.clear();
		
	
		
		
	}
	

}
