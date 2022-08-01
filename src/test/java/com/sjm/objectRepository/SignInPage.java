package com.sjm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

	public  WebDriver driver;
	
	
	public  SignInPage(WebDriver driver) {
	this.driver= driver;	
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name=\"uid\"]")
	public WebElement userNameTextBox;
	
	@FindBy(xpath = "//input[@name=\"password\"]")
	public WebElement password;
	
	@FindBy(xpath = "//input[@name=\"btnLogin\"]")
	public WebElement signInButton;
	
	@FindBy(xpath = "//a[text=\"Log out\"]")
	public WebElement logoutBtn;
	
	
	public void userName(String uname) {
		userNameTextBox.sendKeys(uname);
	}
	
	public void sendPassword(String passwd) {
		password.sendKeys(passwd);
	}
	
	public void finalClickButton() {
		signInButton.click();
	}
	
	
	public void logoutButton() {
			logoutBtn.click();
	}
	
}
	

 






