package webElementMethods;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://127.0.0.1/login.do;jsessionid=g0brl90d6jqrm");
		
		
		WebElement checkboxKeepMeLoggedIn =
				driver.findElement(By.id("keepLoggedInCheckBox"));
		
		boolean status = checkboxKeepMeLoggedIn.isSelected();
		System.out.println(status);//false 
		Thread.sleep(3000);
		checkboxKeepMeLoggedIn.click();//selected
		boolean status2 = checkboxKeepMeLoggedIn.isSelected();
		System.out.println(status2);//true
		
		
		
	
	

	}

}