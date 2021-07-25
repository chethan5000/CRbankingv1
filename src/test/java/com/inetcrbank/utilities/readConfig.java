package com.inetcrbank.utilities;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

public class readConfig 
{
	Properties pro;
	
	public readConfig() 
	{
				
		File src = new File("./Configuation/Config.properties");
		
		try 
		{
			FileInputStream fs = new FileInputStream(src);
			 pro = new Properties();
			 pro.load(fs);
		} 
		catch (Exception e) 
		{
			
			System.out.println(e.getMessage());
		}
	
	}
	
	public String getbaseURL() 
	{
		String url =pro.getProperty("baseURL");
		return url;

	}
	public String getUsername() 
	{
		String uname =pro.getProperty("username");
		return uname;

	}
	public String getPassword() 
	{
		String passw =pro.getProperty("password");
		return passw;

	}
	public String getchbrowse() 
	{
		String cbros =pro.getProperty("password");
		return cbros;

	}
}
