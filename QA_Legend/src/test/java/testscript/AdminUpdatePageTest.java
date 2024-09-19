package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.BaseClass;
import constants.Constants;
import constants.Messages;
import pageobject.AdminUpdatePage;
import pageobject.HomePage;
import pageobject.LoginPage;
import utilties.ExcelUtilityQ;



public class AdminUpdatePageTest extends BaseClass{
	
	
	@Test
	public void update() throws IOException 
	{
		
	
	String username=ExcelUtilityQ.get_String_Data(0, 0, Constants.LOGINPAGE);
	String password=ExcelUtilityQ.get_Integer_Data(0, 1, Constants.LOGINPAGE);
	String adminupdated=ExcelUtilityQ.get_String_Data(0, 0, Constants.UPDATEADMIN);
	String actualr=ExcelUtilityQ.get_String_Data(1, 0, Constants.UPDATEMSG); 
	LoginPage login=new LoginPage (driver);
	login.enter_Username(username);
	login.enter_Password(password);
	HomePage homepage=login.click_onLogin_Button();
	homepage.clic_ONalertButton();
	homepage.click_On_Adminabc();
	AdminUpdatePage adminupdate=homepage.click_On_Profile_Field();
    adminupdate.enter_update_Lastname(adminupdated);
	adminupdate.verify_Update_Button();	
	String expectedr=adminupdate.verify_Get_Message();
	Assert.assertEquals(actualr,expectedr,Messages.UPDATESUCCESS);
	
 
}
}