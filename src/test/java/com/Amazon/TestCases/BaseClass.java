package com.Amazon.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import com.Amazon.Pages.HomePage;
import com.Amazon.Pages.LoginPage;

public class BaseClass {
	public WebDriver driver;
	public HomePage hp;
	public LoginPage lp;
	@BeforeTest
	public void setup() 
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		hp = new HomePage(driver);
		lp = new LoginPage(driver); 
	}
	

}
