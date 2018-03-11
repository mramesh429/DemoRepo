package SeleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class URL {

	public static void main(String[] args) {
		
		//1. FF browser
				// geckodriver
				
				//System.setProperty("webdriver.gecko.driver","E:\\2018\\Sw\\geckodriver.exe");
				
				//WebDriver driver = new FirefoxDriver();
				
			//	driver.get("http://www.google.com");
				
				//2. Chrome Browser
				
				System.setProperty("webdriver.chrome.driver","E:\\2018\\Sw\\chromedriver.exe");
		        WebDriver driver= new ChromeDriver();
				
				driver.get("http://www.google.com");
				
				String title = driver.getTitle();
				
			 System.out.println(title);
			 
			 if (title.equals("Google")) {
				 System.out.println("correct title");
			 }
				 else {
					 System.out.println("not correct title");
				 
				 }
			 
			 System.out.println(driver.getCurrentUrl());
			 //System.out.println(driver.getPageSource());
				driver.quit();


	}

}
