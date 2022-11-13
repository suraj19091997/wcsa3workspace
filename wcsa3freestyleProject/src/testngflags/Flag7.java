package testngflags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag7 {
	@Test
	public void loginMethod() 
	{
		int result=5/0;
		System.out.println(result);
		Reporter.log("logging in....",true);
	}

	@Test(dependsOnMethods = "loginMethod")
	public void createUser() 
	{
		Reporter.log("creating user....",true);
	}


	@Test(dependsOnMethods = "loginMethod",alwaysRun = true)
	public void logoutMethod() 
	{
		 Reporter.log("logging out....",true);
	}
}
