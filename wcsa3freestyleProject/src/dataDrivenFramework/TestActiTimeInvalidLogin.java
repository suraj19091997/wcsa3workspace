package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestActiTimeInvalidLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=	new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://127.0.0.1/login.do;jsessionid=1l4514s15e7b2");
		Flib flib = new Flib();
		int rc = flib.getRowCountMethod("./data/testdata.xlsx","invaliddata");
		
		for(int i=1;i<=rc;i++)
		{
			String invalidUsername = flib.readExcelData("./data/testdata.xlsx","invaliddata",i, 0);
			driver.findElement(By.name("username")).sendKeys(invalidUsername);
			Thread.sleep(2000);
			String invalidPassword = flib.readExcelData("./data/testdata.xlsx","invaliddata", i, 1);
			driver.findElement(By.name("pwd")).sendKeys(invalidPassword);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("username")).clear();
		}


	}

}
