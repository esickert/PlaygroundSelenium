package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;


public class SeleniumClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 0; i < 5; i++)	{
		// Create a new instance of the Firefox driver
		// driver is an instance of the WebDriver class????
		WebDriver driver = new FirefoxDriver();
				
		//Launch the Google Website
//		xr.get("http://www.store.demoqa.com");
		driver.get("http://www.google.com");
		 
		// Prints a success message to the screen
		System.out.println("Successfully opened website www.google.com");
		 
		try {
			Thread.sleep(10000);
		}	catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Enter the query string "Cheese" into Google search and hits ENTER
		WebElement query = driver.findElement(By.name("q"));
		query.sendKeys("Cheese \t");
		query.sendKeys(" Grater");
		query.sendKeys(Keys.ENTER);

		System.out.println("Successfully entered query string Cheese Grater and hit ENTER");

		//Wait for 5 Sec   I BELIEVE THIS IS WRONG!!!!!
//		Thread.sleep(5);
		System.out.println("Sleeps for 10 secs, 10000 microsecs");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		//Close the driver
		driver.quit();
		System.out.println("First Seleniuim webdriver app!!! YEAAAAAA");
		System.out.println("This script has run " + ++count + " times.");
		}

	}

}
