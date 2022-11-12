package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTillAPerticularWebElement {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.selenium.dev");
		Thread.sleep(4000);
		WebElement newsTarget = driver.findElement(By.xpath("//h2[.='News']"));
		Point loc = newsTarget.getLocation();
		int xaxis = loc.getX();
		int yaxis = loc.getY();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-100)+")");
		Thread.sleep(3000);
		
	}

}
