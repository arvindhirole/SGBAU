package SetUp;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.opera.OperaDriver;

public class Base {

	
	
	    //Repetative Broswers code
	
	public static WebDriver openOperaBrowser()
	{
		System.setProperty("webdriver.opera.driver","C:\\Program Files\\selenium\\opera\\operadriver_win64\\operadriver.exe");
		WebDriver driver= new OperaDriver();
		 return driver;
	}
	
	public static WebDriver openChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\selenium\\latest veriosn chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		return driver ;
	}
	
	//repetative Screenshot code
	public static void screenshots(WebDriver driver,String Filename)
	{
		try {
		TakesScreenshot take=(TakesScreenshot)driver;
		File src=take.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\ntci\\eclipse-workspace\\MavenProject\\src\\test\\java\\ScreenShots\\screenshots"+Filename+".jpeg");
		FileHandler.copy(src, dest);
		System.out.println("screen shot taked");
			}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	
}
