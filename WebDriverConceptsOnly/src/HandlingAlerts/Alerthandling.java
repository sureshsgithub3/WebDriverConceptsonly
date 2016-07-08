package HandlingAlerts;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerthandling {
	WebDriver driver;
	int seconds=2000;
	
	
	
	public WebElement waitforElement(By locator, int seconds){
		return (new WebDriverWait(driver, seconds)).until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}
	@Before
	public void init(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suresh\\Desktop\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://www.spicejet.com/");
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void ALertok() throws InterruptedException{
		waitforElement(By.id("ctl00_mainContent_rbtnl_Trip_1"),seconds).click();
		Thread.sleep(3000);
		waitforElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"),seconds).click();
		Thread.sleep(5000);
		waitforElement(By.linkText("Hyderabad (HYD)"),seconds).click();
		Thread.sleep(3000);
		//waitforElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT"),seconds).click();
		//Thread.sleep(3000);
		//waitforElement(By.partialLinkText(" Goa (GOI)"),seconds).click();
		//waitforElement(By.linkText("Goa (GOI)"), seconds).click();
		Thread.sleep(5000);
		waitforElement(By.id("ctl00_mainContent_txt_Fromdate"),seconds).click();
		waitforElement(By.xpath("/html/body/div/div[2]/table/tbody/tr[4]/td[6]/a"),seconds).click();
		new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult"))).selectByIndex(2);
		Thread.sleep(2000);
		//driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();
		Thread.sleep(4000);
		Actions ac = new Actions(driver);
		ac.moveToElement(waitforElement(By.id("ctl00_mainContent_btn_FindFlights"),seconds)).build().perform();
		Thread.sleep(4000);
		ac.click().build().perform();
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();
	}

}
