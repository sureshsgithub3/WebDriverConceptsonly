package Actions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingScrollbars {
WebDriver driver;
	
	@Before
	public void Openbrowser(){
		driver = new FirefoxDriver();
		driver.get("http://www.ndtv.com/");
	
		driver.manage().window().maximize();
		
		
	}
	
	@After
	public void CloseBrowser(){
		//driver.close();
		
	}
	
	@Test
	public void  Scrollbar() throws InterruptedException{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(3000);
		//js.executeScript("window.scrollBy(0,500)","");
		
		js.executeScript("window.scrollBy(0,1000)");
	}

}
