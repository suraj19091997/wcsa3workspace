package sychronaization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram1 {

	 public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(4000);
		driver.findElement(By.name("username")).sendKeys("qwert");
		driver.findElement(By.name("password")).sendKeys("asdf");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[.='Log In']")).click();
	}
}
