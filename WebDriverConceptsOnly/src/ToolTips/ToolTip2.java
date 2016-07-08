package ToolTips;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip2 {
	
	WebDriver driver;
	
	@Test
	public void TooltipHandling_Actions(){
		driver= new FirefoxDriver();
		driver.navigate().to("http://www.spicejet.com/");
		Actions hoverActions=new Actions(driver);
		hoverActions.moveToElement(driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[4]/div[2]/div/div[2]/div[2]/div/div[7]/div[2]/input")));
		WebElement tooltip=driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[4]/div[2]/div/div[2]/div[2]/div/div[7]/div[2]/span"));
		hoverActions.moveToElement(tooltip).build().perform();
		String t2=tooltip.getText();
		System.out.println(t2);
	}
}
