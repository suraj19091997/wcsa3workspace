package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//used to avoid IllegalStateException
		ChromeDriver driver = new ChromeDriver();//launches chrome browser
		Thread.sleep(4000);//stop the O  execution for 4 sec
		driver.close();//closes chrome Browser
	}

}
