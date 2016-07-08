package Sikuli_WindowsConcpets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class Sukuli_Mail_Attachment {
	WebDriver driver;
	
	@Test
	public void MailWithAttachemnt() throws Exception{
		for(int i=0;i<100;i++){
		driver= new FirefoxDriver();
		driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/?tab%3Dwm&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
		driver.findElement(By.id("Email")).sendKeys("idboapp@gmail.com");
		Thread.sleep(3000);
		Pattern Gmail_next=new Pattern("C:\\WorkSpaces\\Dheera\\WebDriverConceptsOnly\\Sikuli_Images\\GmailNext.png");
		Thread.sleep(2000);
		Pattern Gmail_password=new Pattern("C:\\WorkSpaces\\Dheera\\WebDriverConceptsOnly\\Sikuli_Images\\GmailPassword.png");
		Thread.sleep(2000);
		Pattern Gmail_signin=new Pattern("C:\\WorkSpaces\\Dheera\\WebDriverConceptsOnly\\Sikuli_Images\\GmailSignIn.png");
		Thread.sleep(2000);
		Pattern Gmail_compose=new Pattern("C:\\WorkSpaces\\Dheera\\WebDriverConceptsOnly\\Sikuli_Images\\Compose.png");
		Thread.sleep(2000);
		Pattern To_Mailid=new Pattern("C:\\WorkSpaces\\Dheera\\WebDriverConceptsOnly\\Sikuli_Images\\GmailTo.png");
		Thread.sleep(2000);
		Pattern Mail_Subject=new Pattern("C:\\WorkSpaces\\Dheera\\WebDriverConceptsOnly\\Sikuli_Images\\Gmailsubject.png");
		Thread.sleep(2000);
		Pattern mail_Body=new Pattern("C:\\WorkSpaces\\Dheera\\WebDriverConceptsOnly\\Sikuli_Images\\GmailBody.png");
		Thread.sleep(2000);
		Pattern Mail_attachment=new Pattern("C:\\WorkSpaces\\Dheera\\WebDriverConceptsOnly\\Sikuli_Images\\GmailAttachment.png");
		Thread.sleep(2000);
		Pattern FileName=new Pattern("C:\\WorkSpaces\\Dheera\\WebDriverConceptsOnly\\Sikuli_Images\\FileName.png");
		Thread.sleep(3000);
		Pattern openFile=new Pattern("C:\\WorkSpaces\\Dheera\\WebDriverConceptsOnly\\Sikuli_Images\\Open.png");
		Thread.sleep(2000);
		Pattern Send_mail=new Pattern("C:\\WorkSpaces\\Dheera\\WebDriverConceptsOnly\\Sikuli_Images\\GmailSend.png");
		Thread.sleep(3000);
		Pattern Profileclick= new Pattern("C:\\WorkSpaces\\Dheera\\WebDriverConceptsOnly\\Sikuli_Images\\Profile.png");
		Thread.sleep(2000);
		Pattern signoutclick= new Pattern("C:\\WorkSpaces\\Dheera\\WebDriverConceptsOnly\\Sikuli_Images\\Signout.png");
		Thread.sleep(2000);
		
		
		Screen src= new Screen();
		src.setAutoWaitTimeout(10);
		//src.type(Gmail_username,"idboapp@gmail.com");
		src.click(Gmail_next);	
		Thread.sleep(2000);
		
		src.type(Gmail_password,"pass@word2");
		Thread.sleep(2000);
		src.click(Gmail_signin);
		Thread.sleep(2000);
		
		src.click(Gmail_compose);
		Thread.sleep(5000);
		
		src.type(To_Mailid,"idbotest@yahoo.com");
		Thread.sleep(3000);
		src.type(Mail_Subject,"Sikuli Sending a mail with attachment");
		Thread.sleep(3000);
		src.type(mail_Body,"Selenium uses what is called locators to find and match the elements of the webpage that it needs to interact with");
		Thread.sleep(3000);
		src.click(Mail_attachment);
		Thread.sleep(3000);
		src.type(FileName,"E:\\Desktop folders\\LOGO\\10 mb\\lL16.jpg");
		Thread.sleep(3000);
		src.click(openFile);
		Thread.sleep(3000);
		src.click(Send_mail);	
		Thread.sleep(3000);
		
		src.click(Profileclick);
		Thread.sleep(3000);
		src.click(signoutclick);
		
		driver.close();
		
	}
	}

}
