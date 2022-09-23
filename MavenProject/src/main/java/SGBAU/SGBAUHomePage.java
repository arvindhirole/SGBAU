package SGBAU;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SGBAUHomePage {

	
	//WebElement Initialisation
	
	
	@FindBy (xpath="//span[text()='Student Login']")
	private WebElement studentLogin;
	
	@FindBy (xpath="(//div[@class='border-b-2 p-2'])[2]")
	private WebElement administartor;
	
	@FindBy (xpath="(//div[@class='border-b-2 p-2'])[4]")
	private WebElement collegeLogin ;
	
	@FindBy (xpath="(//div[@class='border-b-2 p-2'])[5]")
	private WebElement result ;
	
	
	//Constructor 
	
	public SGBAUHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//Methods
	
	public void clickStudentLogin ()
		{
		studentLogin.click();
		}
	
	public void clickAdministrator()
		{
		administartor.click();
		}
	
	public void clickCollegeLogin()
		{
		collegeLogin.click();
		}
	
	public void clickResult()
		{
		result.click();
		}
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
