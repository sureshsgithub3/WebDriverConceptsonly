package HandlingAlerts;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handling_Moda_lwindowPopup {
	
	
 public 	WebDriver driver;
 public int seconds=3000;
 
     
 
    public WebElement Waitforpopup(By locator,  int seconds){
		return (new WebDriverWait(driver, seconds)).until(ExpectedConditions.visibilityOfElementLocated(locator));
    	
    }
    
    @Before
    public void open(){
    	driver= new FirefoxDriver();
    	driver.get("C:\\Users\\suresh\\Desktop\\Php pop up for Sele\\error.html");
    	driver.manage().window().maximize();
    	
    }
    
    
    @Test
    public void clicktohandlepopup(){
    	driver.findElement(By.xpath("/html/body/div/button")).click();
    	Waitforpopup(By.xpath("/html/body/div[1]/div/div/div"),seconds);
    	//driver.switchTo().activeElement();
    	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[3]/button[1]")).click();
    	
    }

}
