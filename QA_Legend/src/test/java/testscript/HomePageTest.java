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
import utilties.ExcelUtilityQ;

public class HomePageTest extends  BaseClass

{
	@Test
	public void date_examine() throws IOException
	{
		String username=ExcelUtilityQ.get_String_Data(0, 0, Constants.LOGINPAGE);
		String password=ExcelUtilityQ.get_Integer_Data(0, 1, Constants.LOGINPAGE);
		String expected_result=Constants.MESSAGE+ExcelUtilityQ.get_String_Data(1, 0, Constants.LOGINPAGE)+Constants.LOGINPAGEEXTENSION;
		LoginPage login=new LoginPage (driver);
		login.enter_Username(username);
		login.enter_Password(password);
		HomePage homepage=login.click_onLogin_Button();
		 homepage.clic_ONalertButton();
		 String homepage_Date=homepage.get_LoginDate();
		 String current_date=homepage.get_CurrentDate();
		 Assert.assertEquals(homepage_Date, current_date, Messages.DATE);
}
}