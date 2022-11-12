package readPropertyFile;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestActiTimeLogin {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=	new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://127.0.0.1/login.do;jsessionid=1l4514s15e7b2");
		Flib flib = new Flib();
		String validUsername = flib.readPropertData("./data/config.properties", "username");
		driver.findElement(By.name("username")).sendKeys(validUsername);
		String validPassword = flib.readPropertData("./data/config.properties", "password");
		driver.findElement(By.name("pwd")).sendKeys(validPassword);
		driver.findElement(By.id("loginButton")).click();
	}

}
