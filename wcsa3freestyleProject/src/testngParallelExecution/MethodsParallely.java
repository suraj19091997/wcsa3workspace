package testngParallelExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MethodsParallely {
	@Test
	public void method1() 
	{
		Reporter.log("hi i am method 1"+" : my thread number is  : "+Thread.currentThread().getId()+"",true);
	}


	@Test
	public void method2()
	{
		Reporter.log("hi i am method 2"+" : my thread number is  : "+Thread.currentThread().getId()+"",true);
	}

}
