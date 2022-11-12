package sychronaization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramImplicitlyWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.instagram.com");
		driver.findElement(By.name("username")).sendKeys("qwert");
		driver.findElement(By.name("password")).sendKeys("asdfyuop");
		driver.findElement(By.xpath("//button[.='Log In']")).click();
	}
}
