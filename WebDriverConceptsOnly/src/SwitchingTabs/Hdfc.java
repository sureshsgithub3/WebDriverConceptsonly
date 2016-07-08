package SwitchingTabs;

import java.util.ArrayList;
import java.util.ListIterator;
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
	public void page() throws InterruptedException{
		
		String mainwindowhandle = driver.getWindowHandle();
		System.out.println("main window handle : "  +mainwindowhandle);
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[3]/div/div[2]/div/div[2]/div[4]/a/img")).click();
		//Set<String> Allhandles=driver.getWindowHandles();
		ArrayList<String>Allhandels=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(Allhandels.get(1));
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[1]/ul/li[2]/a")).click();
		ArrayList<String>Allpagehandels=new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(Allpagehandels.get(2));
		driver.findElement(By.id("eForm_0")).click();
		driver.switchTo().window(Allhandels.get(0));
		ListIterator<String> li= Allpagehandels.listIterator();
		
		while(li.hasPrevious())
			
		{
			String h2= Allpagehandels.get(1);
			if(li.equals(h2)){
				driver.switchTo().window(h2);;
			}
		}
			
		
		
	
		
		
		
			
			
		}
	}


