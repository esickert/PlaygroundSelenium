package SeleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class Google	extends SeleniumClass	{
	
	Google()	{  //constructor
	}
	
	public void openAndCloseGoogleAndBing()	{
		
//		sleep();
		selenium.navigate().to("http://www.bing.com");
		selenium.manage().window().maximize();
		sleep();
		System.out.println("Successfully opened 'www.bing.com' website using 'x.navigate().to()'");
		selenium.get("http://www.google.com");
		System.out.println("Successfully opened the google website");
		sleep();
		
		
		selenium.findElement(By.xpath("//input[@aria-label='Search']"));
		WebElement query = selenium.findElement(By.name("q"));	
		query.sendKeys("apple");
		query.sendKeys(Keys.ENTER);
		System.out.println("Successfully entered query string 'apple' in Google hit ENTER");
		sleep();
		
		selenium.findElement(By.xpath("html/body/div[1]/div[5]/div[4]/div[7]/div[1]/div[3]/div/div[2]/div[2]/div/div/div/div[1]/div/div/h3/a")).click();
		System.out.println("Successfully clicked on the link to Apple website. Retrieved link xpath via Firebug analysis tool");

		sleep();
		clearCookies();
		sleep();
//		selenium.close();  //It closes the the browser window on which the focus is set.
//		sleep();
		selenium.quit();  //It basically calls driver.dispose method which in turn closes all the browser windows and ends the WebDriver session gracefully.
//		selenium.dispose();  // this errors out - "method dispose() is undefined for type Webdriver". Use quit()
	
//	selenium.close();
//	x.get("http://www.store.demoqa.com");
//	x.selenium.get("http://10.1.10.63:8080");
//	selenium.get("http://www.google.com");
//	sleep();
//	selenium.navigate().to("http://www.bing.com");
//	System.out.println("Successfully opened 'www.bing.com' website using 'x.navigate().to()'");
	
	

	//Launch the Google Website
	
	
	

	
	}

}
