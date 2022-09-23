package MakeMyTrip;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Flights {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 ChromeOptions options= new ChromeOptions();    // to disable notifications
		 options.addArguments("--disable-notifications");

        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\selenium\\latest veriosn chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.makemytrip.com/");		//launch Url
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2)); 		//2-seconds delay to all
		
		driver.manage().window().maximize();			//maximize
		
		Thread.sleep(3000);
		WebElement hotels=driver.findElement(By.xpath("//span[text()='Hotels']"));
		hotels.click();									//flights option click
		
		Thread.sleep(2000);
		WebElement flight=driver.findElement(By.xpath("//span[@class='chNavText darkGreyText']"));
		flight.click();	
	
		Thread.sleep(2000);
		WebElement oneway=driver.findElement(By.xpath("//li[@data-cy='oneWayTrip']"));
		oneway.click();	
	
		Thread.sleep(2000);
		WebElement fcity=driver.findElement(By.xpath("//input[@id='fromCity']"));
		fcity.click();	
		fcity.sendKeys("mumbai");
		WebElement mumbai=driver.findElement(By.xpath("//p[text()='Mumbai, India']"));
		mumbai.click();
		
		Thread.sleep(2000);
		WebElement ddate=driver.findElement(By.xpath("//label[@for='departure']"));
		ddate.click();
		Thread.sleep(3000);
		WebElement date=driver.findElement(By.xpath("(//div[@class='DayPicker-Day'])[1]"));
		date.click();
		
		Thread.sleep(2000);
		WebElement tclass=driver.findElement(By.xpath("//label[@for='travellers']"));
		 tclass.click();
		 
		 Thread.sleep(2000);
		 WebElement apply=driver.findElement(By.xpath("//button[@type='button']"));
		 apply.click();
		
		 Thread.sleep(2000);
		 WebElement search=driver.findElement(By.xpath("//a[text()='Search']"));
		 search.click();
		 
//		 Thread.sleep(2000);
//		 Alert alt=driver.switchTo().alert();
//		 alt.accept();
//		
//		 WebElement alert=driver.findElement(By.xpath("//button[text()='OKAY, GOT IT!']"));
//		alert.click();
		 
		 Thread.sleep(2000);
		 WebElement indigo=driver.findElement(By.xpath("(//div[@class='makeFlex hrtlCenter flexOne gap-x-10'])[2]"));
		 indigo.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
