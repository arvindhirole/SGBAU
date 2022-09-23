package SGBAU;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Result {

	//WebElements
	
			private WebDriver driver ;
	
			@FindBy (xpath="//select[@id='session']")
			private WebElement session ;
			
			@FindBy (xpath="//select[@id='coursetype']")
			private WebElement courseType ;
			
			@FindBy (xpath="//button[@type='button']")
			private WebElement course ;
			
			@FindBy (xpath="//a[@id='bs-select-1-10']")
			private WebElement electrical ;
			
			@FindBy (xpath="//select[@id='resulttype']")
			private WebElement resultType ;
			
			@FindBy (xpath="//input[@class='form-control required']")
			private WebElement rollNum ;
			
			@FindBy (xpath="//select[@id='semester']")
			private WebElement semester ;
			
			@FindBy (xpath="//select[@id='semester']")
			private WebElement sem ;
			
			@FindBy (xpath="//i[@class='fa fa-search-plus']")
			private WebElement search ;
			
			//Constructor
			 public Result(WebDriver driver)
			 {
				 PageFactory.initElements(driver, this);
				 this.driver=driver ;
			 }
			 
			 //Methods
			 public void selectSesssion()
			 	{
				 session.click();
				 Select s=new Select(session);
				 s.selectByVisibleText("Summer 2022");
			 	}
	
			 public void selectCourseType() 
			 	{
				 courseType.click();
				 Select s=new Select(courseType);
				 s.selectByValue("2");
				
			 	}
			 
			 public void selectCourse() 
			 	{
				 course.click(); 
			 	}
			 public void selectBranch()
				 {
				 electrical.click();
				 }
			 public void selectResultType()
			 	{
				 resultType.click();
				 Select r=new Select(resultType);
				 r.selectByVisibleText("Regular");
			 	}
			 
			 public void sendRollNum()
			 	{
				 rollNum.sendKeys("21BF710099");
			 	}
			 
			 public void selectSemester() 
			 	{
				 semester.click();
			 	}
			 
			 public void selectSem() 
			 	{
				
				 sem.click();
			 	}
			 
			 public void clickSearch()
			 	{
				 boolean button=search.isEnabled();
				 if(button==true)
				 {
					 System.out.println("Result button id Enabled");
				 }
				 else
				 {
					 System.out.println("Result button id not Enabled");
				 }
				 search.click();
				 
				 
			 	}
			 
			 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		
	}

}
