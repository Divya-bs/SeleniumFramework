package com.sjm.test;


import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.sjm.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	Logger logger;
	ReadConfig readconfig=new ReadConfig();
	String BaseURL=readconfig.getApplicationURL();
	String Baseusername=readconfig.getUsername();
	String Basepassword=readconfig.getPassword();
	
   

	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    logger = Logger.getLogger("KsrtcApplicationTest");
	    PropertyConfigurator.configure("logfile.properties.txt");
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
		
	}
}




