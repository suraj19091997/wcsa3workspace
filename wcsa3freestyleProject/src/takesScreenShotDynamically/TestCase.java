package takesScreenShotDynamically;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(CustomListner.class)
public class TestCase  extends BaseTest{

	@BeforeMethod
	public void setUp()
	{
		initilization();

	}


	@Test
	public void actiTime1()
	{
		
	}

	@Test
	public void actiTime2()
	{
		
	}
	@Test
	public void actiTime3()
	{
		Assert.fail();
	}

	@Test
	public void actiTime4()
	{
		Assert.fail();
	}
	@Test
	public void actiTime5()
	{
		Assert.fail();
	}



	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
