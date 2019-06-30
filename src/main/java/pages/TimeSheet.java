package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimeSheet 
{
	WebDriver driver;
	@FindBy(id="employee")
	WebElement empName;
	@FindBy(id="btnView")
	WebElement viewBtn;
	
	public TimeSheet(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void enterEmployeeName(String emp)
	{
		empName.sendKeys(emp);
	}
	public void clickOnViewBtn()
	{
		viewBtn.click();
	}
	

}
