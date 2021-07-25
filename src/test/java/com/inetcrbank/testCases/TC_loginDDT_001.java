package com.inetcrbank.testCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetcrbank.pageObject.LoginPage;
import com.inetcrbank.utilities.CRExcell;

public class TC_loginDDT_001 extends baseModel

{
	@Test(dataProvider="logindata")
	public void loginDDT(String user, String pwd) 
	{
		LoginPage lp = new LoginPage(driver);
		lp.getUsername(user);
		
	}
	
	@DataProvider(name="logindata")
	String [][] getData() throws IOException
	{
		String path="";
		int rownum=CRExcell.getRowcount(path, "Sheet1");
		int colnum=CRExcell.getColcount(path, "Sheet1", 1);
		
		String logindata [][] = new String [rownum][colnum];
		
		for(int i=1;i<=rownum;i++) 
		{
			for(int j=0;j<colnum;j++) 
			{
				logindata [i-1][j] = CRExcell.getcelldata(path, "Sheet1", i, j);
			}
		}
		return logindata;
	}

}
