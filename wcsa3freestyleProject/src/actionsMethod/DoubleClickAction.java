package actionsMethod;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://desktop-r6157p8/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.linkText("Settings")).click();
		driver.findElement(By.partialLinkText("Logo")).click();
		driver.findElement(By.id("uploadNewLogoOption")).click();
		WebElement target = driver.findElement(By.xpath("//input[@name='formCustomInterfaceLogo.logo']"));
		Actions act = new Actions(driver);
		act.doubleClick(target).perform();
		
		//integration of auto it script wiith WebDriver
		Runtime.getRuntime().exec("C:\\suraj\\wcsa3project\\wcsa3freestyleProject\\autoit\\fu.exe");
		Thread.sleep(4000);
		Runtime.getRuntime().exec("C:\\suraj\\wcsa3project\\wcsa3freestyleProject\\autoit\\fu.exe");
	
	}

}
