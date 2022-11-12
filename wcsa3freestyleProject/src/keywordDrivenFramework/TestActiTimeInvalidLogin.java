package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;


public class TestActiTimeInvalidLogin  extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.setUp();//open the browser and launch actiTime
		Flib flib = new Flib();
		int rc = flib.getRowCount(EXCEL_PATH,"invaliddata");

		for(int i=1;i<=rc;i++)
		{
			String invalidUsername = flib.readExcelData(EXCEL_PATH,"invaliddata",i, 0);
			driver.findElement(By.name("username")).sendKeys(invalidUsername);
			Thread.sleep(2000);
			String invalidPassword = flib.readExcelData(EXCEL_PATH,"invaliddata", i, 1);
			driver.findElement(By.name("pwd")).sendKeys(invalidPassword);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("username")).clear();


		}
		bt.tearDown();

	}

}
