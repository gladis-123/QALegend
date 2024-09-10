package testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import automationcore.BaseClass;
import utilties.ExcelUtilityQ;

public class NewlyAdded extends BaseClass
{
	@Test
public void enter_newly_added_user() throws IOException
{
	String excel=ExcelUtilityQ.get_String_Data(0, 0, "Newuser");
	WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
	String actualr=excel;
	username.sendKeys(actualr);
	String excel1=ExcelUtilityQ.get_String_Data(0, 1, "Newuser");
	WebElement password=driver.findElement(By.xpath("//input[@id='password']"));

	password.sendKeys(excel1);
	WebElement login=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	login.click();
	WebElement endtour=driver.findElement(By.xpath("//button[@class='btn btn-default btn-sm']"));
	endtour.click();
}
}
