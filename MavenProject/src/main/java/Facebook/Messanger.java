package Facebook;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Messanger {

	private WebDriver driver ;         //use this private WebDriver to initialise the driver for action on webelement
										//like screenshot,scroll,mouse action
	
				
	//WebElements
	@FindBy (xpath="//a[text()='Messenger']")
	private WebElement messanger ;
	
	@FindBy (xpath="(//a[normalize-space()='Rooms'])[1]")
	private WebElement rooms ;
	
	@FindBy (xpath="(//a[normalize-space()='Return to messenger.com'])[1]")
	private WebElement returnToHomePage ;
	
	
	//Constructors
	
	public Messanger(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver ;						//store the WebDriver into contructor driver
	}
	
	//Methods
	
	public void clickMessanger()
	{  
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",messanger);
		messanger.click();
	}
	
	public void clickRooms() throws IOException
	{
		rooms.click();
		TakesScreenshot ss=(TakesScreenshot)driver;
		File src=ss.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\ntci\\Desktop\\New folder\\FacebookImage01.jepg");
		FileHandler.copy(src, dest);
		
	}
	

	public void clickReturnHomePage()
	{
		WebDriverWait wait=new WebDriverWait(driver, 2); 		//two second wait
		WebElement button=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[normalize-space()='Return to messenger.com'])[1]")));
		returnToHomePage.click();
	}
}
