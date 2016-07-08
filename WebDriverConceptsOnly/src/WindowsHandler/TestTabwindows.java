package WindowsHandler;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestTabwindows {
	WebDriver driver;
	
	@Test
	public void Testtabs(){
		//driver= new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suresh\\Desktop\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.w3schools.com/js/default.asp");
	//	driver.manage().window().maximize();
		driver.findElement(By.xpath(".//div[@id='main']/div[4]/p/a")).click();
		List<String> tabs=new ArrayList<String>(driver.getWindowHandles());
		System.out.println(tabs.get(0));
		driver.switchTo().window(tabs.get(1));
	
		
		
		
	}

}
