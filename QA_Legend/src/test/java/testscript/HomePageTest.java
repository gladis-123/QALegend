package testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.BaseClass;
import utilties.ExcelUtilityQ;

public class HomePage extends  BaseClass

{
	@Test
	public void dateexamine() throws IOException
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
driver.get("https://qalegend.com/billing/public/home");	
WebElement date=driver.findElement(By.xpath(" //strong[text()='01-09-2024']"));
String actual=date.getText();
String expected="01-09-2024";
Assert.assertEquals( actual, expected,"wrong"); 
}
}