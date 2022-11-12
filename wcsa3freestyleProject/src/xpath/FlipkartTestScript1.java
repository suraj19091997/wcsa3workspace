package xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartTestScript1 {
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.flipkart.com");
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		driver.findElement(By.name("q")).sendKeys("hp laptop");
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		String priceofHpLaptop = driver.findElement(By.xpath("//div[text()='HP Athlon Dual Core 3050U - (8 GB/512 GB SSD/Windows 11 Home) 15s- eq1559AU Thin and Light Laptop']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
		System.out.println(priceofHpLaptop+" : this is the price of hp laptop");
		
	}
	

}
