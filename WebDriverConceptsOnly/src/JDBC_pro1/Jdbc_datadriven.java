package JDBC_pro1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Jdbc_datadriven {
	
	public WebDriver driver;
	
	
	static final String jdbc_driver="com.mysql.jdbc.Driver";
	static final String db_url="jdbc:mysql://localhost:3306/jdbc_database";
	static final String db_username="suresh";
	static final String db_password="pass@word1";
	
	//static String Trellourl="https://trello.com/login";
	
	
	
	public WebElement Waitforme(By locator,int seconds)
	{
		return new WebDriverWait(driver, seconds).until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}
	
	@Before
	public void Init(){
		
		//driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumIEChromeDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	
	@After
	public  void Cleanup(){
		driver.quit();
	}
	
	@Test
	public void Login_trello(){
		Connection conn=null;
		Statement stmnt=null;
		
		try{
			Class.forName(jdbc_driver);
			System.out.println("connecting > >..... Db");
			conn=DriverManager.getConnection(db_url, db_username, db_password);
			stmnt=conn.createStatement();
			String sqlqry= "select * from trellologins";
			ResultSet rs=stmnt.executeQuery(sqlqry);
			ArrayList<Trello> trelloarray=new ArrayList<Trello>();
			Trello trllo=null;
			System.out.println("1st try ");
			
			while(rs.next()){
				trllo= new Trello();
				trllo.id=rs.getInt("id");
				trllo.uname=rs.getString("username");
				trllo.password=rs.getString("pwd");
				trelloarray.add(trllo);
				
			}
				for(Trello Credentials:trelloarray)	{
					System.out.println(Credentials.id+" "+Credentials.uname+" "+Credentials.password);
					driver.navigate().to("https://trello.com/login");
					driver.manage().window().maximize();
					driver.findElement(By.id("user")).sendKeys(Credentials.uname);
					driver.findElement(By.id("password")).sendKeys(Credentials.password);
					driver.findElement(By.id("login")).click();
					
					
					try{
						Waitforme(By.xpath("/html/body/div[3]/div[1]/div[4]/a[2]"), 10).click();
						driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/ul[3]/li/a")).click();
						stmnt=conn.createStatement();
						stmnt.executeUpdate("update trellologins set result='pass' where  id='"+Credentials.id+"'");
						System.out.println("signed out");
						
					}
					catch(Exception e){
						
						stmnt=conn.createStatement();
						stmnt.executeUpdate("update trellologins set result='fail' where  id='"+Credentials.id+"'");
						System.out.println("invalid credentials");
					}
				}conn.close();
				stmnt.close();
		}catch (Exception e){
			e.printStackTrace();
			
		}
	}
	
	
	
	
	

}
