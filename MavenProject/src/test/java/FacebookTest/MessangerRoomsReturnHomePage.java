package FacebookTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import Facebook.Messanger;

public class MessangerRoomsReturnHomePage {

	
	public static void main (String[] args) throws IOException {
		//test class for faceBook messange-rooms-returns to home page
		
		//test using POM Class
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
		
		msgr.clickReturnHomePage();
		String url=driver.getCurrentUrl();
		if(url==null ||url=="")
		{
			System.out.println("url of messanger is empty");
		}
		else
		{
			System.out.println("url of messanger is present");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}