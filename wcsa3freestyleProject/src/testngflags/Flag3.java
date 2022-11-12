package testngflags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag3 {
	@Test(priority  =1)
	public void loginMethod() 
	{
		Reporter.log("logging in....",true);
	}

	@Test(priority = 2)
	public void createUser() 
	{
		Reporter.log("creating user....",true);
	}


	@Test(priority = 3)
	public void logoutMethod() 
	{
		 Reporter.log("logging out....",true);
	}
}
