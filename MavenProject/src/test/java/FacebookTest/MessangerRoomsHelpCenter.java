package FacebookTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Facebook.HelpCenter;
import Facebook.Messanger;

public class MessangerRoomsHelpCenter {

	public static void main(String[] args) throws IOException, InterruptedException {
		//
		
		//Test uning POM Class  

		
		 	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\selenium\\latest veriosn chromedriver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.get("https://www.facebook.com");	
			driver.manage().window().maximize();
			
			String title=driver.getTitle();
			System.out.println(title);
			if(title.equals("Facebook � log in or sign up"))
			{
				System.out.println("Title Case Pass");
			}
			else
			{
				System.out.println("Title Case Fail");
			}
			
			
			Messanger msgr=new Messanger(driver);
			 msgr.clickMessanger();
			
			
			
			msgr.clickRooms();
			String RoomPagetitle=driver.getTitle();
			System.out.println(RoomPagetitle);
			
			Thread.sleep(3000);
			HelpCenter hc=new HelpCenter(driver);
			hc.clickHelpCenterButton();
			
			
	}

}
