package Amazon;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class DSLR {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Program Files\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");						//launch Url
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		WebElement electronics=driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_6']"));
		Actions act=new Actions(driver);
		act.moveToElement(electronics).click().build().perform();
		 
		 Thread.sleep(2000);
		 WebElement camera=driver.findElement(By.xpath("//span[text()='Cameras & Photography']"));
		 act.moveToElement(camera).click().perform();
		
		 Thread.sleep(3000);
		TakesScreenshot take=(TakesScreenshot)driver;
		File src=take.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\ntci\\Documents\\Class\\Automation\\17082022 screenshot method\\image111.jepg");
		FileHandler.copy(src, dest);
		
		 
	
	}

}
