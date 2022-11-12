package operationalMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleMethod {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/suraj/singleselectdropdown.html");
		WebElement element = driver.findElement(By.id("menu"));
		Select sel = new Select(element);
		boolean checkDropDown = sel.isMultiple();
		System.out.println(checkDropDown);
		Thread.sleep(2000);
		driver.navigate().to("file:///C:/suraj/multiselectdropdown.html");
		WebElement element1 = driver.findElement(By.id("menu"));
		sel=new Select(element1);
		boolean checkDropDown2 = sel.isMultiple();
		Thread.sleep(2000);
		System.out.println(checkDropDown2);
	}

}
