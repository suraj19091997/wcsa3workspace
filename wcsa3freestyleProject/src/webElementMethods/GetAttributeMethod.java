package webElementMethods;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	
		WebElement unTextBox = driver.findElement(By.name("username"));
		WebElement passTextBox = driver.findElement(By.name("password"));
		String value1 = unTextBox.getAttribute("name");
		String value2 = passTextBox.getAttribute("type");
		
		System.out.println(value1);
		System.out.println(value2);
		
		
		
		
	}

}