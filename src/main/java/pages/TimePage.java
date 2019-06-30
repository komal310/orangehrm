package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TimePage 
{
	WebDriver driver;
	@FindBy(className="time[startingDays]")
	WebElement selectDay;
	
	public TimePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void selectDayDropDown(String s)
	{
		Select select=new Select(selectDay);
		select.selectByVisibleText(s);	
	}
	public Boolean checkElementPresent()
	{
	if(selectDay.isDisplayed())
	{
		return true;
	}
	else
	{
		return false;
	}
	}

}
