package utilties;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility 
{
public static void wait_for_element(WebDriver driver,WebElement element)
{
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOf(element));
	
}
public static void wait_for_element_tobe_visible(WebDriver driver)
{
	FluentWait wait=new FluentWait(driver);
	wait.withTimeout(Duration.ofSeconds(5));
	}
public static void wait_implisitOperation(WebDriver driver)
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
}
public static void duration_intervel(WebDriver driver)
{
	FluentWait wait= new FluentWait(driver);
	wait.pollingEvery(Duration.ofSeconds(10));
	
}
	public static void nonelement_expectoption(WebDriver driver)
	
	{
		FluentWait wait= new FluentWait(driver);
		wait.ignoring(null);
	}
	}

