package MakeMyTrip;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGHotels {

	private WebDriver driver ;
	private HotelsBooking ht ;
	
	@BeforeClass
	public void LaunchUrlOfMakeMyTrip()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\selenium\\latest veriosn chromedriver\\chromedriver.exe");
		
		  driver=new ChromeDriver(); ///WebDriver Object
		
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void FillDataOfHotelsBooking()
	{
		 ht=new HotelsBooking(driver);
		ht.clickonHotels();
		ht.clickonCity();
		ht.clickonhotelscity();
		ht.selectCityMumbai();
		ht.selectcheckInDate();
		ht.selectcheckInDate30();
		ht.selectcheckOutDate2();
		ht.clickroomguest();
		ht.clickadult();
		ht.clickchildren();
		ht.clickchildrenAge();
		ht.clicknoOfChild();
		ht.clickapply();
		
	}

	@Test
	public void ValidateApplyButton() throws IOException
	{
		ht.clickApplyToSearch();
	}
	
	@AfterMethod
	public void GoToBack()
	{
		driver.navigate().back();
	}
	
	@AfterClass
	public void QuitApplication()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
}
