package testscript;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import automationcore.BaseClass;
import dataproviderq.DataProviders;
import utilties.ExcelUtilityQ;

public class LoginPage extends BaseClass 
{
	@Test
	public void user_login_with_validcredentials() throws IOException
	{
		String excel=ExcelUtilityQ.get_String_Data(0, 0, "sheet1");
		WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
		String actualr=excel;
		username.sendKeys(actualr);
		String excel1=ExcelUtilityQ.get_String_Data(0, 1, "sheet1");
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
	
		password.sendKeys(excel1);
		WebElement login=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		login.click();
		WebElement endtour=driver.findElement(By.xpath("//button[@class='btn btn-default btn-sm']"));
		endtour.click();
		
	}
	@Test(dataProvider="InvlaidUserCredentials",dataProviderClass=DataProviders.class)
	public void verify_errormsg_whileLogIn_with_InvalidCredentials(String username1,String password1)
	{
		
		WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
	
		username.sendKeys(username1);
	
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys(password1);
		WebElement login=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		login.click();
		//WebElement endtour=driver.findElement(By.xpath("//button[@class='btn btn-default btn-sm']"));
		//endtour.click();
		
	}
}
