package MakeMyTrip;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrainsBookTickets {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		    System.setProperty("webdriver.chrome.driver","C:\\Program Files\\selenium\\latest veriosn chromedriver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.makemytrip.com/");
			
			driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			String title=driver.getTitle();
			System.out.println("title");
			
			WebElement train=driver.findElement(By.xpath("(//span[@class='chNavText darkGreyText'][normalize-space()='Trains'])[1]"));
			train.click();
			
			WebElement from=driver.findElement(By.xpath("(//span[normalize-space()='From'])[1]"));
			from.click();
			
			WebElement fromcityDelhi=driver.findElement(By.xpath("(//input[@placeholder='From'])[1]"));
			fromcityDelhi.sendKeys("Delhi");
		
			WebElement cityselectdelhi=driver.findElement(By.xpath("(//span[@class='sr_city blackText'][normalize-space()='Delhi'])[1]"));
			cityselectdelhi.click();
		
			WebElement to=driver.findElement(By.xpath("(//span[normalize-space()='To'])[1]"));
			to.click();
			
			WebElement tocity=driver.findElement(By.xpath("//input[@aria-autocomplete='list']"));
			tocity.sendKeys("mumbai");
			
			WebElement tocitymumbai=driver.findElement(By.xpath("//span[text()='Mumbai']"));
			tocitymumbai.click();
			
			WebElement travelDate=driver.findElement(By.xpath("(//input[@id='travelDate'])[1]"));
			travelDate.click();
			
			WebElement clickDate=driver.findElement(By.xpath("//div[@aria-label='Fri Sep 30 2022']"));
			clickDate.click();
			
			WebElement Tclass=driver.findElement(By.xpath("//span[@class='appendBottom5 downArrow']"));
			Tclass.click();
			WebElement sleeperclass=driver.findElement(By.xpath("//li[@data-cy='SL']"));
			sleeperclass.click();
			
			WebElement searchtrain=driver.findElement(By.xpath("(//a[normalize-space()='Search'])[1]"));
			searchtrain.click();
			
			TakesScreenshot takess=(TakesScreenshot)driver;
			File src=takess.getScreenshotAs(OutputType.FILE);
			File dest=new File("C:\\Users\\ntci\\Documents\\Class\\Automation\\17082022 screenshot method\\project.jepg");
			FileHandler.copy(src, dest);
			
			WebElement ticketCamcellation=driver.findElement(By.xpath("(//a[normalize-space()='Search'])[1]"));
			ticketCamcellation.click();
			boolean selected=ticketCamcellation.isSelected();
			if(selected==true)
			{
				System.out.println("click button is selected");
			}
			else
			{
				System.out.println("click button is not selected");
			}
			
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			WebElement tejasExpress=driver.findElement(By.xpath("(//div)[489]"));
			js.executeScript("arguments[0].scrollIntoView(true);",tejasExpress);
			WebDriverWait wait=new WebDriverWait(driver, 30);   //30sec
			tejasExpress.click();
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static void findElement(By xpath) {
		// TODO Auto-generated method stub
		
	}

}
