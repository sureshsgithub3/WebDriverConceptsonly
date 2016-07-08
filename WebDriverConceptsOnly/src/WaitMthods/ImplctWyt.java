package WaitMthods;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;







public class ImplctWyt {
	static WebDriver driver;
	
	@Before
	public void init(){
		WebDriver driver=new FirefoxDriver();
		driver= new FirefoxDriver();

		driver.get("http://www.spicejet.com/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void waitlearn() throws InterruptedException{
	
	
	driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
			Thread.sleep(5000);
			driver.findElement(By.linkText("Hyderabad (HYD)")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
			//Thread.sleep(3000);
			//waitforElement(By.partialLinkText(" Goa (GOI)"),seconds).click();
			driver.findElement(By.linkText("Goa (GOI)")).click();
			Thread.sleep(5000);
			driver.findElement(By.id("ctl00_mainContent_txt_Fromdate")).click();
			driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr[4]/td[6]/a")).click();
			new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult"))).selectByIndex(2);
			Thread.sleep(2000);
			//driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();
			Thread.sleep(4000);
			Actions ac = new Actions(driver);
			ac.moveToElement(driver.findElement(By.id("ctl00_mainContent_btn_FindFlights"))).build().perform();
			Thread.sleep(4000);
			ac.click().build().perform();
			driver.manage().timeouts().implicitlyWait(1200,TimeUnit.SECONDS);
			driver.switchTo().alert().accept();
	}
}
