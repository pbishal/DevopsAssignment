package com.Amazon.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage 
{
	//encapsulation = private data + public method
	
	private WebDriver driver;
	
	//initialize driver
	
	public HomePage(WebDriver driver)//base class driver
	{
		this.driver = driver;
	}
	
	// Data Member(Locater)
	private By link = By.xpath("//span[@id='nav-link-accountList-nav-line-1']");
	
	
	//Method(Functionality Test)
	public String getAppUrl()
	{
		return driver.getCurrentUrl();	
	}
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	public String getStatusOfLink()
	{
		driver.findElement(link).click();
		return driver.getCurrentUrl();
	}
}
