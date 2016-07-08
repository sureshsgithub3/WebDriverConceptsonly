package ToolTips;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tooltip1 {
	
	WebDriver driver;
	
	
	@Test
	public void HandleToolTips(){
		driver =new FirefoxDriver();
		driver.navigate().to("http://www.spicejet.com/");
	String tooltip=	driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[4]/div[2]/div/div[3]/ul/li[2]/a")).getAttribute("title");
		System.out.println(tooltip);
		
		
	}

}
