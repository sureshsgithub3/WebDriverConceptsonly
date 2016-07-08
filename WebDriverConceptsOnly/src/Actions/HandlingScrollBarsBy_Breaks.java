package Actions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingScrollBarsBy_Breaks {
	
WebDriver driver;
	
	@Before
	public void Openbrowser(){
		driver = new FirefoxDriver();
		driver.get("http://www.ndtv.com/");
		driver.manage().window().maximize();
		
	}
	
	@After
	public void CloseBrowser(){
		driver.close();
		
	}
	
	@Test
	public void  Scrollbarbybreaks() throws InterruptedException{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		for(int sl=0; ;sl++){
			if(sl>=80)
			{
				break;
			}
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(10,500)","");
		Thread.sleep(2000);
	}

}


}
