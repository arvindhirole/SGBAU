package MakeMyTrip;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hotels {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		

        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\selenium\\latest veriosn chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().window().maximize();			//maximize
		
		Thread.sleep(3000);
		WebElement hotels=driver.findElement(By.xpath("(//span[normalize-space()='Hotels'])[1]"));
		hotels.click();									//flights option click
		
		Thread.sleep(2000);
		WebElement city=driver.findElement(By.xpath("(//span[normalize-space()='City, Property name or Location'])[1]"));
		city.click();
		
		Thread.sleep(2000);
		WebElement hotelscity=driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter city/ Hotel/ Area/ Building')])[1]"));
		hotelscity.click();
		hotelscity.sendKeys("mumbai");
		
		Thread.sleep(2000);
		WebElement hotelmumbai=driver.findElement(By.xpath("(//p[contains(@class,'locusLabel appendBottom5')][normalize-space()='Mumbai, Maharashtra, India'])[1]"));
		hotelmumbai.click();
		
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		WebElement checkInDate=driver.findElement(By.xpath("(//input[@id='checkin'])[1]"));
		checkInDate.click();
		
		WebElement checkInDate30=driver.findElement(By.xpath("(//div[contains(@aria-label,'Fri Sep 30 2022')][normalize-space()='30'])[1]"));
		checkInDate30.click();
		
		WebElement checkOutDate2=driver.findElement(By.xpath("(//div[@aria-label='Sun Oct 02 2022'])[1]"));
		checkOutDate2.click();
		
		WebElement roomguest=driver.findElement(By.xpath("(//input[@id='guest'])[1]"));
		roomguest.click();
			WebElement adult=driver.findElement(By.xpath("(//input[@id='guest'])[1]"));
			adult.click();
			WebElement children=driver.findElement(By.xpath("(//li[contains(text(),'1')])[5]"));
			children.click();
			WebElement childrenAge=driver.findElement(By.xpath("//select[@data-cy='childAge-0']"));
			childrenAge.click();
			
			WebElement noOfChild=driver.findElement(By.xpath("//option[@value='3']"));
			noOfChild.click();
			WebElement apply=driver.findElement(By.xpath("//button[@data-cy='submitGuest']"));
			apply.click();
			
			WebElement ApplyToSearch=driver.findElement(By.xpath("(//button[normalize-space()='Search'])[1]"));
			ApplyToSearch.click();
			
			WebElement hotellocation=driver.findElement(By.xpath("(//span[contains(text(),'South Mumbai')])[1]"));
			hotellocation.click();
			boolean location=hotellocation.isSelected();
				if(location==true)
				{
					System.out.println("check box of location is selected");
				}
				else
				{
					System.out.println("check box of location is not selected");
				}
				
				
	
//				JavascriptExecutor js=(JavascriptExecutor)driver;
//				WebElement price=driver.findElement(By.xpath("(//label[contains(text(),'₹ 0 - ₹ 2500')])[1]"));
//				js.executeScript("arguments[0].scrollIntoView(true);",price);
//				
//				price.click();
//				
//				System.out.println("hi");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
