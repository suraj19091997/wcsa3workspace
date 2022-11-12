package sychronaization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();

		WebElement cart = driver.findElement(By.xpath("//span[.='Cart']"));
		cart.click();

		driver.findElement(By.xpath("//span[.='Login']")).click();
	}
}
