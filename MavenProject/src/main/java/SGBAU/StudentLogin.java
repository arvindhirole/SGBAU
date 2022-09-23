package SGBAU;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudentLogin {

	//WebElements
	
	
	@FindBy (xpath="//input[@name='username']")
	private WebElement userName ;
	
	@FindBy (xpath="//input[@type='password']")
	private WebElement password ;
	
	@FindBy (xpath="//a[@class='inline-flex items-center justify-center w-full bg-green-400 hover:bg-green-900 text-white py-2 rounded-lg transition duration-100 ease-in-out cursor-pointer']")
	private WebElement signIn ;
	
	//Constructor
	public StudentLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//Methods
	
	public void SendUserName()
		{
			userName.sendKeys("123456789");
			
		}
	
	public void SendPassword()
		{
			password.sendKeys("12345");
		}
	
	public void clickSignIn()
		{
			String text=signIn.getText();
			System.out.println(text);
			
			boolean button=signIn.isEnabled();
			if(button==true)
			{
				System.out.println("sign butootn of studentLogin is Enalbled");
			}
			else
			{
				System.out.println("sign butootn of studentLogin is  not Enalbled");
			}
			signIn.click();
			
			
		}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
