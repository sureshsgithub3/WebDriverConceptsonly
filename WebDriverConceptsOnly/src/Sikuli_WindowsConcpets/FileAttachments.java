package Sikuli_WindowsConcpets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileAttachments {
	WebDriver driver;
	
	@BeforeTest
	public void open(){
		driver= new FirefoxDriver();
		driver.manage().window();
		driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/?tab%3Dwm&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
		
	}
//	
//	@AfterTest
//	
//	public void Close(){
//		driver.close();
//	}
	
	@Test
	public void mail_Mail_attachment() throws InterruptedException, SikuliException{
		driver.findElement(By.id("Email")).sendKeys("idboapp@gmail.com");
	     driver.findElement(By.id("next")).click();
	     Thread.sleep(3000);
		driver.findElement(By.id("Passwd")).sendKeys("pass@word2");
		driver.findElement(By.id("signIn")).click();
		
	
		Thread.sleep(20000);
		//click compose
		driver.findElement(By.xpath("//div[@id=':hf']/div/div")).click();
		Thread.sleep(20000);
     	//enter email id in to field
		driver.findElement(By.xpath("//*[@name='to']")).sendKeys("idbotest@yahoo.com");
		Thread.sleep(3000);
		//click attachment icon
	
		driver.findElement(By.xpath("//*[@class='a1 aaA aMZ']")).click();
		System.out.println("Sys window opened");
		
	
		Pattern file= new Pattern("C:\\Users\\suresh\\Desktop\\Sikuli images\\FileName.png");
		
		
        Pattern image1=new Pattern("C:\\WorkSpaces\\Dheera\\WebDriverConceptsOnly\\Sikuli_Images\\Open.png");
        
        Screen src= new Screen();
        src.setAutoWaitTimeout(5);
        
        src.type(file, "E:\\Desktop folders\\LOGO\\10 mb\\lL16.jpg");
        src.click(image1);
		
		
	}
	
	

}
