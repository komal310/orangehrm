package base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;



public class SeleniumDriver
{
	
	
	private static SeleniumDriver seleniumdriver;
	private static WebDriver driver;
	private static WebDriverWait waitdriver;
	private final static int Timeout=30;
	
	private SeleniumDriver()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandip\\Downloads\\chromedriver_w\\chromedriver.exe");//\System.getProperty("user.dir")+"\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		waitdriver=new WebDriverWait(driver,Timeout);

	}
	
	public static void OpenPage(String url)
	{
		driver.get(url);
	}
	public static WebDriver GetDriver()
	{
		return driver;
		
	}
	public static void SetUpDriver()
	{
		if(seleniumdriver==null) {
			System.out.println("In Selenium webdribver sandip");
			seleniumdriver = new SeleniumDriver();
		}
	}
	public static void TearDown()
	{
		if(seleniumdriver!=null)
		{
			driver.close();
			driver.quit();
		}
		seleniumdriver=null;
		
	}
	
	public static WebDriverWait WaitDriver() 
	{
		return waitdriver;
	}
	

	
	
}
