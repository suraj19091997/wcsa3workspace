package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");//avoids IllegalStateException
		FirefoxDriver driver = new FirefoxDriver();//Launches firefox browser
		Thread.sleep(8000);
		driver.close();//closes firefox Browser
	}

}
