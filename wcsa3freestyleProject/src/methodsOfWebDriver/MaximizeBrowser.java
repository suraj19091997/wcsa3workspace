package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		// Options manage = driver.manage();
		 //Thread.sleep(4000);
		 //manage.window().maximize();
		 driver.manage().window().maximize();
	}

}
