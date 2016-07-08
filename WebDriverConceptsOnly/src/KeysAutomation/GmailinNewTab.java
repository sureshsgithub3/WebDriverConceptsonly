package KeysAutomation;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailinNewTab {
	WebDriver driver;
	@Before
	public void openChrome(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suresh\\Desktop\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/?gfe_rd=cr&ei=LotWVriiBqzA8geT6qyIAQ&gws_rd=ssl");
		driver.manage().window().maximize();
		
	}
	@Test
	public void Opengmailinnewtab(){
		String googlewindow= driver.getWindowHandle();
		
		driver.findElement(By.linkText("Gmail")).sendKeys(Keys.CONTROL,Keys.RETURN);
		Set<String> Allgooglpages= driver.getWindowHandles();
		
		for(String handles:Allgooglpages){
			if(!handles.equals(googlewindow)){
				driver.switchTo().window(handles);
			}
		}
	}
	
	

}
