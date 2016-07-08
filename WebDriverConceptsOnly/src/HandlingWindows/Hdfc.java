package HandlingWindows;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hdfc {
	WebDriver driver;
	@Before
	public void openChrome(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suresh\\Desktop\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void page(){
		
		String mainwindowhandle = driver.getWindowHandle();
		System.out.println("main window handle : "  +mainwindowhandle);
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[3]/div/div[2]/div/div[2]/div[4]/a/img")).click();
		Set<String> Allhandles=driver.getWindowHandles();
		
		
		for(String handels:Allhandles){
			
			if(!handels.equals(mainwindowhandle)){
				System.out.println("new window1 handle is  "+handels);
				driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
				driver.switchTo().window(handels);
				//driver.findElement(By.xpath("/html/body/div[1]/div/div/div[7]/a/img")).click();
				//driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
				 driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[1]/ul/li[2]/a")).click();
				//String pagetitle= driver.getTitle();
				//System.out.println("After click ttl :"+pagetitle);
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				
				
			}
		}
	}
	
	
	

}
