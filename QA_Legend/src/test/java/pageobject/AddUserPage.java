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
	WebElement prefix_fld;
	@FindBy(xpath="//input[@id='first_name']")
	WebElement firstname_field;
	@FindBy(xpath="//input[@id='last_name']")
	WebElement lastname_field;
	@FindBy(xpath="//input[@id='email']")
	WebElement email_field;
	@FindBy(xpath="//b[@role='presentation']")
	WebElement role_field;
	@FindBy(xpath="//input[@id='username']")
	WebElement username_field;
	@FindBy(xpath="//input[@id='password']")
	WebElement password_field;
	@FindBy(xpath="//input[@id='confirm_password']")
	WebElement confirm_passwordfield;
	@FindBy(xpath="//button[@id='submit_user_button']")
	WebElement save_button_field;
	
	
	
	
	public void add_userDatas(String fname, String lname, String email, String uname, String passwd, String confirmpasswd )
	{
		prefix_fld.sendKeys("Mrs");
		firstname_field.sendKeys(fname);
		lastname_field.sendKeys(lname);
		email_field.sendKeys(email);
		//PageUtility.select_TextOperation(role_field,"Producer" );
		role_field.click();
		username_field.sendKeys(uname);
		password_field.sendKeys(passwd);
		confirm_passwordfield.sendKeys(confirmpasswd);
	}
	
	/*public void prefix_Box()
	{
		prefix_fld.sendKeys("Mrs");
	}
	public void enter_FirstName(String fname)
	{
		firstname_field.sendKeys(fname);
	}
	public void enter_LastName(String lname)
	{
		lastname_field.sendKeys(lname);
	}
	public void enter_EmailAddress(String email)
	{
		email_field.sendKeys(email);
	}
	public void role_FieldSelection()
	{
		//	String dropdown=PageUtility.select_TextOperation(role_field, "Producer");

		role_field.click();
	}
	public void enter_UserName(String uname)
	{
		username_field.sendKeys(uname);
	}
	public void enter_Password(String passwd)
	{
		password_field.sendKeys(passwd);
	}
	public void enter_ConfirmPassword(String confirmpasswd)
	{
		confirm_passwordfield.sendKeys(confirmpasswd);
	}*/
	public UsersPage ClickOn_SaveButton()
	{
		save_button_field.click();
		return new UsersPage(driver);
	
	}
}

	
	
	
	
	
	
	
	
	
	

