package com.Amazon.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Amazon.Utility.Utility;

public class LoginPage {
	private WebDriver driver;
	
	//initialize driver
	public LoginPage(WebDriver driver)//base class session Driver
	{
		this.driver = driver;
	}
	
	//Locators
	private By email = By.xpath("//input[@id='ap_email_login']");
	private By contBtn = By.xpath("//input[@type='submit']");
	private By password = By.xpath("//input[@id='ap_password']");
	private By loginBtn = By.xpath("//input[@id='signInSubmit']");
	
	public String doLogin(String em)
	{
		driver.findElement(email).sendKeys(em);
		driver.findElement(contBtn).click();
		Utility.getScreenshot(driver);
		return driver.getCurrentUrl();
	}
}
