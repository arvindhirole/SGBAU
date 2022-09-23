package Amazon;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Login {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");						//TC01
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		String title=driver.getTitle();								//TC02
		System.out.println("The title of page id:-"+title);
		
		
	Actions act=new Actions(driver);
	WebElement accList=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
	WebElement signIn=driver.findElement(By.xpath("(//span[text()='Sign in'])[1]"));
	act.moveToElement(accList).moveToElement(signIn).click().build().perform();      //TC03
	
	Thread.sleep(3000);
	WebElement newAcc=driver.findElement(By.xpath("//a[@id='createAccountSubmit']"));
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
		
	
	String text=newAcc.getText();		//TC05
	System.out.println("Text is the Box:"+text);
	if(text.equals("Create your Amazon account"))
	{
		System.out.println("text is Same:Pass");
	}
	else
	{
		System.out.println("text is Fail:Fail");
	}
	
	newAcc.click();							//TC06
	
	String titleofNewAC=driver.getTitle();	//TC07
	System.out.println("Title of the page:"+titleofNewAC);
	
	WebElement 	name= driver.findElement(By.xpath("//input[@id='ap_customer_name']"));		//TC08
	WebElement 	mobileNum= driver.findElement(By.xpath("//input[@id='ap_phone_number']"));  //TC09
	WebElement 	eMail= driver.findElement(By.xpath("//input[@id='ap_email']"));				//TC10
	WebElement 	passWard= driver.findElement(By.xpath("//input[@type='password']"));		//TC11
	
	act.moveToElement(name).click().sendKeys("Anand Hirole").moveToElement(mobileNum).click().sendKeys("8624930147").moveToElement(eMail).click().sendKeys("ananddhirole23@gmail.com").moveToElement(passWard).click().sendKeys("Anand@123").build().perform();
	
	WebElement 	continueButton= driver.findElement(By.xpath("//input[@id='continue']"));	
	boolean button=continueButton.isEnabled();												//TC12
	if(button==true)
	{
		System.out.println("Button is Enable");
	}
	else
	{
		System.out.println("Button is not Enable");	
	}
		
	boolean displaybutton=continueButton.isDisplayed();			//TC13
	if(displaybutton==true)
	{
		System.out.println("Button is Displayed");
	}
	else
	{
		System.out.println("Button is not Displayed");
	}
		
	String buttonName=continueButton.getText();					//TC14
	System.out.println(buttonName);
	if(buttonName.equals("Continue"))
	{
		System.out.println("Text is same as Requirement:-"+buttonName);
	}
	else
	{
		System.out.println("Text is not same as Requirement:-"+buttonName);
	}
		
	continueButton.click();                                         //TC14		
	
	Thread.sleep(3000);  						//screen Shot
	TakesScreenshot ss=(TakesScreenshot)driver;
	File src=ss.getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Users\\ntci\\Documents\\Class\\Automation\\Practice\\Amazon01.jepg");
	FileHandler.copy(src, dest);
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}

	private static void FileHandler(File src, File dest) {
		// TODO Auto-generated method stub
		
	}

}
