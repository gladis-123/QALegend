package testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.BaseClass;
import constants.Constants;
import constants.Messages;
import pageobject.HomePage;
import pageobject.LoginPage;
import pageobject.ResetPage;
import utilties.ExcelUtilityQ;

public class ResetPageTest extends BaseClass
{
	@Test
	public void verify_error_msg_with_validemail() 
	{
		
		String email_id=ExcelUtilityQ.get_String_Data(0, 0, Constants.VALIDRESETPAGE);
		 LoginPage login=new LoginPage(driver);
		 ResetPage reset=login.Click_Onforgot_password();
		 reset.enter_emailId(email_id);
		 reset.click_onReset_Button();
		 String expected_result=ExcelUtilityQ.get_String_Data(1, 0, Constants.VALIDRESETPAGE);
		 String actual_result=reset.get_SuccessMessage_Display();
		 Assert.assertEquals(actual_result,expected_result,Messages.RESETPASS );
	}
	
//WebElement success_msg=driver.findElement(By.xpath("//div[@class='alert alert-success']"));
//String actual_msg=success_msg.getText();
//String expected_result="We have e-mailed your password reset link!";
//Assert.assertEquals(actual_msg, expected_result,"invalid msg");

	

/*WebElement forgot_password=driver.findElement(By.xpath("//a[@class='btn btn-link']"));
forgot_password.click();
WebElement email_fld=driver.findElement(By.xpath("//input[@id='email']"));
email_fld.sendKeys(email);
 
 WebElement send_password=driver.findElement(By.xpath("//button[@type='submit']"));
 send_password.click();*/
 
	@Test
 public void verify_error_msg_with_invalidemail()  
 {
 String email=ExcelUtilityQ.get_String_Data(0, 0, Constants.INVALIDRESETPAGE);
 LoginPage login=new LoginPage(driver);
 ResetPage reset=login.Click_Onforgot_password();
 reset.enter_emailId(email);
 reset.click_onReset_Button();
 String actual_result=reset.getError_MessageText(email);
 String expectederror_msg=ExcelUtilityQ.get_String_Data(1, 0, Constants.INVALIDRESETPAGE);
 String expected_result=expectederror_msg;
 Assert.assertEquals(actual_result, expected_result, Messages.RESETFAILED);
 
 }
}
		
	

