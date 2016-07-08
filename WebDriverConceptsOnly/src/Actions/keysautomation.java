package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class keysautomation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/?gfe_rd=cr&ei=vuJfVroyz8TyB9PfjKgG&gws_rd=ssl");
		
		driver.findElement(By.id("lst-ib")).sendKeys("abdul kalam qoutes");
		Thread.sleep(2000);
		
		
		Actions keysaction= new Actions(driver);
		keysaction.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);
		
		keysaction.sendKeys(Keys.ENTER).build().perform();
		//driver.findElement(By.name("btnG")).click();
		
	//WebElement we=	driver.findElement(By.linkText("16 Most Popular Inspirational Quotes from APJ Abdul Kalam"));
	//keysaction.contextClick(we).build().perform();
//	Thread.sleep(2000);
//	keysaction.sendKeys(Keys.ARROW_DOWN).build().perform();
//	keysaction.sendKeys(Keys.ENTER).build().perform();
	driver.quit();
		
		

	}

}
