package com.Amazon.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Amazon.Pages.HomePage;

public class HomePageTestCase extends BaseClass
{
  @Test(priority = 1)
  public void verifyUrl() {
	  String actUrl = hp.getAppUrl();
	  Assert.assertTrue(actUrl.contains("amazon"), "Test Fail: Url not matched");
	  System.out.println("Test Pass: Url Matched");
  }
  
  @Test(priority = 2)
  public void verifyTitle() {
	  String actTitle = hp.getAppTitle();
	  Assert.assertTrue(actTitle.contains("Shopping"), "Test Fail: Title not matched");
	  System.out.println("Test Pass: Title Matched");
  }
  
  @Test(priority = 3)
  public void verifySigninLink() {
	  String nextPageUrl = hp.getStatusOfLink();
	  Assert.assertTrue(nextPageUrl.contains("signin"), "Test Fail: Login Page Not Opeded");
	  System.out.println("Test Pass: Application navigating to the login page");
  }
}
