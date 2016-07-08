package SwitchingTabs;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Twitter {
	WebDriver driver;
	@Before
	public void openChrome(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suresh\\Desktop\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	    //driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://business.twitter.com/start-advertising");
		driver.manage().window().maximize();
		
	}
	@Test
	public void switchtabs() throws InterruptedException{
		String parenttab= driver.getWindowHandle();
		driver.findElement(By.xpath("/html/body/div[2]/section[2]/div/footer/div[1]/div/div[3]/div/div/div/a")).click();
		ArrayList<String>newtab=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newtab.get(0));
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[2]/aside/div/div[1]/a[2]")).click();
		Thread.sleep(10000);
		driver.close();
		driver.switchTo().window(parenttab);
		
		
		
		
	}

}
