package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id="txtUsername")
	WebElement userName;

	@FindBy(id="txtUsername")
	WebElement userName1;

	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(name="Submit")
	WebElement loginBtn;
	
	@FindBy(name="Submit1")

	WebElement loginBtn1;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void populateUserName()
	{
		userName.sendKeys("Admin");
	}
	
	public void populatePassword() {
		password.sendKeys("admin123");
	}
	
	public void clickOnLogin() {
		loginBtn.click();
	
	}	
}
