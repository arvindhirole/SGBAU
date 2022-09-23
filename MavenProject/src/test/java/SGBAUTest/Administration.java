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
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import SGBAU.AdministrationLogin;

import SGBAU.SGBAUHomePage;
import SetUp.Base;


public class Administration extends Base {

	
	private WebDriver driver ;
	private SGBAUHomePage hPage ;
	private AdministrationLogin adml ;
	
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
	public void objectsPOMclass()
		{	
			hPage= new SGBAUHomePage(driver) ;	
			adml=new AdministrationLogin(driver);
			
		}
	
	
	@BeforeMethod
	public void SGBAUPage()
	{
		String title=driver.getTitle();
		System.out.println(title);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
	}
						//dependsOnMethods= {"StudentLoginValidation"}, current test excecution depends on another test status
	@Test (priority=1)//priority is order of excecution,//timeOut=2000 timeOut is limit to execution
	public void AdministrationLogin()
		{
			hPage.clickAdministrator();	
			
		}
	
	@Test(priority=2)
	public void AdministrationLoginValidation()
	{
		adml.sendUserName();
		adml.sendUPassword();
		adml.clickCheckBox();
		adml.clickonSignIn();
		
		//Assert
				String link=driver.getCurrentUrl();
				Assert.assertEquals(link, "https://sgbau.ucanapply.com/"); //Hard Assert
				
				String title=driver.getTitle();								//Hard Assert
				Assert.assertEquals(title, "S.G.B.A. University, Amravati");
	}
	
	@AfterMethod
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
	public void clearoPOMbject()
	{
		hPage=null;
		adml=null;
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
