package tests;

import org.testng.annotations.Test;

import pages.DashBoardPage;

public class DashboardTest extends LoginTest
{
	@Test
	public void testDashboard() throws InterruptedException
	{
	DashBoardPage d=new DashBoardPage(driver);
	Thread.sleep(3000);
	d.clickOnTime();
	}

}
