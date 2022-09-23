package Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HelpCenter {

	
	
		//WebElements
	@FindBy (xpath="//a[text()=' Visit our help center ']")
	private WebElement helpCenter ;
	
	//Constructor
	public HelpCenter(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	 	//method
	
	public void clickHelpCenterButton()
	{
		helpCenter.click();
	}
	
	
	
	
	
	

}
