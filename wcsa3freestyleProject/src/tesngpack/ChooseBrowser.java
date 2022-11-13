package tesngpack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ChooseBrowser {
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void openBrowser(String browserValue) 
	{
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.get("https://www.google.com");
			driver.switchTo().activeElement().sendKeys("You are seeing chrome browser");

		}

		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.get("https://www.google.com");
			driver.switchTo().activeElement().sendKeys("You are seeing firefox browser");

		}
		
		else
		{
			Reporter.log("invalid browser !",true);
		}

	}
}
