package SeleniumPackage;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumClass	{
	
//	WebDriver selenium = new FirefoxDriver();
	
	SeleniumClass()	{
	}

	//got this of the web. I know Thtread.sleeo throws an exception
//	public void ClearBrowserCache()	{
//		webDriver.Manage().Cookies.DeleteAllCookies(); //delete all cookies
//		Thread.Sleep(5000); //wait 5 seconds to clear cookies.
//	}
	
	public void sleep()	{
		try {
			Thread.sleep(10000);
		}	catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void clearCookies(WebDriver driver)	{
		driver.manage().deleteAllCookies();
	}
}