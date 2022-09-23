package MakeMyTrip;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGFlights {

	private WebDriver driver ;
	private Flightsbook flights ;
	@BeforeClass
	public void LaunchUrlMakeMyTrip()
		{
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\selenium\\latest veriosn chromedriver\\chromedriver.exe");
			
			 driver=new ChromeDriver(); ///WebDriver Object
			
			driver.get("https://www.makemytrip.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		}
	
	@BeforeMethod
	public void FillAllInformationForFlightSearch()
	{
		 flights=new Flightsbook(driver);
		
		flights.selecthotels();
		flights.selectflight();
		flights.selectkoneway();
		flights.selectfromcity();
		flights.selectdeparturedate();
		flights.selectdate();
		flights.selecttclass();
		flights.clickonapply();
		
	}
	
	@Test
	public void ValidateSearchButton()
	{
		flights.clickonsearch();
	}
	
	@AfterMethod
	public void ReturnBack()
	{
		driver.navigate().back();
	}
	
	@AfterClass
	public void QuitApplication()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
