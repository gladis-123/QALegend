package testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.BaseClass;
import utilties.ExcelUtilityQ;

public class ResetPageTest extends BaseClass
{
	@Test
	public void verify_error_msg_withinvalidemail() throws IOException 
	{
		
	
String email=ExcelUtilityQ.get_String_Data(0, 0, "Reset");
WebElement forgot_password=driver.findElement(By.xpath("//a[@class='btn btn-link']"));
forgot_password.click();
WebElement email_fld=driver.findElement(By.xpath("//input[@id='email']"));
email_fld.sendKeys(email);
 
 WebElement send_password=driver.findElement(By.xpath("//button[@type='submit']"));
 send_password.click();
 
	}
	@Test
 public void verify_error_msg_withvalidemail() throws IOException
 {
	 String email1=ExcelUtilityQ.get_String_Data(0, 0, "Reset1");
	 WebElement forgot_password=driver.findElement(By.xpath("//a[@class='btn btn-link']"));
	 forgot_password.click();
	 WebElement email_fld=driver.findElement(By.xpath("//input[@id='email']"));
	 email_fld.sendKeys(email1);
	
	  
	  WebElement send_password=driver.findElement(By.xpath("//button[@type='submit']"));
	  send_password.click();
	  WebElement msg=driver.findElement(By.xpath("//div[@class='alert alert-success']"));
	  String actualresult=msg.getText();
	  String expectedresutl="We have e-mailed your password reset link!";
	  Assert.assertEquals( actualresult, expectedresutl,"incorrect email"); 
 }
	}

