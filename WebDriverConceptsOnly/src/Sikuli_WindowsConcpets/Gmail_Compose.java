package Sikuli_WindowsConcpets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Gmail_Compose {
	WebDriver driver;
	
		
	@BeforeTest
	public void open(){
		driver= new FirefoxDriver();
		driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/?tab%3Dwm&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
		
	}
	
	@AfterTest
	public void Close(){
		driver.close();
	}
	
	@Test
	public void mail_Mail_attachment() throws InterruptedException, SikuliException{
		//Thread.sleep(10000);
		driver.findElement(By.id("Email")).sendKeys("idboapp@gmail.com");
//   	 driver.findElement(By.id("next")).click();
//	     Thread.sleep(3000);
//		driver.findElement(By.id("Passwd")).sendKeys("pass@word2");
//		driver.findElement(By.id("signIn")).click();
		
	
		Thread.sleep(20000);
		//Pattern Gmail= new Pattern("C:\\Users\\suresh\\Desktop\\Sikuli images\\Gmailusername.png");
		//Pattern Gmail_username=new Pattern("C:\\WorkSpaces\\Dheera\\WebDriverConceptsOnly\\Sikuli_Images\\username.png");
		Pattern Gmail_next=new Pattern("C:\\WorkSpaces\\Dheera\\WebDriverConceptsOnly\\Sikuli_Images\\GmailNext.png");
		Pattern Gmail_password=new Pattern("C:\\WorkSpaces\\Dheera\\WebDriverConceptsOnly\\Sikuli_Images\\GmailPassword.png");
		Pattern Gmail_signin=new Pattern("C:\\WorkSpaces\\Dheera\\WebDriverConceptsOnly\\Sikuli_Images\\GmailSignIn.png");
		Pattern Gmail_compose=new Pattern("C:\\WorkSpaces\\Dheera\\WebDriverConceptsOnly\\Sikuli_Images\\Compose.png");
		Pattern To_Mailid=new Pattern("C:\\WorkSpaces\\Dheera\\WebDriverConceptsOnly\\Sikuli_Images\\GmailTo.png");
		Pattern Mail_Subject=new Pattern("C:\\WorkSpaces\\Dheera\\WebDriverConceptsOnly\\Sikuli_Images\\Gmail SubJect.png");
		Pattern mail_Body=new Pattern("C:\\WorkSpaces\\Dheera\\WebDriverConceptsOnly\\Sikuli_Images\\GmailBody.png");
		Pattern Mail_attachment=new Pattern("C:\\WorkSpaces\\Dheera\\WebDriverConceptsOnly\\Sikuli_Images\\GmailAttachment.png");
		Pattern FileName=new Pattern("C:\\WorkSpaces\\Dheera\\WebDriverConceptsOnly\\Sikuli_Images\\FileName.png");
		Pattern openFile=new Pattern("C:\\WorkSpaces\\Dheera\\WebDriverConceptsOnly\\Sikuli_Images\\Open.png");
		Pattern Send_mail=new Pattern("C:\\WorkSpaces\\Dheera\\WebDriverConceptsOnly\\Sikuli_Images\\GmailSend.png");
		
		Screen src= new Screen();
		src.setAutoWaitTimeout(10);
		//src.type(Gmail_username,"idboapp@gmail.com");
		src.click(Gmail_next);		
		src.setAutoWaitTimeout(5);
		src.type(Gmail_password,"pass@word2");
		src.click(Gmail_signin);
		src.setAutoWaitTimeout(20);
		src.click(Gmail_compose);
		src.setAutoWaitTimeout(5);
		src.type(To_Mailid,"idbotest@yahoo.com");
		src.setAutoWaitTimeout(2);
		src.type(Mail_Subject,"Sikuli Sending a mail with attachment");
		src.type(mail_Body,"Selenium uses what is called locators to find and match the elements of the webpage that it needs to interact with");
		src.click(Mail_attachment);
		src.type(FileName,"E:\\Desktop folders\\LOGO\\10 mb\\lL16.jpg");
		src.click(openFile);
		src.setAutoWaitTimeout(20);
		src.click(Send_mail);	
		
	}
	
	
	
	

}
