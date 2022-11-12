package testngflags;

import org.testng.Reporter;
import org.testng.annotations.Test;
// z j s a x g b
// a b g j s x z d k w
public class TestNGFlagAssignment {
	@Test
	public void z() 
	{
		Reporter.log("z method",true);
	}

	@Test(priority=0)
	public void x() 
	{
		Reporter.log("x method",true);
	}
	
	@Test(priority  =6)
	public void w() 
	{
		Reporter.log("w method",true);
	}

	@Test
	public void j() 
	{
		Reporter.log("j method",true);
	}

	@Test(priority=0)
	public void g() 
	{
		Reporter.log("g method",true);
	}

	@Test(priority  =3)
	public void k() 
	{
		Reporter.log("k method",true);
	}

	@Test
	public void s() 
	{
		Reporter.log("s method",true);
	}

	@Test(priority=0)
	public void b() 
	{
		Reporter.log("b method",true);
	}

	@Test
	public void a() 
	{
		Reporter.log("a method",true);
	}

	@Test(priority  =3)
	public void d() 
	{
		Reporter.log("d method",true);
	}


}
