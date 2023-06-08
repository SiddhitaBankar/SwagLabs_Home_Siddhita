package com.pages;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Utility;
public class LoginPage extends Utility 
{
	@FindBy(name="user-name")
	WebElement Username;  
	
	@FindBy(name="password")
	WebElement Password; 
	
	@FindBy(xpath="//input[@id='login-button']")
	WebElement login;  
	
	
	public LoginPage() throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginUserName(String un) 
	{
		Username.sendKeys(un);
	}	
	
	public void loginPassword(String pw) 
	{
		Password.sendKeys(pw);
	}	
	
	public LoginPage loginButton() throws IOException
	{
		login.click();
		return new LoginPage();
	}
	
	public String validateLoginPageTitle()
	{
		return driver.getTitle(); 
	}

	public String validatefirstproductTitle()
	{
		return driver.getTitle();
	} 
	
}