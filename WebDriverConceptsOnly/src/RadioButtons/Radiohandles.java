package RadioButtons;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radiohandles {
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
	

}
