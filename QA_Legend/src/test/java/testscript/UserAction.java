package testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import automationcore.BaseClass;
import utilties.ExcelUtilityQ;

public class UserAction extends  BaseClass
{
	@Test
	public void edit_user_details() throws IOException
	{
	String user_name=ExcelUtilityQ.get_String_Data(0, 0, "HomePage");
	String pass_word=ExcelUtilityQ.get_Integer_Data(0, 1, "HomePage");
	
	WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
    username.sendKeys(user_name);
	WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
    password.sendKeys(pass_word);
	WebElement login=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	login.click();
	WebElement endtour=driver.findElement(By.xpath("//button[@class='btn btn-default btn-sm']"));
	endtour.click();
	WebElement usermanagement=driver.findElement(By.xpath("//span[text()='User Management']"));
	usermanagement.click();
	WebElement user=driver.findElement(By.xpath("//a[@href='https://qalegend.com/billing/public/users']"));
	user.click();
	//WebElement select_name=driver.findElement(By.xpath(""))
	WebElement edit_button=driver.findElement(By.xpath("//a[@href='https://qalegend.com/billing/public/users/3653/edit']"));
	edit_button.click();
	WebElement name_edit=driver.findElement(By.xpath("//input[@name='first_name']"));
	name_edit.sendKeys("lIJISHARQ");
	WebElement last_nmae=driver.findElement(By.xpath("//input[@id='last_name']"));
	last_nmae.sendKeys("VINEETHY");
	WebElement update_button=driver.findElement(By.xpath("//button[@class='btn btn-primary pull-right']"));
	update_button.click();
	
	}
@Test
public void view_button() throws IOException
{
	
		String user_name=ExcelUtilityQ.get_String_Data(0, 0, "HomePage");
		String pass_word=ExcelUtilityQ.get_Integer_Data(0, 1, "HomePage");
		
		WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
	    username.sendKeys(user_name);
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
	    password.sendKeys(pass_word);
		WebElement login=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		login.click();
		WebElement endtour=driver.findElement(By.xpath("//button[@class='btn btn-default btn-sm']"));
		endtour.click();
		WebElement usermanagement=driver.findElement(By.xpath("//span[text()='User Management']"));
		usermanagement.click();
		WebElement user=driver.findElement(By.xpath("//a[@href='https://qalegend.com/billing/public/users']"));
		user.click();
		WebElement user_email=driver.findElement(By.xpath("//td[text()='krece@gmail.com']"));
		user_email.click();
		WebElement search=driver.findElement(By.xpath("//input[@type='search']"));
		search.sendKeys("useremail");
		String useremail=ExcelUtilityQ.get_String_Data(0, 2, "HomePage");
		
		WebElement view=driver.findElement(By.xpath("//a[@href='https://qalegend.com/billing/public/users/3653']"));
		view.click();
	}
public void delete_button() throws IOException
{
	String user_name=ExcelUtilityQ.get_String_Data(0, 0, "HomePage");
	String pass_word=ExcelUtilityQ.get_Integer_Data(0, 1, "HomePage");
	
	WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
    username.sendKeys(user_name);
	WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
    password.sendKeys(pass_word);
	WebElement login=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	login.click();
	WebElement endtour=driver.findElement(By.xpath("//button[@class='btn btn-default btn-sm']"));
	endtour.click();
	WebElement usermanagement=driver.findElement(By.xpath("//span[text()='User Management']"));
	usermanagement.click();
	WebElement user=driver.findElement(By.xpath("//a[@href='https://qalegend.com/billing/public/users']"));
	user.click();
	WebElement delete=driver.findElement(By.xpath("//button[@data-href='https://qalegend.com/billing/public/users/3653']"));
	delete.click();
}
}
