package com.inetcrbank.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver driver;
	
	public LoginPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="uid")
	WebElement txtUsername;
	
	@FindBy(name="password")
	WebElement txtPassword;
	
	@FindBy(name="btnLogin")
	WebElement txtbtnLogin;
	
	public void getUsername(String username)
	{
		txtUsername.sendKeys(username);
	}
	public void getPassword(String password)
	{
		txtPassword.sendKeys(password);
	}
	
	public void clickbutton() 
	{
		txtbtnLogin.click();
	}
	
	
	
	
	
	
}

