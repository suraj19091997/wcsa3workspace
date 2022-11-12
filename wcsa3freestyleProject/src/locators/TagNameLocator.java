package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("file:///D:/suraj/htmldocuments/TextBoxes.html");
        Thread.sleep(5000);//stopping execution for 5 second
        driver.findElement(By.tagName("input")).sendKeys("admin");


	}

}
