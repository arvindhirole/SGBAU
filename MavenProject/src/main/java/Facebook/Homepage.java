package Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	//WebElement
	
	@FindBy (xpath="(//input[@id='email'])[1]")
	private WebElement email ;
	
	@FindBy (xpath="(//div[@id='passContainer'])[1]")
	private WebElement Password ;

	@FindBy (xpath="//button[@name='login']")
	private WebElement login ;
	
	@FindBy (xpath="(//a[normalize-space()='Forgotten password?'])[1]")
	private WebElement forgetPassword ;
	
	@FindBy (xpath="(//a[normalize-space()='Create New Account'])[1]")
	private WebElement createNewAc ;
	
	
	//Constructor
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Methods
	
	public void sendEmail()
	{
		email.sendKeys("arvindhirole@gmail.com");
	}
	
	public void sendpassword()
	{
		Password.sendKeys("Arvind@123");
	}
	
	public void clickLogin()
	{
		login.click();
	}
	
	public void selectForgetPassword()
	{
		forgetPassword.click();
	}
	public void clickCreateNewAc()
	{
		createNewAc.click();
	}
	
	
	
	
}
