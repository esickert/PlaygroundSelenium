package SeleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;

import java.util.*;

public class SeleniumClass	{
	
//	Date date = new Date();
	WebDriver selenium = new FirefoxDriver();
	
	SeleniumClass()	{
	}
	
	public void sleep()	{
		System.out.println(dateTime() + " Sleeps for 5 secs, 5000 microsecs");
		try {
			Thread.sleep(5000);
		}	catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void clearCookies()	{
		selenium.manage().deleteAllCookies();
		System.out.println(dateTime() +  " Deleted all browser cookies");
	}
	
	public void maximizeWindow()	{
		selenium.manage().window().maximize();
		System.out.println(dateTime() + " Successfully maximized window");
	}
	
	public Date dateTime()	{
		Date date = new Date();
		return date;
	}
}