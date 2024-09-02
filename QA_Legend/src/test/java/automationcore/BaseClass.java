package automationcore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	public WebDriver driver;
	public void initilizeBrowser(String browsername)
	{
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
			driver.get("https://qalegend.com/billing/public/home");
		}
		@BeforeMethod
		public void setup()
		{
		initilizeBrowser("Chrome");//this method
		}

}
