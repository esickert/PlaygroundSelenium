package SeleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Dimension;
//import org.openqa.selenium.By;
import org.openqa.selenium.firefox.*;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.Keys;

import javax.swing.JOptionPane;

import java.util.*;

public class SeleniumClass	{
	
//	Date date = new Date();
	WebDriver selenium = new FirefoxDriver();
	
	SeleniumClass()	{
	}
	
	public void sleep()	{
		System.out.println(dateTime() + " Sleep for 5 secs, 5000 microsecs");
		for(int i = 1; i <= 5; i++)	{
			System.out.print(i + " ");
			try {
				Thread.sleep(1000);
			}	
				catch (InterruptedException e) {
					e.printStackTrace();
					System.err.println("ERROR: Problem with sleep method!!!");
				}
		}
		
		System.out.println();
	}
	
	public void clearCookies()	{
		selenium.manage().deleteAllCookies();
		System.out.println(dateTime() +  " Deleted all browser cookies");
	}
	
	public void maximizeWindow()	{
		selenium.manage().window().maximize();
		System.out.println(dateTime() + " Successfully maximized window");
		sleep();
	}
	
	public Date dateTime()	{
		Date date = new Date();
		return date;
	}
	
	public void setWindowSize()	{
		Dimension size = new Dimension(900, 600);
		selenium.manage().window().setSize(size);
		System.out.println(dateTime() + " Succesfully resized the window");
		sleep();
	}
		
}