package stale;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogin {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://127.0.0.1/login.do;jsessionid=1l4514s15e7b2");
		Thread.sleep(3000);
		
		WebElement usernameTextBox = driver.findElement(By.name("username"));//@ABC123
		usernameTextBox.sendKeys("admin");
		driver.navigate().refresh();
		
		//EF123
		Thread.sleep(3000);
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("suraj");
		
	}

}
