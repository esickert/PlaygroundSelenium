package SeleniumPackage;

public class TestSeleniumClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
	
		for (int i = 0; i < 1; i++)	{
		System.out.println("NEED TO SET THIS UP WITH JUNIT!!!!!");
		Paxata x = new Paxata();  //this creates an instance of Paxata class which contains an instance of WebDriver

//		x.get("http://www.store.demoqa.com");
//		x.selenium.get("http://10.1.10.63:8080");
//		x.selenium.navigate().to("http://www.bing.com");
//		System.out.println("Successfully opened 'www.bing.com' website using 'x.navigate().to()'");
		
//		x.sleep();
		//Launch the Google Website
//		x.selenium.get("http://www.google.com");
		 
		// Prints a success message to the screen
//		System.out.println("Successfully opened website www.google.com");
		System.out.println("Sleeps for 10 secs, 10000 microsecs");
		x.sleep();
		x.maximizeWindow();
		x.loginToPaxataAndCloseHelp(); //logs into the Paxata server.
		String s = x.selenium.getCurrentUrl();
		System.out.println("Current open website is: " + s);	// Enter the query string "Cheese" into Google search and hits ENTER
//		WebElement query = x.selenium.findElement(By.name("q"));
		
//		x.selenium.findElement(By.xpath("//input[@aria-label='Search']"));
//		query.sendKeys("apple");
//		query.sendKeys(Keys.ENTER);
//		System.out.println("Successfully entered query string 'apple' in Google hit ENTER");

//		x.sleep();
		
//		x.selenium.findElement(By.xpath("html/body/div[1]/div[5]/div[4]/div[7]/div[1]/div[3]/div/div[2]/div[2]/div/div/div/div[1]/div/div/h3/a")).click();
		
//		System.out.println("Successfully clicked on the link to Apple website. Retrieved link xpath via Firebug analysis tool");

		x.sleep();
		x.clearCookies();  //I think this is working???

		//Close the driver
		x.selenium.quit();
		System.out.println("Successfully closed the browser FireFox");
		System.out.println("First Seleniuim webdriver app!!! YEAAAAAA");
		System.out.println("This script has run " + ++count + " times.");
		}
		System.out.println("That's all folks!");
	}

}
