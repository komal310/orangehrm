package tests;


import org.testng.annotations.Test;

import base.DriverManager;
import pages.LoginPage;

public class LoginTest extends DriverManager{
	@Test
	public void testLogin()
	{
		LoginPage loginPage=new LoginPage(driver);
		loginPage.populateUserName();
		loginPage.populatePassword();
		loginPage.clickOnLogin();
	}
}
