package testscript;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.BaseClass;
import constants.Constants;
import constants.Messages;
import dataproviderq.DataProviders;
import pageobject.HomePage;
import pageobject.LoginPage;
import utilties.ExcelUtilityQ;

public class LoginPageTest extends BaseClass 
{
	@Test
	public void user_login_with_validcredentials() throws IOException
	{
		String username=ExcelUtilityQ.get_String_Data(0, 0, Constants.LOGINPAGE);
		String password=ExcelUtilityQ.get_Integer_Data(0, 1, "LoginTest");
		String expected_rlt=ExcelUtilityQ.get_String_Data(1, 0, "LoginTest");
		LoginPage login=new LoginPage (driver);
		login.enter_Username(username);
		login.enter_password(password);
		HomePage homepage=login.click_on_loginButton();
		String actual_result=homepage.getmessage_text();
		Assert.assertEquals(actual_result, expected_rlt,Messages.LOGINFAILED);
		
		
		
		
	}
	@Test(dataProvider="InvlaidUserCredentials",dataProviderClass=DataProviders.class)
	public void verify_errormsg_whileLogIn_with_InvalidCredentials(String username1,String password1) throws IOException
	{
		LoginPage login new=LoginPage(driver);
		login.enter_Username(username1);
		login.enter_password(password1);
		login.click_on_loginButton();
		String actualr=login.get_DisplayMessage();
String Expected_rsilt=ExcelUtilityQ.get_String_Data(1, 1, "LoginTest");
		
		Assert.assertEquals(actualr,Expected_rsilt ,"VALIDCREDENTIALS");
	}
}	
				
		//WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
	
		//username.sendKeys(username1);
	
		//WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		//password.sendKeys(password1);
		//WebElement login=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		//login.click();
		
		//WebElement result=driver.findElement(By.xpath("//strong[text()='These credentials do not match our records.']"));
		//String actualr=result.getText();
		
	//private LoginPage LoginPage(WebDriver driver) {
		// TODO Auto-generated method stub
		//return null;
	

