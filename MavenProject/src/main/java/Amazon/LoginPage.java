package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//Private variables (WebElement)
	
	
	
	@FindBy (xpath="//span[@class='nav-line-2 ']")
	private WebElement signIn;
	
	@FindBy (xpath="//a[@id='createAccountSubmit']")
	private WebElement newAcc;
	
	@FindBy (xpath="//input[@id='ap_customer_name']")
	private WebElement name;
	
	@FindBy (xpath="//input[@id='ap_phone_number']")
	private WebElement mobileNum;
	
	@FindBy (xpath="//input[@id='ap_email']")
	private WebElement eMail;
	
	@FindBy (xpath="//input[@type='password']")
	private WebElement passWard;
	
	@FindBy (xpath="//input[@id='continue']")
	private WebElement continueButton;
	
	//public constructor (to initialise the WebElement)
	
	public LoginPage(WebDriver driver)
		{
		PageFactory.initElements(driver, this);
		}
	
	//public method (action on WebElements)
	
	
		public void clicksignIn()
		{
		signIn.click();
		}
	
		public void clicknewAcc()
		{
			boolean newAccButton=newAcc.isEnabled();											//TC04
			System.out.println(newAccButton);
			if(newAccButton==true)
			{
				System.out.println("New Ac create Button is Enable");
			}
			else
			{
				System.out.println("New Ac create Button is not Enable");
			}
			newAcc.click();
		}
	
		public void sendname()
		{
		name.sendKeys("Anand Hirole");
		}

		public void sendmobileNum()
		{
			mobileNum.sendKeys("8624930147");
		}
	
		public void sendeMail()
		{
			eMail.sendKeys("ananddhirole23@gmail.com");
		}
	
		public void sendpassWard()
		{
			passWard.sendKeys("Anand@123");
		}
	
		public void clickcontinueButton()
		{
			String text=continueButton.getText();
			System.out.println(text);
			continueButton.click();
		}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
