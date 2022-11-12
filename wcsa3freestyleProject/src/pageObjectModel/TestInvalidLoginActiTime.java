package pageObjectModel;

import java.io.IOException;

public class TestInvalidLoginActiTime  extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.setUp();//opens the browser and launches the url
		LoginPage lp = new LoginPage(driver);

		Flib flib = new Flib();
		int rc = flib.getRowCount(EXCEL_PATH, "invaliddata");//gives us count to itterate 
		for(int i=1;i<=rc;i++)
		{
			String invalidUsername = flib.readExcelData(EXCEL_PATH,"invaliddata", i,0);
			String invalidPassword = flib.readExcelData(EXCEL_PATH,"invaliddata", i,1);
			
			lp.invalidLoginToActiTime(invalidUsername, invalidPassword);
		}

		bt.tearDown();
	}

}
