package JDBC_pro1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Jdbc_datadriven2 {
	
	// Declaration of jdbc driver ,db url,db username and password
	
	static final String JDBC_Driver="com.mysql.jdbc.Driver";
	static final  String DB_url="jdbc:mysql://localhost:3306/jdbc_database";
	static final  String DB_username="suresh";
	static final  String DB_password ="pass@word2";
	
	public WebDriver driver;
	
	
	
	// wait method
	public WebElement Waitforelement(By locator,int seconds){
		return new WebDriverWait(driver, seconds).until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	// browser open
	
	@Before
	public void Init(){
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
	}
	// browser close
	@After
	public void close(){
		driver.quit();
	}
	
	static final String baseurl="https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=12&ct=1464340946&rver=6.4.6456.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f&lc=1033&id=292841&mkt=en-us&cbcxt=out&fl=wld";
	
	
	@Test
	public void  Test(){
		Connection conn=null;
		Statement stmnt=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("connecting db.........");
			
			conn=DriverManager.getConnection(JDBC_Driver, DB_username, DB_password);
			stmnt=conn.createStatement();
			
			String sql;
			sql="Select * from maillogins";
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
