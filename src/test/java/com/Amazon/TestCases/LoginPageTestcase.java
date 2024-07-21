package com.Amazon.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPageTestcase extends BaseClass{
  @BeforeClass
  public void pageSetup()
  {
	  hp.getStatusOfLink();
  }
  @Test
  public void ValidateLogin() {
	  String url = lp.doLogin("pbishal60@gmail.com");
	  Assert.assertTrue(url.contains("signin"), "Test Fail: LoginFail");
	  System.out.println("Test Pass: email entered successfully");
  }
}
