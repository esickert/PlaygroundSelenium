package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;


public class TestSeleniumClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		
		for (int i = 0; i < 1; i++)	{
		// Create a new instance of the Firefox driver????????
		// driver is an instance of the WebDriver class???????
//		WebDriver driver = new FirefoxDriver();
		WebDriver x = new FirefoxDriver();
		//Launch the Google Website
//		xr.get("http://www.store.demoqa.com");
		x.get("http://www.google.com");
//		x.get("http://10.1.10.76:8080");
		 
		// Prints a success message to the screen
		System.out.println("Successfully opened website www.google.com");
		 
		try {
			Thread.sleep(10000);
		}	catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Enter the query string "Cheese" into Google search and hits ENTER
		WebElement query = x.findElement(By.name("q"));
		x.findElement(By.xpath("//input[@aria-label='Search']"));
		query.sendKeys("apple");
		query.sendKeys(Keys.ENTER);
		
		
		//****************************************************************************
		//this will login to paxata. NOTE these web elements were found using WebDriver element locator for Firefox
//		WebElement query = x.findElement(By.xpath("//input[@id='loginName']"));
//		query.sendKeys("superuser");
		
//		query = x.findElement(By.xpath("//input[@name='password']"));
//		query.sendKeys(Keys.TAB);
//		query.sendKeys("superuser");
//		query.sendKeys(Keys.ENTER);
		//****************************************************************************

		System.out.println("Successfully entered query string apple it ENTER");

		//Wait for 5 Sec   I BELIEVE THIS IS WRONG!!!!!
//		Thread.sleep(5);  //this produces an exception that needs to be caught
		System.out.println("Sleeps for 10 secs, 10000 microsecs");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		//Close the driver
		x.quit();
		System.out.println("First Seleniuim webdriver app!!! YEAAAAAA");
		System.out.println("This script has run " + ++count + " times.");
		}
		System.out.println("That's all folks!");
	}

}
