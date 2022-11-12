package sychronaization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeFire {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://desktop-r6157p8/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
	   //explicitlyWait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		wait.until(ExpectedConditions.titleContains("Login"));
		
		System.out.println("login page title matched ! test case pass !");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		wait.until(ExpectedConditions.titleContains("Suraj"));
		System.out.println("home page title matched ! test case pass !");
		
		
	}
	

}
