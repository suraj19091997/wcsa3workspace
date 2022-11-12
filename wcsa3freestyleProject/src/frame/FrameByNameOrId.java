package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameByNameOrId {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/suraj/page.html");
		WebElement un = driver.findElement(By.id("un"));
		un.sendKeys("admin");
		
		
		
		driver.switchTo().frame("frnm");
		WebElement pwd = driver.findElement(By.id("pwd"));
		pwd.sendKeys("manager");
		
		
		
		
	}

}
