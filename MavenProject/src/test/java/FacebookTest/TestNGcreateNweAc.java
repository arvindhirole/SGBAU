package FacebookTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Facebook.CreateNewAc;
import Facebook.Homepage;

public class TestNGcreateNweAc {

	private WebDriver driver;
	private CreateNewAc createNewAc;
	
	@BeforeClass
	public void launchUrl()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\selenium\\latest veriosn chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");	
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void FillData()
	{
		driver.get("https://www.facebook.com");
		Homepage homepage= new Homepage(driver);
		homepage.clickCreateNewAc();
		
		CreateNewAc createNewAc= new CreateNewAc(driver);
		createNewAc.sendFirstName();
		createNewAc.sendsurName();
		createNewAc.sendEmailID();
		createNewAc.resendEmailID();
		createNewAc.sendPassword();
		createNewAc.selectDOB();
		createNewAc.selectMonth();
		createNewAc.selectYear();
		createNewAc.selectGenderMail();
		
	}
	
	@Test
	public void ValidateSignUp()
	{
		createNewAc.clickSignUp();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
