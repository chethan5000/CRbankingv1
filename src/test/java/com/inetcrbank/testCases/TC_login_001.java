package com.inetcrbank.testCases;

import org.testng.annotations.Test;

import com.inetcrbank.pageObject.LoginPage;

import junit.framework.Assert;

public class TC_login_001 extends baseModel
{
	
	@Test
	public void login() 
	{	
		LoginPage lp = new LoginPage(driver);
		driver.get(baseURL);
		logger.info("logged into URL");
		
		lp.getUsername(username);
		lp.getPassword(password);
		lp.clickbutton();
		
		if(driver.getTitle().equals("")) 
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertFalse(false);
		}
		
	}
}
