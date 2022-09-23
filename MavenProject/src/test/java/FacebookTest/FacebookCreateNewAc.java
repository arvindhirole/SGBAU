package FacebookTest;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Facebook.CreateNewAc;
import Facebook.Homepage;

public class FacebookCreateNewAc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Testing using POM Class
		
		   System.setProperty("webdriver.chrome.driver","C:\\Program Files\\selenium\\latest veriosn chromedriver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com");	
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
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
		createNewAc.clickSignUp();
		
		
		
	}

}
