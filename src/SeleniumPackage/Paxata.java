package SeleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
//import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.support.ui.Select;

//import org.junit.*;

import java.util.*;

public class Paxata	extends SeleniumClass{
	
	String ipAddress;
	
	Date date = new Date();
	
	Paxata()	{   //this is a constructor
		
	}
	
	Paxata(String address)	{     //this is a constructor
		ipAddress = address;
	}
	
/*	public void setIP(String address)	{
		ipAddress = address;
	}  */
//switch this off of paxata to something else!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!	
	public void loginToPaxataAndCloseHelp()	{
		//change this to login to gmail!!!??
		System.out.println(dateTime() + " This will login to paxata. NOTE these web elements were found using WebDriver element locator for Firefox");
		openPaxataBrowser(selenium, ipAddress);
//		selenium.get("http://" + ipAddress);
		sleep();
		maximizeWindow();
		selenium.navigate().refresh(); 
		System.out.println(dateTime() + " Successfully refresh screen");
		sleep();
//		selenium.manage().window().maximize();
		setWindowSize();
		sleep();
//**************************************************************************************************************************		
		WebElement thing = selenium.findElement(By.xpath("//input[@id='loginName']"));

		thing.sendKeys("superuser");  //THIS IS THE LOGIN
		sleep();

		thing = selenium.findElement(By.xpath("//input[@name='password']"));
		thing.sendKeys(Keys.TAB);
		thing.sendKeys("superuser");  
		thing.sendKeys(Keys.ENTER);
		System.out.println(dateTime() + " Successfully logged into Paxata.");
		sleep(); 
		System.out.println(dateTime() + " Sleeping inside Paxata.java");
		sleep();
		
		selenium.findElement(By.xpath("//button[@ng-click='toggleHidingHelp()']")).click(); //THIS WORKED!!
		System.out.println(dateTime() + " Successfully closed the 'Help' window frame");
		sleep();
//      trying to open the right drop down menu, the title changes though!!!!		
//		selenium.findElement(By.xpath("//i[contains(@class,'admin')]")).click();
		
		//opens the drop down menu Account (shadow person in upper right corner)
		selenium.findElement(By.xpath("//i[contains(@class,'icon-user')]")).click();
		System.out.println(dateTime() + " Successfully opened drop down menu- person icon in upperright corner");
		sleep();
		
		selenium.findElement(By.xpath("//a[@ng-click='buildInfo()']")).click();
		System.out.println(dateTime() + "Successfully openned 'About' box");
		sleep();

		selenium.findElement(By.xpath("//button[@ng-click='close()']")).click();
		sleep();

		selenium.findElement(By.xpath("//i[contains(@class,'icon-user')]")).click();
		System.out.println(dateTime() + " Successfully opened drop down menu");
		sleep();
		
		selenium.findElement(By.xpath("//a[@ng-click='myAccount()']")).click();
		sleep();
		
		selenium.findElement(By.xpath("//button[@ng-click='userForm.revert()']")).click();
		System.out.println(dateTime() + " Successfully opened and closed 'My Account'");
		sleep();
		
		selenium.findElement(By.xpath("//i[contains(@class,'icon-user')]")).click();
		System.out.println(dateTime() + " Successfully opened drop down menu");
		sleep();
		
		selenium.findElement(By.xpath("//a[@ng-click='logout()']")).click();
		System.out.println(dateTime() + " Successfully logged out of paxata server");
		sleep();
		clearCookies();
		selenium.quit(); //this basically calls driver.dispose method which in turn closes all the browser windows and ends the WebDriver session gracefully.
		System.out.println(dateTime() + " Successfully closed the browser");
	}
	
	public static void openPaxataBrowser(WebDriver x, String y)	{
//		@Test
		x.get(y);
	}
	
}