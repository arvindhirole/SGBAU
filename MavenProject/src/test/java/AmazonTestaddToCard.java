import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Amazon.AddCartmobile;

public class AmazonTestaddToCard {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//Add to Cart samsung mobile
		
System.setProperty("webdriver.chrome.driver","C:\\Program Files\\selenium\\latest veriosn chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");						//launch Url
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		AddCartmobile addCartmobile=new AddCartmobile(driver);
		addCartmobile.sendtextBox();
		addCartmobile.clickonSearch();
		addCartmobile.clicksamsung();
		
		 ArrayList<String> changeWindow=new ArrayList<String>(driver.getWindowHandles());
		 driver.switchTo().window(changeWindow.get(1));
		 addCartmobile.clickaddToCart();
		
		
		
	}

}
