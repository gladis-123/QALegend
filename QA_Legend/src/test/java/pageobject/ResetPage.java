package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResetPage 
{

	WebDriver driver;
	
	public void resetpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="email")
	WebElement email_fld;
	@FindBy(xpath="//button[@type='submit']")
	WebElement send_password;
	@FindBy (xpath="//div[@class='alert alert-success']")
	WebElement  success_msg;
	@FindBy(xpath="//span[@class='help-block']")
	WebElement error_msgtext;
	
	public void enter_email(String emailid)
	{
		email_fld .sendKeys(emailid);	
		
	}
	public void click_onReset_Button()
	{
		send_password.click();	
	}
	public String get_success_msg_display()
	{
		 String display_message=success_msg.getText();
		return display_message;
	}
	 public String getError_MessageText(String text)
	 {
		 
		String text_error_message=error_msgtext.getText();
		 return text_error_message;
}
}