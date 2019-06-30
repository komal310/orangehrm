package steps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import pages.Admin;
import base.SeleniumDriver;

public class AdmnSteps

{
    Admin admin=new Admin(SeleniumDriver.GetDriver());

    @Given("^I click on Admin btn$")
    public void i_click_on_Admin_btn() throws Throwable {
        admin.clickOnAdminBtn();

    }
    @Given("^I click on Qualifications DropDown$")
    public void i_click_on_Qualifications_DropDown() throws Throwable {
        SeleniumDriver.WaitDriver();
        admin.clickQualification();

    }

    @Given("^I click on \"([^\"]*)\" DropDown$")
    public void i_click_on_Skills_DropDown(String abc) throws Throwable {
        SeleniumDriver.WaitDriver();
        admin.selectSkill(abc);

    }

    @When("^I click on AddBtn$")
    public void i_click_on_AddBtn() throws Throwable {
        admin.clickAddBtn();

    }

    @Then("^I enter \"([^\"]*)\" in NameField$")
    public void i_enter_in_NameField(String name) throws Throwable
    {
        admin.enterName(name);

    }

    @Then("^I enter \"([^\"]*)\" in DescriptionFied$")
    public void i_enter_in_DescriptionFied(String description) throws Throwable {
        admin.addDescription(description);

    }

    @Then("^I click on SaveBtn$")
    public void i_click_on_SaveBtn() throws Throwable
    {
     admin.clickOnSaveBtn();
    }

    @Then("^verify weather skills \"([^\"]*)\" is getting added$")
    public void verify_weather_skills_is_getting_added(String expected) throws Throwable
    {
        admin.checkSkillsUpdated(expected);
    }


}
