package testCases;
	import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;


public class TC02_HomePageTest extends BaseClass {
	
    @Test
    public void verify_HomepageText() throws InterruptedException {
       LoginPage lp = new LoginPage(driver);
        lp.usrnamesend();lp.pwdsend(); lp.loginbtnclick();
      
        HomePage hp =new HomePage(driver);
        hp.HomeisDisplayed();      
    
  
}}



