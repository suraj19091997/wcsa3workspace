package methodsOfWebDriver;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethodSetSize {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
             
		Dimension targetSize = new Dimension(600, 300);
		driver.manage().window().setSize(targetSize);
	}


}
