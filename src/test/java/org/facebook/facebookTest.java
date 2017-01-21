package org.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class facebookTest {
	
	WebDriver driver;
	@Test
	public void facebooklogin(){
	driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	System.out.println("hello");

	driver.quit();
		
		
	}
	
	}
	
	
	
	


