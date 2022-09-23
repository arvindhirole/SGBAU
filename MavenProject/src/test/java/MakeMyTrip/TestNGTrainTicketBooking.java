package MakeMyTrip;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGTrainTicketBooking {

	private WebDriver driver;
	private TrainTicketBook train; 
	@BeforeClass
	public void LaunchMakeMyTripUrl()
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\selenium\\latest veriosn chromedriver\\chromedriver.exe");
			
			driver=new ChromeDriver();
			
			driver.get("https://www.makemytrip.com/");
			
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
	}
	
	@BeforeMethod
	public void FillDataForTicketBooking()
	{
		train=new TrainTicketBook(driver);
		
		train.clickTrains();
		train.clickFromTrain();
		train.SendFromCityName();
		train.SelectCityDelhi();
		train.clickToCity();
		train.SendToCityName();
		train.SelectMumbaiCity();
		train.ClickonTraveDateOption();
		train.SelectTravellingDate();
		train.ClickOnTicketClass();
		train.SelectSleeperClassTicket();
		
				
	}
	
	@Test
	public void ValidateTrainSearchButton() throws IOException
	{
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("title", "IRCTC Train Ticket Booking | Indian Railways Ticket Booking | IRCTC Train Tickets Reservation - MakeMyTrip");
		
//		if(title.equals("title"))
//			{
//				System.out.println("Title is same as Expected");
//			}
//		else
//			{
//			System.out.println("Title is not same as Expected");
//			}
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals("url","https://www.makemytrip.com/railways/");
//		if(url.equals("https://www.makemytrip.com/"))
//			{
//			System.out.println("Url is Same as Expected");	
//			}
//		else
//		{
//			System.out.println("Url is not Same as Expected");		
//		}
		
		TakesScreenshot take=(TakesScreenshot)driver;
		File src=take.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\ntci\\Desktop\\New folder\\MakeMyTripTraiTicket.jepg");
		FileHandler.copy(src, dest);
			train.ClickonSearchTrain();
		
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
