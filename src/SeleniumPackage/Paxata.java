package SeleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class Paxata	extends SeleniumClass{
	
	String ipAddress;
	
	Paxata()	{
		
	}
	
	Paxata(String address)	{
		ipAddress = address;
	}
	
/*	public void setIP(String address)	{
		ipAddress = address;
	}  */
	
	public void loginToPaxataAndCloseHelp()	{
		//change this to login to gmail!!!
		System.out.println("This will login to paxata. NOTE these web elements were found using WebDriver element locator for Firefox");
		selenium.get("http://" + ipAddress);
//		selenium.get("http:////accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/#identifier");
		sleep();
		selenium.manage().window().maximize();
		sleep();
//**************************************************************************************************************************		
		WebElement query = selenium.findElement(By.xpath("//input[@id='loginName']"));
		query.sendKeys("superuser");  //THIS IS THE LOGIN
		query = selenium.findElement(By.xpath("//input[@name='password']"));
		query.sendKeys(Keys.TAB);
		query.sendKeys("superuser");  //THIS IS THE PASSWORD!!!!!!!!!!!!!!!!!!
		query.sendKeys(Keys.ENTER);
				System.out.println("Successfully logged into Paxata.");
		sleep(); 
		System.out.println("Sleeping inside Paxata.java");
		sleep();
		selenium.findElement(By.xpath("//button[@ng-click='toggleHidingHelp()']")).click(); //THIS WORKED!!
		System.out.println("Successfully closed the 'Help' window frame");
		sleep();
		//opens the drop down menu Account (shadow person in upper right corner)
		selenium.findElement(By.xpath("//i[contains(@class,'icon-user')]")).click();
		System.out.println("Successfully opened drop down menu");
		sleep();
		//selects 'logout'
		selenium.findElement(By.xpath("//a[@ng-click='logout()']")).click();
		System.out.println("Successfully logged out of paxata server");
		sleep();
		selenium.quit();
	}
	
}