package SGBAUTest;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import SGBAU.SGBAUHomePage;
import SGBAU.StudentLogin;
import SetUp.Base;

public class StudentValidation extends Base{

	
	private WebDriver driver ;
	private SGBAUHomePage hPage ;
	private StudentLogin std ;
	
	@Parameters("browser")
	
	@BeforeTest
	public void launchbrowser(String browserName)
	{
		if(browserName.equals("Opera"))
		{
		 driver=openOperaBrowser();
		}
		
		if(browserName.equals("Chrome"))
		{
			driver=openChromeBrowser();
		}
			driver.get("https://sgbau.ucanapply.com/");
			
			driver.manage().timeouts().implicitlyWait(3 ,TimeUnit.SECONDS );
			driver.manage().window().maximize();
		}
	
	@BeforeClass
	public void objectPOMclass()
		{
			hPage= new SGBAUHomePage(driver) ;
			 std=new StudentLogin(driver);
		}
	
	@BeforeMethod
	public void SGBAUPage()
	{
		String title=driver.getTitle();
		System.out.println(title);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
	}
	
	
	@Test (priority=1, invocationCount=1)//invocationCount is reexecution
	public void StudentLogin () 		
		{
			hPage.clickStudentLogin();		
			
		}
	
	@Test(priority=2)				//enabled=false, dont execute the test
	public void StudentLoginValidation() throws InterruptedException
		{
			std.SendUserName();
			std.SendPassword();
			Thread.sleep(2000);
			std.clickSignIn();
			
			//Assert
			
			SoftAssert soft=new SoftAssert(); //object of Soft Assert
					
			String link=driver.getCurrentUrl();
			soft.assertEquals(link, "https://sgbau.ucanapply.com/"); //Soft Assert
					//Soft.assertNotEquals(link, "https://sgbau.ucanapply.com/");
					
			String title=driver.getTitle();
			soft.assertEquals(title, "S.G.B.A. University, Amravati");  //Soft Assert
					//Soft.assertNotEquals(title, "S.G.B.A. University, Amravati");
			
			soft.assertAll();
					
		}
	
	public void TakeScreenshot(ITestResult result)
	{
		String Tc_1="001";
		LocalDate LD=LocalDate.now();
		LocalTime LT=LocalTime.now();
		String date=LD.toString().replace(":", "").replace(" ", "");
		String time=LT.toString().replace(":", "").replace(" ", "");
		
		if(ITestResult.SUCCESS==result.getStatus());
			{
				
				Base.screenshots(driver,"PassTestSS"+Tc_1+""+date+""+time);
			}
		if(ITestResult.FAILURE==result.getStatus());
		{
			Base.screenshots(driver,"FailTestss"+Tc_1+""+date+""+time);
		}
		
	}
	
	@AfterClass
	public void cleanPOMobject()
		{
			hPage=null;
			std=null;
		}
	
	@AfterTest
	public void closedBrowser()
	{
		driver.close();
		driver=null;
		System.gc();
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			 
	}

}


