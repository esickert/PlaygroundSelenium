package SeleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;

public class SeleniumClass	{
	
	WebDriver selenium = new FirefoxDriver();
	
	SeleniumClass()	{
	}
	
	public void sleep()	{
		try {
			Thread.sleep(10000);
		}	catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void clearCookies()	{
		selenium.manage().deleteAllCookies();
	}
}