package Actions;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Keysautomation1 {
	
	@Test
	public void keysautomate() throws InterruptedException{
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/?gfe_rd=cr&ei=vuJfVroyz8TyB9PfjKgG&gws_rd=ssl");
		
	WebElement searchbox=	driver.findElement(By.id("lst-ib"));
		Thread.sleep(2000);
		
		
		Actions keysaction= new Actions(driver);
		keysaction.keyDown(Keys.SHIFT).sendKeys(searchbox,"adbul kalam").build().perform();
		Thread.sleep(2000);
		keysaction.sendKeys(Keys.DOWN).build().perform();
		keysaction.sendKeys(Keys.ENTER).build().perform();
		
	}

}
