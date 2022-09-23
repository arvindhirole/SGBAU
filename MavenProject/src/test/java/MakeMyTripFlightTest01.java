import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import MakeMyTrip.Flightsbook;

public class MakeMyTripFlightTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    System.setProperty("webdriver.chrome.driver","C:\\Program Files\\selenium\\latest veriosn chromedriver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.makemytrip.com/");		//launch Url
			
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); 		//2-seconds delay to all
			
			driver.manage().window().maximize();
			
			String url=driver.getCurrentUrl();
			System.out.println(url);
			
			String title=driver.getTitle();
			System.out.println(title);
			
			Flightsbook flightsbook= new Flightsbook(driver);
			flightsbook.selectflight();
			flightsbook.selectkoneway();
			flightsbook.selectfromcity();
			flightsbook.selectdeparturedate();
			flightsbook.selectdate();
			flightsbook.selecttclass();
			flightsbook.clickonapply();
			flightsbook.clickonsearch();
			
			
			
			
			
	}

}
