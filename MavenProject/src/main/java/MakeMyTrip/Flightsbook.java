package MakeMyTrip;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flightsbook {

	//variables (WebElements)
	
	@FindBy (xpath="//span[text()='Hotels']")
	private WebElement hotels;
	
	@FindBy (xpath="//span[@class='chNavText darkGreyText']")
	private WebElement flight;
	
	@FindBy (xpath="//li[@data-cy='oneWayTrip']")
	private WebElement oneway;
	
	@FindBy (xpath="//input[@id='fromCity']")
	private WebElement fromcity;
	
	@FindBy (xpath="//label[@for='departure']")
	private WebElement departuredate;
	
	@FindBy (xpath="(//div[@class='dateInnerCell'])[20]")
	private WebElement date;
	
	@FindBy (xpath="//label[@for='travellers']")
	private WebElement tclass;
	
	@FindBy (xpath="//button[@type='button']")
	private WebElement apply;
	
	@FindBy (xpath="//a[text()='Search']")
	private WebElement search;
	
	
	// contructor 
	
	public Flightsbook (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//method
	
	public void selecthotels()
	{
		hotels.click();
	}
	
	public void selectflight()
	{
		flight.click();
		
	}
	
	public void selectkoneway()
	{
		oneway.click();
	}
	
	public void selectfromcity()
	{
		fromcity.click();
		fromcity.sendKeys("mumbai");
	}
	
	public void selectdeparturedate()
	{
		departuredate.click();
	}
	
	public void selectdate()
	{
		date.click();
	}
	
	public void selecttclass()
	{
		tclass.click();
	}
	
	public void clickonapply()
	{
		apply.click();
	}
	
	public void clickonsearch()
	{
		boolean button=search.isEnabled();
		if(button==true)
		{
			System.out.println("search button Enable");
		}
		else
		{
			System.out.println("search button not Enable");
		}
				
		search.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
