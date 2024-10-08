package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitchenPage {
	WebDriver driver;
	public KitchenPage(WebDriver driver)
	{
	this.driver= driver	;
	PageFactory.initElements(driver, this);//to initialize page class.
	}
	@FindBy(xpath="//a[@data-href='https://qalegend.com/billing/public/modules/kitchen/mark-as-cooked/341']")
	WebElement markascooked;
	//@FindBy(xpath="//button[@class='swal-button swal-button--confirm']")
	//WebElement okbutton;
	@FindBy(xpath="//button[@class='swal-button swal-button--cancel']")
	WebElement cancel_button;
	@FindBy(xpath="//h4[text()='#0018']")
	WebElement data;
		

	
	
	public void clik_on_markascooked()
	{
		markascooked.click();
	
		
	}
	public void click_on_cancel()
	{
		cancel_button.click();	
	}
	public String get_Data()
	{
		return data.getText();
	}
}
