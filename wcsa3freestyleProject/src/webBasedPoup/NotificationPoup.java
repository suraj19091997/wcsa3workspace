package webBasedPoup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPoup {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
//		co.addArguments("-start-maximized");
		WebDriver driver=new ChromeDriver(co);
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.bluestone.com/");
//		driver.findElement(By.id("confirmBtn")).click();
	}
	

}
