package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserPage {

	WebDriver driver;
	public AddUserPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='surname']")
	WebElement  prefix;
	@FindBy(xpath="//input[@id='first_name']")
	WebElement fst_name_fld;
	@FindBy(xpath="//input[@id='last_name']")
	WebElement last_name_fld;
	@FindBy(xpath="//input[@id='email']")
	WebElement  email1;
	@FindBy(xpath="//b[@role='presentation']")
	WebElement role_field;
	@FindBy (xpath="//input[@id='username']")
	WebElement  user_name_fld;
	@FindBy(xpath="//input[@id='password']")
	WebElement pass_word;
	@FindBy(xpath="//input[@name='confirm_password']")
	WebElement confirm_password;
	@FindBy(xpath="//input[@id='cmmsn_percent']")
	WebElement percent;
	@FindBy(xpath="//button[@id='submit_user_button']")
	WebElement  save;
	public void prefix_Box()
	{
		prefix.sendKeys("Mrs");
	}
	public void enter_FirstName(String fname)
	{
		fst_name_fld.sendKeys(fname);
	}
	public void enter_LastName(String lname)
	{
		last_name_fld.sendKeys(lname);
	}
	public void enter_EmailAddress(String email)
	{
		email1.sendKeys(email);
	}
	public void role_FieldSelection()
	{
		//	String dropdown=PageUtility.select_TextOperation(role_field, "Producer");

		role_field.click();
	}
	public void enter_UserName(String uname)
	{
		user_name_fld.sendKeys(uname);
	}
	public void enter_Password(String passwd)
	{
		pass_word.sendKeys(passwd);
	}
	public void enter_ConfirmPassword(String confirmpasswd)
	{
		confirm_password.sendKeys(confirmpasswd);
	}
	public UsersPage ClickOn_Save()
	{
		save.click();
		return new UsersPage(driver) ;
	}

	
	
	
	
	
	
	
	
	
	
}
