package robotMethods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("confirmBtn")).click();

		//mouse hover action
		WebElement target = driver.findElement(By.xpath("//a[contains(@title,'Watch Je')]"));

		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Band']")).click();

		Thread.sleep(2000);
		//
		WebElement clickAndHold = driver.findElement(By.xpath("//div[text()='Filter by']"));
		
		for(int i=0;i<=2;i++)
		{
		act.clickAndHold(clickAndHold).perform();
		}
		

		Thread.sleep(2000);
		//copy to the clipboard
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);

		//click on the search box
		WebElement searchBox = driver.findElement(By.xpath("//input[contains(@id,'search')]"));
		searchBox.click();
		Thread.sleep(2000);
		//paste from the clipboard
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		//search it
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='submit_search']")).click();
		






	}


}
