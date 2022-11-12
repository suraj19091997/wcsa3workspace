package webBasedPoup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopup {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/suraj/ConfirmationPopup.html");
		Thread.sleep(2000);
		//popup is generated
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(2000);
		//control is switched to alert poup
		Alert al = driver.switchTo().alert();
		//we get the text of the alert popup
		String textOfPopup = al.getText();
		//display the text
		System.out.println(textOfPopup);
		//hit the OK button
		al.accept();// al.accept();
		
	
	}

}
