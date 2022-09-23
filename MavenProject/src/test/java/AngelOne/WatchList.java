package AngelOne;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WatchList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2)); //not work in old version
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		driver.get("https://trade.angelone.in/?redirect=/watchlist");   //Lauch Url
		
		driver.manage().window().maximize();       						//maximize
		
		String title=driver.getTitle();									//Title
		System.out.println(title);
		
		String Url=driver.getCurrentUrl();								//	Url
		System.out.println(Url);
		
		WebElement mobilenum=driver.findElement(By.xpath("//input[contains(@id, 'txtMobileNo')]"));
		mobilenum.click();
		mobilenum.sendKeys("8308342641");								//send mobile number
		
		WebElement proceed=driver.findElement(By.xpath("(//a[text()='PROCEED'])[1]"));
		proceed.click();												// Proceed
		
		                                      					
		
		
	}

}
