package pages;

import base.SeleniumDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Admin
{
    @FindBy(xpath="//b[text()='Admin']")
    WebElement adminBtn;

    @FindBy(xpath="//a[@id='menu_admin_Qualifications']")
    WebElement qualificationDropDown;

    @FindBy(xpath="//a[@id='menu_admin_viewSkills']")
    WebElement selDropDown;

    @FindBy(xpath="//input[@id='btnAdd']")
    WebElement addBtn;

    @FindBy(xpath="//input[@id='skill_name']")
    WebElement nameTextField;

    @FindBy(xpath="//*[@id='skill_description']")
    WebElement descriptionTextField;

    @FindBy(xpath="//*[@id='btnSave']")
    WebElement saveBtn;

    @FindBy(xpath="//a[text()='C# Skills']")
    WebElement actualLink;

    public Admin(WebDriver driver)
{
    PageFactory.initElements(driver,this);
}
public void clickOnAdminBtn()
{
    adminBtn.click();
}
public void clickQualification()
{
    qualificationDropDown.click();
}
public void selectSkill(String abc)
{
    Actions act=new Actions(SeleniumDriver.GetDriver());
    act.moveToElement(selDropDown).click().perform();

}
public void clickAddBtn()
{
    addBtn.click();
}
public void enterName(String name)
{
    nameTextField.sendKeys(name);
}
public void addDescription(String description)
{
   descriptionTextField.sendKeys(description);
}
public void clickOnSaveBtn()
{
    saveBtn.click();
}
public void checkSkillsUpdated(String expected)
{
    String actual=actualLink.getText();
    Assert.assertEquals(actual,expected);
}

}
