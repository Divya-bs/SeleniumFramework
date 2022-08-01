package com.sjm.test;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

import com.sjm.objectRepository.SignInPage;

public class SignInTest extends BaseClass {

	
 @Test
 public void loginTest() {
	 driver.get(BaseURL);
	String expectedURL= "https://demo.guru99.com/V1/index.php";
	String actualURL="https://demo.guru99.com/V1/index.php";
	assertEquals(expectedURL, actualURL);
	logger.info("URL Lodded");
	
    System.out.println("URL verified");
	
	 driver.manage().window().maximize();
	 SignInPage sp=new SignInPage(driver);
	 sp.userName(Baseusername);
	logger.info("Username Lodded");
	 sp.sendPassword(Basepassword);
	logger.info("Password lodded");
	 sp.finalClickButton();
	}
 
}
