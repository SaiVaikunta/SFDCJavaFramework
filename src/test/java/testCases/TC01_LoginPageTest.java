package testCases;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
public class TC01_LoginPageTest extends BaseClass {
	
    @Test
    public void verify_login() throws InterruptedException {
       
        LoginPage lp = new LoginPage(driver);
        
        lp.usrnamesend();
        lp.pwdsend();
        lp.loginbtnclick();
       //Thread.sleep(15000);
       }
   
    
}



