package Amazon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;



public class AddToCartTestNg {

	//Amazon mobile Add to Cart
	
	private WebDriver driver;
	private AddCartmobile addCartmobile;
	
	
	
	@BeforeTest							//browser Launch in @BeforeTest
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\selenium\\latest veriosn chromedriver\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");						//launch Url
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@BeforeClass				//All object declare in @Beforeclass
	public void laukchBrowser()
	{
		addCartmobile=new AddCartmobile(driver); 
	}
	
	@BeforeMethod
	public void SerachMobile()
	{
		
		addCartmobile.sendtextBox();
		addCartmobile.clickonSearch();
		addCartmobile.clicksamsung();
		
		ArrayList<String> changeWindow=new ArrayList<String>(driver.getWindowHandles());
		 driver.switchTo().window(changeWindow.get(1));
	}
	
	@Test
	public void ValidateAddToCardButton() throws IOException
	{
		addCartmobile.clickaddToCart();
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	@AfterClass
	public void ClearBrowser()
	{
		addCartmobile=null ;
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
		driver=null ;
		System.gc();
	}
	
}
