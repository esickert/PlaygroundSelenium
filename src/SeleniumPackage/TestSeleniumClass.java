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
	
		for (int i = 0; i < 10; i++)	{
		// Create a new instance of the Firefox driver????????
		// driver is an instance of the WebDriver class???????
//		WebDriver driver = new FirefoxDriver();
		WebDriver selenium = new FirefoxDriver();
		SeleniumClass x = new SeleniumClass();
		
		//this will maximize the browser window to full screen
		selenium.manage().window().maximize(); 
//		x.get("http://www.store.demoqa.com");
		selenium.navigate().to("http://www.bing.com");
		System.out.println("Successfully opened 'www.bing.com' website using 'x.navigate().to()");
		
		System.out.println("Sleeps for 10 secs, 10000 microsecs");
		x.sleep();
		//Launch the Google Website
		selenium.get("http://www.google.com");
//		x.get("http://10.1.10.76:8080");
		 
		// Prints a success message to the screen
		System.out.println("Successfully opened website www.google.com");
		System.out.println("Sleeps for 10 secs, 10000 microsecs");
		x.sleep();
		
		String s = selenium.getCurrentUrl();
		System.out.println("Current open website is: " + s);	// Enter the query string "Cheese" into Google search and hits ENTER
		WebElement query = selenium.findElement(By.name("q"));
		
		selenium.findElement(By.xpath("//input[@aria-label='Search']"));
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

		System.out.println("Successfully entered query string 'apple' in Google hit ENTER");

		//Wait for 5 Sec   I BELIEVE THIS IS WRONG!!!!!
//		Thread.sleep(5);  //this produces an exception that needs to be caught
		System.out.println("Sleeps for 10 secs, 10000 microsecs");
		x.sleep();
/*		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} */
		
		selenium.findElement(By.xpath("html/body/div[1]/div[5]/div[4]/div[7]/div[1]/div[3]/div/div[2]/div[2]/div/div/div/div[1]/div/div/h3/a")).click();
		
		System.out.println("Successfully clicked on the link to Apple website. Retrieved link xpath via Firebug analysis tool");
		x.sleep();
/* 		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} */
		System.out.println("Sleeps for 10 secs, 10000 microsecs");
		x.sleep();
		x.clearCookies(selenium);  //I think this is working???
//		selenium.manage().deleteAllCookies();
		System.out.println("Deleted all browser cookies");
		//Close the driver
		selenium.quit();
		System.out.println("Successfully closed the browser FireFox");
		System.out.println("First Seleniuim webdriver app!!! YEAAAAAA");
		System.out.println("This script has run " + ++count + " times.");
		}
		System.out.println("That's all folks!");
	}

}
