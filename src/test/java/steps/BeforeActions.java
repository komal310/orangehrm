package steps;

import base.SeleniumDriver;
import cucumber.api.java.Before;

public class BeforeActions
{
@Before
 public static void setUp()
 {
	 System.out.println("before");
	 SeleniumDriver.SetUpDriver();
 }
}
