package UsingTagOfElements;

import java.sql.Driver;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingAllLinksInAPage {
	WebDriver driver;
	
	@Before
	public void Openbrowser(){
		driver = new FirefoxDriver();
		driver.get("http://182.72.246.194/prestashop_1.6.1.1/prestashop/");
		driver.manage().window().maximize();
		
	}
	
	@After
	public void CloseBrowser(){
		driver.close();
		
	}
	
	@Test
	public void  AllLinks(){
		//Test to capture all links(anchor tag elements ) so  you can capture all elements by using respective tag names like input,
		List<WebElement> li= driver.findElements(By.tagName("a"));
		
		for(int i=0;i<li.size();i++){
			
			System.out.println(li.get(i).getText());
		}
		
	}

}
