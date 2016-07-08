package Actions;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Actions_ActiveElementinpage {
	
	WebDriver driver;
	
	@Test
	public void  Activeelement() throws Exception{
		//driver= new FirefoxDriver();
		System.setProperty("webdriver.ie.driver", "C:\\SeleniumIEChromeDriver\\IEDriverServer.exe");
		Thread.sleep(5000);
		driver =new InternetExplorerDriver();
		//driver= new EdgeDriver();
		Thread.sleep(5000);
		driver.get("http://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		String s= driver.switchTo().activeElement().getText();
		Thread.sleep(3000);
		driver.switchTo().activeElement();
		Thread.sleep(3000);
		System.out.println("Element is     "+s);
	}

}
