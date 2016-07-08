package Actions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Mouse_rightlclick {
	
	public WebDriver driver;
	@Before
	public void open(){
	driver= new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://www.hdfcbank.com/");
	}
	@After
	public void close(){
		driver.close();
	}
	@Test
	public void  Rightclick() throws Exception{
		Actions rightclick =new Actions(driver);
		rightclick.contextClick(driver.findElement(By.id("loginsubmit"))).build().perform();
		Thread.sleep(3000);
		rightclick.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(3000);
		rightclick.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(4000);
		rightclick.sendKeys(Keys.ENTER).build().perform();
	}

}
