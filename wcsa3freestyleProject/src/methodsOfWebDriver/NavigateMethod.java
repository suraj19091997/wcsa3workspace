package methodsOfWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com");
		driver.switchTo().activeElement().sendKeys("happy dussehra",Keys.ENTER);
		Thread.sleep(4000);
		driver.navigate().back();//backward operations
		Thread.sleep(4000);
		driver.navigate().forward();//forward operation
		Thread.sleep(4000);
		driver.navigate().refresh();//refresh operation
	}
	
}


