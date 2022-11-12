package methodsOfWebDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethodSetPosition {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		Point setPos = new Point(500, 90);
		driver.manage().window().setPosition(setPos);
	}

}
