package testngflags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
  @Test(description = "this method helps to login to the actitime application")
  public void loginToActiTime()
  {
	  Reporter.log("loggin in......",true);
  }
  
  
  @Test(description ="this method is used to perform log out")
  public void Flag2()
  {
	  Reporter.log("logging out....",true);
  }
}
