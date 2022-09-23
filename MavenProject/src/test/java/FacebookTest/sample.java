package FacebookTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class sample {

	@BeforeClass
	public void beforeclass()
	{
		System.out.println("");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("beforemethod");
	}
	
	@Test(priority=1)
	public void test1()
	{
		System.out.println("test1");
	}
	
	@Test(invocationCount=2)
	public void test2()
	{
		System.out.println("test2");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("afterclass");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("aftermethod");
	}
	
}
