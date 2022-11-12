package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("file:///C:/suraj/TextBoxes.html");
       
        driver.findElement(By.id("username")).sendKeys("admin");
        Thread.sleep(5000);//stopping execution for 5 second
        driver.findElement(By.id("password")).sendKeys("manager");
        


	}

}
