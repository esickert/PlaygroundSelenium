package SeleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import java.util.*;

public class Paxata	extends SeleniumClass{
	
	String ipAddress;
	
	Date date = new Date();
	
	Paxata()	{
		
	}
	
	Paxata(String address)	{
		ipAddress = address;
	}
	
/*	public void setIP(String address)	{
		ipAddress = address;
	}  */
//switch this off of paxata to something else!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!	
	public void loginToPaxataAndCloseHelp()	{
		//change this to login to gmail!!!??
		System.out.println(dateTime() + " This will login to paxata. NOTE these web elements were found using WebDriver element locator for Firefox");
		selenium.get("http://" + ipAddress);
//		selenium.get("http:////accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/#identifier");
		sleep();
		maximizeWindow();
//		selenium.manage().window().maximize();
		sleep();
//**************************************************************************************************************************		
		WebElement query = selenium.findElement(By.xpath("//input[@id='loginName']"));
//		WebElement query = selenium.findElement(By.xpath("html/body/div/div[2]/div[2]/div[1]/form/div[1]/div/div[1]/div/div/input[1]"));
		query.sendKeys("superuser");  //THIS IS THE LOGIN
		sleep();
//		query.sendKeys(Keys.TAB);
//		query.sendKeys(Keys.ENTER);
		query = selenium.findElement(By.xpath("//input[@name='password']"));
		query.sendKeys(Keys.TAB);
		query.sendKeys("superuser");  
		query.sendKeys(Keys.ENTER);
		System.out.println(dateTime() + " Successfully logged into Paxata.");
		sleep(); 
		System.out.println(dateTime() + " Sleeping inside Paxata.java");
		sleep();
		
		selenium.findElement(By.xpath("//button[@ng-click='toggleHidingHelp()']")).click(); //THIS WORKED!!
		System.out.println(dateTime() + " Successfully closed the 'Help' window frame");
		sleep();
		
		//opens the drop down menu Account (shadow person in upper right corner)
		selenium.findElement(By.xpath("//i[contains(@class,'icon-user')]")).click();
		System.out.println(dateTime() + " Successfully opened drop down menu");
		sleep();
		
//		selenium.findElement(By.xpath("//a[@ng-click='buildInfo()']")).click();
//		System.out.println("Successfully openned 'About' box");
//		sleep();
		//***********************************************************************************************
//		don't use html
//		selenium.findElement(By.xpath("html/body/div[8]/div/div/div[2]/div/div[3]/button")).click();
		
		
		
		
		selenium.findElement(By.xpath("//a[@ng-click='logout()']")).click();
		
		//selects 'logout'
		System.out.println(dateTime() + " Successfully logged out of paxata server");
		sleep();
		selenium.quit(); //this basically calls driver.dispose method which in turn closes all the browser windows and ends the WebDriver session gracefully.
		System.out.println(dateTime() + "Successfully closed the browser");
	}
	
}