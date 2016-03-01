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
		System.out.println("Sleeps for 10 secs, 10000 microsecs");
		try {
			Thread.sleep(10000);
		}	catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void clearCookies()	{
		selenium.manage().deleteAllCookies();
		System.out.println("Deleted all browser cookies");
	}
	
	public void maximizeWindow()	{
		selenium.manage().window().maximize();
	}
}