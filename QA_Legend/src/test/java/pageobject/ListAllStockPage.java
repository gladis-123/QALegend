package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilties.WaitUtility;

public class ListAllStockPage {
	WebDriver driver;
	public ListAllStockPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);    
	}
	
	@FindBy(xpath="//input[@class='form-control input-sm']")
	WebElement stocksearchbar;
	@FindBy(xpath="//table[@id='stock_transfer_table']/tbody/tr[2]/td[3]")
	WebElement tabledata;
	@FindBy(xpath="//table[@id='stock_transfer_table' ]/tbody/tr[2]/td[8]")
	WebElement viewstock;
	
	
	
	public void Enter_Searh_Item(String stocksearch) 
	{
		stocksearchbar.sendKeys(stocksearch);
	}
	public String get_Table_Data() 
	{
			WaitUtility.wait_for_element(driver, tabledata);
			String result=tabledata.getText();
			return result;
	
	}
	public void verify_View_Required_Stock() 
	{
		viewstock.click();
	}
}
