package HandlingWindows;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TwitterAdvertisepage {
public	WebDriver driver;
	
	
	@BeforeTest
	public void openup(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suresh\\Desktop\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://biz.twitter.com/start-advertising");
	}	
		@Test
		public void  tabs(){
			String twitterpage1= driver.getWindowHandle();
			System.out.println("its twitter adverstise window  "+twitterpage1);
			driver.findElement(By.linkText("Twitter Advertising Blog")).click();
			
			//ArrayList<Object>li= new ArrayList<>();
			ArrayList<String> twitterhandles= new ArrayList<String>(driver.getWindowHandles());
			System.out.println("handles"+twitterhandles);
			
			

		
		
	}

}
