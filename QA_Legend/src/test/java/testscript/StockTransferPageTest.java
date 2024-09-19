package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.BaseClass;
import constants.Constants;
import constants.Messages;
import pageobject.HomePage;
import pageobject.ListAllStockPage;
import pageobject.LoginPage;
import pageobject.StockTransferPage;
import utilties.ExcelUtilityQ;

public class StockTransferPageTest extends BaseClass{
	@Test
	public void verify_search_stock_location() throws IOException
	{
		String username=ExcelUtilityQ.get_String_Data(0, 0, Constants.LOGINPAGE);
		String password=ExcelUtilityQ.get_Integer_Data(0, 1, Constants.LOGINPAGE);   
		String stocks=ExcelUtilityQ.get_String_Data(0, 0, Constants.STOCKTRANSFER);
		LoginPage login=new LoginPage (driver);
		login.enter_Username(username);
		login.enter_Password(password);
		HomePage homepage=login.click_onLogin_Button();
		 homepage.clic_ONalertButton();
		 StockTransferPage stocktransfer=homepage.click_On_Stock_Transfer();
		 ListAllStockPage liststock=stocktransfer.click_On_List_Stock_Transfer();
		 liststock.Enter_Searh_Item(stocks);
		 String actualdata=liststock.get_Table_Data();
		 Assert.assertEquals(actualdata, stocks,Messages.INVALIDSTOCKSEARCH);
}
}