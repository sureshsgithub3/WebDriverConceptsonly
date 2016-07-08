package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Actions_KeysAutomation {
	public  WebDriver driver;
	
	//Actions keyactions= new Actions(driver);
	
	
	@BeforeTest
	public  void browser(){
		//driver= new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suresh\\Desktop\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/?gfe_rd=cr&ei=vuJfVroyz8TyB9PfjKgG&gws_rd=ssl");
	}
	
	
	
	
	
	@Test(enabled=true)
	public  void  tc1() throws InterruptedException{
		
		//selecting drop down text in google search
		driver.findElement(By.id("lst-ib")).sendKeys("abdul kalam");
		Actions keyactions= new Actions(driver);
		keyactions.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(2000);
		keyactions.sendKeys(Keys.ENTER).build().perform();
		
		
		
		
	}
	@Test(enabled=true)
	public void tc2() throws InterruptedException{
		
	WebElement searchbox=	driver.findElement(By.id("lst-ib"));
		Actions keyactions= new Actions(driver);
		keyactions.keyUp(Keys.SHIFT).sendKeys(searchbox, "adbul kalam").build().perform();
		Thread.sleep(2000);
		keyactions.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(2000);
		keyactions.sendKeys(Keys.ENTER).build().perform();
	}
	
	@Test(enabled=true)
	public void tc3() throws InterruptedException{
		WebElement searchbox= driver.findElement(By.id("lst-ib"));
		Actions keyactions= new Actions(driver);
		keyactions.keyUp(searchbox, Keys.SHIFT).sendKeys("abdul kalam").build().perform();
		Thread.sleep(2000);
		keyactions.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(2000);
		keyactions.sendKeys(Keys.ENTER).build().perform();
		
	}
	@Test(enabled=true)
	public void tc4() throws InterruptedException{
		WebElement searchbox= driver.findElement(By.id("lst-ib"));
		Actions keyactions= new Actions(driver);
		Thread.sleep(2000);
		keyactions.keyUp(searchbox, Keys.SHIFT).sendKeys("abdul kalam quotes").build().perform();
		Thread.sleep(2000);
		keyactions.sendKeys(Keys.DOWN).build().perform();
		keyactions.sendKeys(Keys.ENTER).build().perform();
		WebElement Weblink= driver.findElement(By.linkText("16 Most Popular Inspirational Quotes from APJ Abdul Kalam"));
		Thread.sleep(2000);
		keyactions.contextClick(Weblink).build().perform();
		Thread.sleep(2000);
		keyactions.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(2000);
		keyactions.sendKeys(Keys.ENTER).build().perform();
		
	}
	
	
	
	
	
	
		
		
		
		
		
		
		
		
	}


