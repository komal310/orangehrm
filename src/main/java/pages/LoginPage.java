package pages;
import base.SeleniumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage 
{
	
	
	@FindBy(xpath="//input[@id='txtUsername']")
	static
	WebElement userName;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	static
	WebElement password;
	
	@FindBy(xpath="//input[@id='btnLogin']")
	static
	WebElement loginBtn;

	@FindBy(xpath="//span[@id='spanMessage']")
	static
	WebElement actualErrror;



	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		System.out.println(driver);
		System.out.println(userName);
	}
	
	
	public void populateUserName(String uname)
	{

	
		userName.sendKeys(uname);

	}
	public static void populatePassword(String pass) 
	{

		password.sendKeys(pass);

	}
	public static void clickOnLogin() 
	{

		loginBtn.click();
	

	}
	
	
	public void refreshLogin(WebDriver driver) 
	{
		driver.navigate().back();
	
	}
	public void verifyError(String exp)
	{
		 String str =  actualErrror.getText();
		Assert.assertEquals(str,exp);

	}
}
