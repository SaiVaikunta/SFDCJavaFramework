package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	  @FindBy(xpath="//input[@id='username']") WebElement txtusrname;
	  @FindBy(xpath="//input[@id='password']") WebElement txtpwd;
	  @FindBy(xpath="//input[@id='Login']") WebElement btnLogin;
	  
  public void usrnamesend()
  {
	  txtusrname.sendKeys("***");
  }
  public void pwdsend()
  {
	  txtpwd.sendKeys("******");
  }
  public void loginbtnclick()
  {
	  btnLogin.click();
  }
  
}
//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("saipavan@salesforce.com");
//driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Sairam@26");
//driver.findElement(By.xpath("//input[@id='Login']")).click();