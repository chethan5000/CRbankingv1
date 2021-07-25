package com.inetcrbank.testCases;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import com.inetcrbank.utilities.readConfig;

public class baseModel 
{
	readConfig rC = new readConfig();
	
	public String baseURL=rC.getbaseURL();
	public String username=rC.getUsername();
	public String password=rC.getPassword();
	rC.
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeClass
	public void setUP() 
	{
		System.setProperty("webdriver.chrome.driver",rC.getchbrowse());
		driver = new ChromeDriver();
		logger = Logger.getLogger("CRbanking");
		PropertyConfigurator.configure("log4j.properties");
		
	}
	
	public void teardown() 
	{
		driver.quit();
	}
	
}
