package Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateNewAc {
	
	
	
	//WebElement
	@FindBy (xpath="(//input[@type='text'])[2]")
	private WebElement firstName ;
	
	@FindBy (xpath="//input[@name='lastname']")
	private WebElement surName ;
	
	@FindBy (xpath="(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")
	private WebElement emailId ;
	
	@FindBy (xpath="(//input[@class='inputtext _58mg _5dba _2ph-'])[4]")
	private WebElement reEmail ;
	
	@FindBy (xpath="//input[@id='password_step_input']")
	private WebElement password ;
	
	@FindBy (xpath="//select[@id='day']")
	private WebElement dateofBirth ;
	
	@FindBy (xpath="//select[@id='month']")
	private WebElement month ;
	
	@FindBy (xpath="//select[@aria-label='Year']")
	private WebElement year ;

	@FindBy (xpath="(//label[normalize-space()='Female'])[1]")
	private WebElement genderFemail ;
	
	@FindBy (xpath="//label[text()='Male']")
	private WebElement genderMail ;
	
	@FindBy (xpath="//button[@name='websubmit']")
	private WebElement signUp ;
	
	//Constructor
	public CreateNewAc(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//Methods
	public void sendFirstName()
	{
		firstName.sendKeys("anand");
	}
	
	public void sendsurName()
	{
		surName.sendKeys("Hirole");
	}
	
	public void sendEmailID()
	{
		emailId.sendKeys("arvindhirole@gmail.com");
	}
	
	public void resendEmailID()
	{
		 reEmail.sendKeys("arvindhirole@gmail.com");
	}
	
	
	public void sendPassword()
	{
		password.sendKeys("anand@123");
	}
	
	public void selectDOB()
	{
		dateofBirth.click();
		Select select= new Select(dateofBirth);
		select.selectByIndex(5);
	}
	
	public void selectMonth()
	{
		month.click();
		Select select= new Select(month);
		select.selectByVisibleText("Jun");
	}
	public void selectYear()
	{
		year.click();
		Select select= new Select(year);
		select.selectByVisibleText("2003");
	}
	
	public void selectGenderFemail()
	{
		genderFemail.click();
	}
	
	public void selectGenderMail()
	{
		genderMail.click();
	}
	
	public void clickSignUp()
	{
		boolean button=signUp.isDisplayed();
		if(button==true)
		{
			System.out.println("SignUp Button is Displayed");
		}
		else
		{
			System.out.println("SignUp Button is not Displayed");
		}
		
		
		String text=signUp.getText();
		System.out.println(text);
		
		boolean buttonStatus=signUp.isEnabled();
		if(buttonStatus==true)
		{
			System.out.println("SignUp Button is Enabled");
		}
		else
		{
			System.out.println("SignUp Button is not Enabled");
		}
		
		signUp.click();
		
	}
	
}
