package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Actions_mousehovers {
	
	
	@Test
	public  void  hoversonmenu(){
		
		WebDriver driver= new FirefoxDriver();
		
			driver.manage().window().maximize();
		
		driver.get("http://www.flipkart.com/");
		driver.switchTo().alert().accept();
		Actions hoveron= new Actions(driver);
		hoveron.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/ul/li[1]/a/span"))).click().build().perform();
	    //String till=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/ul/li[2]/a")).getText();
		//String ename=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/ul/li[1]/a/span")).getText();
		 for(int i=0;i<=100;i++){
			 hoveron.keyUp(Keys.TAB);
		 }
		
	}

}
