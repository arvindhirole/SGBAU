package Amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;



public class AmazonLoginTestNg  {

	private WebDriver driver;
	private LoginPage loginPage;
	
	
	
	
	@BeforeTest
	public void launchBrowser(String browserName)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\selenium\\latest veriosn chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");						//launch Url
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@BeforeClass
	public void Objects()
	{
		loginPage=new LoginPage(driver);
	}
	
	@BeforeMethod
	public void loginDetails()
	{
		loginPage.clicksignIn();
		loginPage.clicknewAcc();
		loginPage.sendname();
		loginPage.sendmobileNum();
		loginPage.sendeMail();
		loginPage.sendpassWard();
	}
	
	@Test
	public void ValidateLoginButton()
	{
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String title=driver.getTitle();
		System.out.println(title);
		loginPage.clickcontinueButton();
	}
	
	@AfterClass
	public void backtoPage()
	{
		loginPage=null;
	}	
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
		driver=null;
		System.gc();
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
