package utilties;

import java.awt.Desktop.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility
{
public static void select_value_operation(WebElement element, String text)
{
	Select select=new Select(element);
	select.selectByVisibleText(text);
}
public static void select_value_index(WebElement element, String index)
{
	Select select=new Select(element);
	select.selectByIndex(0);
}	

public static void select_by_getoptin(WebElement element )
{
	Select select=new Select(element);
	select.getOptions();
}	
public static void select_first_option(WebElement element )
{
	Select select=new Select(element);
	select.getFirstSelectedOption();
	
}
public static void right_click_operation(WebDriver driver,WebElement element)
{
	Actions action=new Actions (driver);
	action.contextClick(element).build().perform();
}
	
public static void rdouble_click_operation(WebDriver driver,WebElement element)
{
	Actions action=new Actions (driver);
	action.contextClick(element).build().perform();
}	

}
