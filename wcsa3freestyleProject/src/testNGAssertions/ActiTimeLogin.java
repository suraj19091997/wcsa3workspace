package testNGAssertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class ActiTimeLogin {
	
	@Test
	public void LoginToActiTime() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://127.0.0.1/login.do;jsessionid=1l4514s15e7b2");
		String actualLoginPageTitle = driver.getTitle();
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(actualLoginPageTitle,"suraj - Login");//soft
		
		WebElement usernameTb = driver.findElement(By.name("username"));
		boolean statusOfUsernameTb = usernameTb.isDisplayed();
		Assert.assertEquals(statusOfUsernameTb, true);//hard assert
		usernameTb.sendKeys("admin");
		
		WebElement passwordTB = driver.findElement(By.name("pwd"));
		boolean statusOfpasswordTB = passwordTB.isDisplayed();
		Assert.assertEquals(statusOfpasswordTB, true);//hard assert
		passwordTB.sendKeys("manager");
		
		WebElement clickButton = driver.findElement(By.id("loginButton"));
		boolean statusOfClickButton = clickButton.isDisplayed();
		Assert.assertEquals(statusOfClickButton, true);//hard assert
		clickButton.click();
		Thread.sleep(4000);
		
		String actualHomePageTitle = driver.getTitle();
		softassert.assertNotEquals(actualHomePageTitle,"suraj - Enter Time-Track");
		
		Reporter.log("create user",true);
		Reporter.log("create reports",true);
		
		softassert.assertAll();// user mandatory line when soft assert is used 
		
		
		


	}


}
