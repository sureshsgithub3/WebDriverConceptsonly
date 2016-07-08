package E_CommerceSites;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class IMageListIninSite {
	
	
	public WebDriver driver;
	@Test
	public void GetImages() throws Exception{
		driver =new FirefoxDriver();
		driver.get("http://182.72.246.195:8088/");
		driver.manage().window().maximize();
		
		Actions hovers=new Actions(driver);
		hovers.moveToElement(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[1]/div/div[1]/div/a[1]/img"))).build().perform();
		Thread.sleep(3000);
		hovers.moveToElement(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[1]/div/div[1]/div/a[2]/span"))).click().build().perform();
		Thread.sleep(5000);
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/iframe")));
	WebElement listofimages=	driver.findElement(By.id("thumbs_list_frame"));
	List<WebElement> names=listofimages.findElements(By.xpath("/html/body/div/div/div[1]/div[2]/div/ul/li"));
	
	System.out.println(names.size());
		
	}

}
