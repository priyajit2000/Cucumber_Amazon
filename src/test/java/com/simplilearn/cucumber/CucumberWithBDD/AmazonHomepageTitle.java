package com.simplilearn.cucumber.CucumberWithBDD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonHomepageTitle {

	

	public static void main(String[] args) {
		
		
				String siteUrl = "https://www.amazon.in";
				String driverPath = "DRIVERS/WIN/chromedriver.exe";

				// step2: set system properties for selenium driver
				
				System.setProperty("webdriver.chromedriver.driver", driverPath);

				// step3: instantiate selenium webdriver
				
				WebDriver driver = new ChromeDriver();

				// step4: launch browser
				driver.get(siteUrl);
				
				String expectedTitle  = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
				String actualTitle  = driver.getTitle();
				
				if(expectedTitle.equals(actualTitle)) {
					System.out.println("Test is Passed !");
				} else {
					System.out.println("Test is Failed !");
				}
				
				System.out.println("Expected Title : " + expectedTitle);
				System.out.println("Actual Title : " + actualTitle);
				
				
				// step6: close driver
				//driver.close();

	}

	
}
