package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.LoginPage;
import base.SeleniumDriver;

public class LoginSteps

{
    LoginPage Log = new LoginPage(SeleniumDriver.GetDriver());

	@Given("^I am on login page of \"([^\"]*)\" of OrangeHRM website$")
	public void i_am_on_login_page_of_of_OrangeHRM_website(String url) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		SeleniumDriver.OpenPage(url);
	}

	@When("^I enter \"([^\"]*)\"on usernametext$")
	public void i_enter_on_usernametext(String uname) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
        Log.populateUserName(uname);
	}

	@And("^I enter the \"([^\"]*)\"on passtext$")
		public void i_enter_the_on_passtext(String pass) throws Throwable
	{
	
		LoginPage.populatePassword(pass);
	    // Write code here that turns the phrase above into concrete actions
	 
	}

	@And("^I click on loginBtn$")
	public void i_click_on_loginBtn() throws Throwable
	{
		LoginPage.clickOnLogin();
	    
	}
	@And("^I verify that error message is displayed \"([^\"]*)\" after login$")
	public void i_verify_error(String error) throws Throwable
	{
		Log.verifyError(error);

	}
	
	}
