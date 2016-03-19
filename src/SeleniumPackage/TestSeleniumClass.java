package SeleniumPackage;

public class TestSeleniumClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
	
		for (int i = 0; i < 1; i++)	{
		System.out.println("NEED TO SET THIS UP WITH JUNIT!!!!!");
//issue of polymopherism and my understanding of it (not!) occurring here.
		Paxata x = new Paxata("10.1.10.41:8080");  //this creates an instance of Paxata class which contains an instance of WebDriver
//		Google y = new Google();

		x.loginToPaxataAndCloseHelp();
//		y.openAndCloseGoogleAndBing();
		
		System.out.println(x.dateTime() + " This script has run " + ++count + " times.");
		}
		System.out.println("Tha..tha..that's all folks!");
	}

}
