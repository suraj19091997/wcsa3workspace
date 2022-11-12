package methodsOfWebDriver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {
	
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(5000);
		String titleOfTheFirstPage = driver.getTitle();
		System.out.println(titleOfTheFirstPage);
	}

}
