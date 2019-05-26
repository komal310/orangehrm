package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage 
{
	//WebDriver driver;
	@FindBy(xpath="//a[@href='/index.php/time/viewTimeModule']")
	WebElement timeDropDown;
	
	public DashBoardPage(WebDriver driver )
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnTime() 
	{
		timeDropDown.click();
	}

}
