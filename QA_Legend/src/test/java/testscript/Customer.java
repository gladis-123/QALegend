package testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import automationcore.BaseClass;
import utilties.ExcelUtilityQ;

public class Customer extends  BaseClass
{
	@Test
	public void user_management_page() throws IOException
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
		WebElement usermanagement=driver.findElement(By.xpath("//span[text()='User Management']"));
		usermanagement.click();
	
	
		WebElement user=driver.findElement(By.xpath("//a[@href='https://qalegend.com/billing/public/users']"));
		user.click();
		WebElement add_button=driver.findElement(By.xpath("//a[@class='btn btn-block btn-primary']"));
		 add_button.click();
		 WebElement miss=driver.findElement(By.xpath("//input[@id='surname']"));
		 miss.sendKeys("miss");
		 WebElement first_name=driver.findElement(By.xpath("//input[@id='first_name']"));
		 first_name.sendKeys("anitha");
		 WebElement last_name=driver.findElement(By.xpath("//input[@id='last_name']"));
		 last_name.sendKeys("tommy");
		 WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		 email.sendKeys("anithatommy@gmail.com");
		// WebElement admins=driver.findElement(By.xpath("//span[@id='select2-role-container']"));
		// Select select1=new Select (admins);
		// select1.selectByVisibleText("Admin");
		 
		 WebElement user_name=driver.findElement(By.xpath("//input[@id='username']"));
		 user_name.sendKeys("anitha");
		 WebElement pass_word=driver.findElement(By.xpath("//input[@id='password']"));
		 pass_word.sendKeys("tommya");
		 WebElement confirm_password=driver.findElement(By.xpath("//input[@name='confirm_password']"));
		 confirm_password.sendKeys("tommya");
		 WebElement percent=driver.findElement(By.xpath("//input[@id='cmmsn_percent']"));
		 percent.sendKeys("72");
		 WebElement save=driver.findElement(By.xpath("//button[@id='submit_user_button']"));
		 save.click();
		 
		
		
	}
}
