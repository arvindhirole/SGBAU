package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EarPhone {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");						//launch Url
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		
		WebElement All=driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']"));		
		
		All.click();
		
		Thread.sleep(3000);
		WebElement TAV=driver.findElement(By.xpath("//a[@data-menu-id='9']"));
	    JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntiView(true);",TAV);
		TAV.click();
		
		Thread.sleep(2000);
		WebElement headPhone=driver.findElement(By.xpath("//a[text()='Headphones']"));
		headPhone.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
