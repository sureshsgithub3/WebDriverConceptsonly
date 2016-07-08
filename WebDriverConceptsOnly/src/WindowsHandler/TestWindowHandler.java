package WindowsHandler;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestWindowHandler {
	@Test
	public void TestWin(){
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.w3schools.com/js/default.asp");
		
		driver.findElement(By.xpath("//div[@id='main']/div[4]/p/a")).click();
		
		List<String> win = new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(win.get(1));
		System.out.println(win.get(1));
		driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
		driver.findElement(By.cssSelector("body > button:nth-child(2)")).click();
		//body > button:nth-child(2)
		driver.close();
		driver.switchTo().window(win.get(0));
		System.out.println(win.get(0));
		
		
		System.out.println("Clicked");
	}

}
