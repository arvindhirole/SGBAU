package Amazon;

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

public class AddCartmobile {

	private WebDriver driver ;
	private WebDriverWait wait ;
	@FindBy (xpath="//input[@id='twotabsearchtextbox']")
	private WebElement textbox ;
	
	@FindBy (xpath="//input[@id='nav-search-submit-button']")
	private WebElement search ;
	
	@FindBy (xpath="(//span[@class='a-size-medium a-color-base a-text-normal'])[2]")
	private WebElement samsung ;
	
	@FindBy (xpath="//input[@id='add-to-cart-button']")
	private WebElement addToCart ;
	
	//public constructor
	
	public AddCartmobile(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver ;
	}
	
	//method 
	
	public void sendtextBox()
		{
			textbox.sendKeys("mobile");
		}
	
	public void clickonSearch()
		{
		boolean searchButton=search.isEnabled();
			if(searchButton==true)
				{
				System.out.println("Search button is Enable to click");
				}
			else
				{
				System.out.println("Search button is not Enable to click");
				}
			search.click();
		}
	
	public void clicksamsung()
		{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",samsung);
		samsung.click();
		}
	
	public void clickaddToCart() throws IOException
		{
			
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",addToCart );
		
			wait=new WebDriverWait (driver ,3) ;
			WebElement button=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='add-to-cart-button']")));
		
			 TakesScreenshot sShot=(TakesScreenshot)driver;
			 File src=sShot.getScreenshotAs(OutputType.FILE);
			 File dest=new File("C:\\Users\\ntci\\Desktop\\New folder (2)AmazonAddToCard.jepg");
			 FileHandler.copy(src, dest);
			 
		addToCart.click();
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
