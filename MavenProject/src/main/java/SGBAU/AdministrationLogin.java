package SGBAU;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdministrationLogin {

	//WebElements
	
	
	@FindBy (xpath="//input[@id='username']")
	private WebElement userName ;

	@FindBy (xpath="//input[@id='password']")
	private WebElement passWord ;
	
	@FindBy (xpath="//input[@type='checkbox']")
	private WebElement checkBox ;
	
	@FindBy (xpath="//span[text()='Sign In']")
	private WebElement signIn ;
	
	
	//Constructor
	public AdministrationLogin(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			
		}
	
	//Methods
	public void sendUserName()
		{
			userName.sendKeys("xyz");
		boolean displayed=	userName.isDisplayed();
			if(displayed==true)
			{
				System.out.println("userName is displaing on screen");
			}
			else
			{
				System.out.println("userName is not displaing on screen");
			}
		}
	
	public void sendUPassword()
		{
			passWord.sendKeys("a@123");
		}
	
	public void clickCheckBox()
		{
			checkBox.click();
			boolean box=checkBox.isSelected();
			if(box==true)
			{
				System.out.println("checkBox is Selected");
			}
			else
			{
				System.out.println("checkBos Is Not Selected");
			}
			
		}
	
	public void clickonSignIn()
		{
			boolean buttonEnable=signIn.isEnabled();
			if(buttonEnable==true)
			{
				System.out.println("sign in button is Enabled");
			}
			else
			{
				System.out.println("sign in button is not Enabled");
			}
			signIn.click();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
