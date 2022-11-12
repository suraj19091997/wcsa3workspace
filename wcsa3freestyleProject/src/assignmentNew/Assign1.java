package assignmentNew;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("nothing phone 1");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		String parentHandle = driver.getWindowHandle();//89
		driver.findElement(By.xpath("(//div[text()='Nothing Phone (1) (White, 256 GB)'])[1]")).click();
		Thread.sleep(3000);
		Set<String> bothHandles = driver.getWindowHandles();
		for(String handle:bothHandles)
		{
			if(!parentHandle.equals(handle))
			{
				driver.switchTo().window(handle);
			}
			else
			{

			}
		}

		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Black']/ancestor::li[@id='swatch-0-color']/descendant::a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.='12 GB']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("pincodeInputId")).sendKeys("411033");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Check']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		Thread.sleep(3000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,4000)");
		Thread.sleep(3000);
		WebElement target = driver.findElement(By.xpath("//div[contains(text(),'Remove')]"));
		target.click();



	}



}
