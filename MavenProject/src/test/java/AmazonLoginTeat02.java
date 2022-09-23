import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Amazon.LoginPage;

public class AmazonLoginTeat02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\selenium\\latest veriosn chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");						//launch Url
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		String title=driver.getTitle();								
		System.out.println("The title of page id:-"+title);
		
		LoginPage loginPage=new LoginPage(driver);
		loginPage.clicksignIn();
		loginPage.clicknewAcc();
		loginPage.sendname();
		loginPage.sendmobileNum();
		loginPage.sendeMail();
		loginPage.sendpassWard();
		loginPage.clickcontinueButton();
		
		
		
		
		
		
	}

}
