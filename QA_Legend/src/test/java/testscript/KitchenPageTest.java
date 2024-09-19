package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.BaseClass;
import constants.Constants;
import constants.Messages;
import pageobject.HomePage;
import pageobject.KitchenPage;
import pageobject.LoginPage;
import utilties.ExcelUtilityQ;

public class KitchenPageTest extends BaseClass{
	@Test
public void kitchen_order() throws IOException
{
	String username=ExcelUtilityQ.get_String_Data(0, 0, Constants.LOGINPAGE);
	String password=ExcelUtilityQ.get_Integer_Data(0, 1, Constants.LOGINPAGE);
	 String expected_result=Constants.NUMBER+ExcelUtilityQ.get_Integer_Data(0, 0, Constants.KITCHEIDNNUMBER);
	
	LoginPage login=new LoginPage (driver);
	login.enter_Username(username);
	login.enter_Password(password);
	HomePage homepage=login.click_onLogin_Button();
	 homepage.clic_ONalertButton();
	 KitchenPage kitchen= homepage.click_on_kitchenorder();
	 kitchen.clik_on_markascooked();
	// kitchen.clik_on_okbutton();
	 kitchen.click_on_cancel();
	 String actual_result=kitchen.get_Data();
	 Assert.assertEquals(actual_result, expected_result,Messages.ORDER);

	
}
}
