package MakeMyTrip;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelsBooking {

	private WebDriver driver;
	
	//WebElements
	@FindBy (xpath="(//span[normalize-space()='Hotels'])[1]")
	private WebElement hotels ;
	
	@FindBy (xpath="(//span[normalize-space()='City, Property name or Location'])[1]")
	private WebElement city ;
	
	@FindBy (xpath="(//input[contains(@placeholder,'Enter city/ Hotel/ Area/ Building')])[1]")
	private WebElement hotelscity ;
	
	@FindBy (xpath="(//p[contains(@class,'locusLabel appendBottom5')][normalize-space()='Mumbai, Maharashtra, India'])[1]")
	private WebElement hotelmumbai ;
	
	@FindBy (xpath="(//input[@id='checkin'])[1]")
	private WebElement checkInDate ;
	
	@FindBy (xpath="(//div[contains(@aria-label,'Fri Sep 30 2022')][normalize-space()='30'])[1]")
	private WebElement checkInDate30 ;
	
	@FindBy (xpath="(//div[@aria-label='Sun Oct 02 2022'])[1]")
	private WebElement checkOutDate2 ;
	
	@FindBy (xpath="(//input[@id='guest'])[1]")
	private WebElement roomguest ;
	
	@FindBy (xpath="(//input[@id='guest'])[1]")
	private WebElement adult ;
	
	@FindBy (xpath="(//li[contains(text(),'1')])[5]")
	private WebElement children ;
	
	@FindBy (xpath="//select[@data-cy='childAge-0']")
	private WebElement childrenAge ;
	
	@FindBy (xpath="//option[@value='3']")
	private WebElement noOfChild ;
	
	@FindBy (xpath="//button[@data-cy='submitGuest']")
	private WebElement apply ;
	
	@FindBy (xpath="(//button[normalize-space()='Search'])[1]")
	private WebElement ApplyToSearch ;
	
	//Constructor
	public HotelsBooking(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver ;
	}

	
	

	//Methods
	public void clickonHotels()
	{
		hotels.click();
	}
	
	public void clickonCity()
	{
	city.click();
	}
	
	public void clickonhotelscity()
	{
		hotelscity.click();
		hotelscity.sendKeys("mumbai");
	}
	
	public void selectCityMumbai()
	{
		hotelmumbai.click();
	}
	
	public void selectcheckInDate()
	{
		checkInDate.click();
	}
	
	public void selectcheckInDate30()
	{
		checkInDate30.click();
	}
	
	public void selectcheckOutDate2()
	{
		checkOutDate2.click();
	}
	
	public void clickroomguest()
	{
		roomguest.click();
	}
	
	public void clickadult()
	{
		adult.click();
	}
	
	public void clickchildren()
	{
		children.click();
	}
	
	public void clickchildrenAge()
	{
		childrenAge.click();
	}
	
	public void clicknoOfChild()
	{
		noOfChild.click();
	}
	
	public void clickapply()
	{
		apply.click();
	}
	
	public void clickApplyToSearch() throws IOException
	{
		boolean button=ApplyToSearch.isEnabled();
		if(button==true)
		{
			System.out.println("check box of location is Enabled");
		}
		else
		{
			System.out.println("check box of location is not Enabled");
		}
		
		String text=ApplyToSearch.getText();
		System.out.println(text);
		
		TakesScreenshot ss=(TakesScreenshot)driver ;
		File src=ss.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\ntci\\Desktop\\New folder\\MakeMyTrip.jepg");
		FileHandler.copy(src, dest);
		ApplyToSearch.click();
	}
	
	
	
	
	
	
	
	
	
	
}
