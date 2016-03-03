package SeleniumPackage;

public class TestSeleniumClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
	
		for (int i = 0; i < 1; i++)	{
		System.out.println("NEED TO SET THIS UP WITH JUNIT!!!!!");
//issue of polymopherism and my understanding of it (not!) occurring here.
//		Paxata x = new Paxata();  //this creates an instance of Paxata class which contains an instance of WebDriver
		Google y = new Google();

		


//		x.sleep();
		
//		x.selenium.findElement(By.xpath("html/body/div[1]/div[5]/div[4]/div[7]/div[1]/div[3]/div/div[2]/div[2]/div/div/div/div[1]/div/div/h3/a")).click();
		
//		System.out.println("Successfully clicked on the link to Apple website. Retrieved link xpath via Firebug analysis tool");

//		x.sleep();
//		x.clearCookies();  //I think this is working???

		//Close the driver
		
//		x.loginToPaxataAndCloseHelp();
		y.openAndCloseGoogleAndBing();
		
//		System.out.println("Successfully closed the browser FireFox");
//		System.out.println("First Seleniuim webdriver app!!! YEAAAAAA");
//		System.out.println("This script has run " + ++count + " times.");
		}
		System.out.println("That's all folks!");
	}

}
