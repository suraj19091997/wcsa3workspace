package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign2 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/suraj/page.html");
		WebElement un = driver.findElement(By.id("un"));
		un.sendKeys("admin");
		WebElement frameElement = driver.findElement(By.id("frid"));
		driver.switchTo().frame(frameElement);
		WebElement pwd = driver.findElement(By.id("pwd"));
		pwd.sendKeys("manager");
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		un.clear();
		
		
	}

}
