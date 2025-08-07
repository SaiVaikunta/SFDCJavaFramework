package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}
   
public boolean HomeisDisplayed() {	
	try {
   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); 

  // Wait for the element to be visible
  WebElement homeBreadcrumb = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class= \"breadcrumbDetail uiOutputText\"][text()=\"Home\"]")));

   return ( homeBreadcrumb.isDisplayed());
   //driver.findElement(By.xpath("//span[@class= \"breadcrumbDetail uiOutputText\"][text()=\"Home\"]")).isDisplayed();
 
	}
	catch(Exception e )
	{
		return e.getMessage() != null;
	}
}
}
