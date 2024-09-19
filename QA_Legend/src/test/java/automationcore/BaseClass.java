package automationcore;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import constants.Constants;

public class BaseClass {
	
	public WebDriver driver;
	public FileInputStream file;
	 public Properties prop;
	public void initilizeBrowser(String browsername)
	{
		 prop=new Properties();
		 try {
			file=new FileInputStream(Constants.CONFIGFILE);
			try {
				prop.load(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (browsername.equals("Chrome"))
		{
			driver=new ChromeDriver();
			
		}
		else if( browsername.equals("EdgeDriver"))
		{
			driver=new EdgeDriver();
		}
		else if(browsername.equals("Firefox"))
		{
			driver= new FirefoxDriver();
			
		}
		else 
		{
			throw new RuntimeException("Invalid Browser received");
		}
			driver.manage().window().maximize();
			//driver.get("https://qalegend.com/billing/public/home");
			driver.get(prop.getProperty("url"));
		}
		@BeforeMethod(alwaysRun=true)
		public void setup()
		{
		initilizeBrowser("Chrome");//this method
		
		}
		@AfterMethod(alwaysRun=true)
		public void closeBrowser(ITestResult result) throws IOException
		{
			if(result.getStatus()==ITestResult.FAILURE)
			
			{
				takeScreeenshot(result);
			}
			//driver.close();
			
		}
		public void takeScreeenshot(ITestResult result) throws IOException
		
		{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screenshot=ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenshot, new File("./Screenshor/"+result.getName()+".png"));//create a folder for save screenshots
		}

}
