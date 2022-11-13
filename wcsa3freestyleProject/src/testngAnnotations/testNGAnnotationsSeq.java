package testngAnnotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class testNGAnnotationsSeq {
  @Test
  public void testCase1() 
  {
	  Reporter.log("test case 1 executed",true);
  }
  
  @Test
  public void testCase2() 
  {
	  Reporter.log("test case 2 executed",true);
  }
  
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  Reporter.log("before method executed",true);
  }

  @AfterMethod
  public void afterMethod() 
  {
	  Reporter.log("after method executed",true);
  }

  @BeforeClass
  public void beforeClass() 
  {
	  Reporter.log("before class executed",true);
  }

  @AfterClass
  public void afterClass()
  {
	  Reporter.log("after class executed",true);
  }

  @BeforeTest
  public void beforeTest() 
  {
	  Reporter.log("before test executed",true);
  }

  @AfterTest
  public void afterTest()
  {
	  Reporter.log("after test executed",true);
  }

  @BeforeSuite
  public void beforeSuite() 
  {
	  Reporter.log("before suite executed",true);
  }

  @AfterSuite
  public void afterSuite() 
  {
	  Reporter.log("after suite executed",true);
  }

}
