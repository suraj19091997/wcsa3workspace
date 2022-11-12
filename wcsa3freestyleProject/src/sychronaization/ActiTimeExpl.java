package sychronaization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeExpl {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://desktop-r6157p8/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		String actualLoginPageTitle = driver.getTitle();
		if(actualLoginPageTitle.equals("actiTIME - Login"))
		{
			System.out.println("login page title matched ! Test case pass !");
		}
		else
		{
			System.out.println("login page title not matched ! Test case fail !");
		}
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		String actualHomePageTitle = driver.getTitle();
		if(actualHomePageTitle.equals("actiTIME - Enter Time-Track"))
		{
			System.out.println("Home page title matched ! Test case pass !");
		}
		else
		{
			System.out.println("Home page title not matched ! Test case fail !");
		}
		
		
	}
	

}
