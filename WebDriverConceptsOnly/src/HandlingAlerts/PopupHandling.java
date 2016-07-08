package HandlingAlerts;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PopupHandling {
	WebDriver driver;
	int seconds=2000;
	
	
	
	public WebElement waitforElement(By locator, int seconds){
		return (new WebDriverWait(driver, seconds)).until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}
	@Before
	public void init(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suresh\\Desktop\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("C:\\Users\\suresh\\Desktop\\Office Selenium Dumps\\popup.html");
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void Popups() throws InterruptedException{
		driver.findElement(By.xpath("/html/body/input")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
	}

}
