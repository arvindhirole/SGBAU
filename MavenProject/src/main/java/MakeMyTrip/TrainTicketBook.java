package MakeMyTrip;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrainTicketBook {

	//WebElements
	@FindBy (xpath="(//span[@class='chNavText darkGreyText'][normalize-space()='Trains'])[1]")
	private WebElement train ;
	
	@FindBy (xpath="(//span[normalize-space()='From'])[1]")
	private WebElement from ;
	
	@FindBy (xpath="(//input[@placeholder='From'])[1]")
	private WebElement fromcityDelhi ;
	
	@FindBy (xpath="(//span[@class='sr_city blackText'][normalize-space()='Delhi'])[1]")
	private WebElement cityselectdelhi ;
	
	@FindBy (xpath="(//span[normalize-space()='To'])[1]")
	private WebElement to ;
	
	@FindBy (xpath="//input[@aria-autocomplete='list']")
	private WebElement tocity;
	
	@FindBy (xpath="//span[text()='Mumbai']")
	private WebElement tocitymumbai ;
	
	@FindBy (xpath="(//input[@id='travelDate'])[1]")
	private WebElement travelDate ;
	
	@FindBy (xpath="//div[@aria-label='Fri Sep 30 2022']")
	private WebElement clickDate ;
	
	@FindBy (xpath="//span[@class='appendBottom5 downArrow']")
	private WebElement Tclass ;
	
	@FindBy (xpath="//li[@data-cy='SL']")
	private WebElement sleeperclass ;
	
	@FindBy (xpath="(//a[normalize-space()='Search'])[1]")
	private WebElement searchtrain  ;
	
	//Constructor
	public TrainTicketBook(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//Methods
	public void clickTrains()
		{
			train.click();
		}
	
	public void clickFromTrain()
		{
			from.click();
		}
	
	public void SendFromCityName()
		{
			fromcityDelhi.sendKeys("Delhi");
		}

	public void SelectCityDelhi()
		{
			cityselectdelhi.click();
		}
	
	public void clickToCity()
		{
			to.click();
		}
	
	public void SendToCityName()
		{
			tocity.sendKeys("mumbai");
		}
	
	public void SelectMumbaiCity()
		{
			tocitymumbai.click();
		}
	
	public void ClickonTraveDateOption()
		{
			travelDate.click();
		}
	
	public void SelectTravellingDate()
		{
			clickDate.click();
		}
	
	public void ClickOnTicketClass()
		{
			Tclass.click();
		}
	
	public void SelectSleeperClassTicket()
		{
			sleeperclass.click();
		}
	
	public void ClickonSearchTrain()
		{
		boolean button=searchtrain.isEnabled();
		if( button==true)
		{
			System.out.println("click button is Enabled");
		}
		else
		{
			System.out.println("click button is not Enabled");
		}
		
		
		
		String Buttontext=searchtrain.getText();
		System.out.println(Buttontext);
		
			searchtrain.click();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
