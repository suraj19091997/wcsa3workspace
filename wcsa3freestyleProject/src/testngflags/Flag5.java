package testngflags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag5 {
  @Test(invocationCount = 1000)
  public void verifyloginButtonEnableDisableStatus() 
  {
	  Reporter.log("disabled !!",true);
  }
}
