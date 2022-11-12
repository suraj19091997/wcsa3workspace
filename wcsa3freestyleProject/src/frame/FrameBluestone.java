package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameBluestone {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
//		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--disable-notifications");
//		WebDriver driver=new ChromeDriver(co);
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://bluestone.com");
		driver.findElement(By.xpath("//span[@id='confirmBtn']")).click();
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='fc_widget']"));
		
		driver.switchTo().frame(frameElement);
		
		driver.findElement(By.id("chat-icon")).click();
		
		
		driver.findElement(By.xpath("(//input)[10]")).sendKeys("admin");
		
		
		
	}

}
