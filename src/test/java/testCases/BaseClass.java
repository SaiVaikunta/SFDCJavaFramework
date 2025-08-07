package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public WebDriver driver;//At Class level
	  @BeforeClass
    public void setup()
	{
 	   driver =new ChromeDriver();
      driver.get(" https://techmahindra460-dev-ed.develop.my.salesforce.com/");
    }
	  
	  @AfterClass
	    public void teardown() {
	        if (driver != null) {
	            driver.quit();
	        }

	        
	  }}
