package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebElement;

public class SeleniumClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a new instance of the Firefox driver
				WebDriver driver = new FirefoxDriver();
				
		        //Launch the Online Store Website
//				driver.get("http://www.store.demoqa.com");
				driver.get("http://www.google.com");
		 
		        // Print a Log In message to the screen
//		        System.out.println("Successfully opened the website www.Store.Demoqa.com");
				
				System.out.println("Successfully opened website www.google.com");
		 
				// Enter the query string "Cheese" into Google search
		        WebElement query = driver.findElement(By.name("q"));
		        query.sendKeys("Cheese");
				
				//Wait for 5 Sec
//				Thread.sleep(5);
				try {
		            Thread.sleep(1000);
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
				System.out.println("First Seleniuim webdriver app!!!");
		        //Close the driver
		        driver.quit();

	}

}
