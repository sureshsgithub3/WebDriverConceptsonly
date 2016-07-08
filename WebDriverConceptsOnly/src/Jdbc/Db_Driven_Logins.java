package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Db_Driven_Logins {
	
	static final String Jdbc_Driver="com.mysql.jdbc.Driver";
	static final String DB="jdbc:mysql://localhost:3306/JDBC_database";
	static final String DB_Username="suresh";
	static final String DB_password="pass@word1";
	
	public static WebDriver  driver;
	
	
	public static String uname;
	public static String password;
    public static	ArrayList<String>al= new ArrayList<String>();
    public static	ArrayList<String>al1=new ArrayList<String>();
	
	
	
	public static void  Readingdata(){
		
		Connection conn=null;
		Statement stmt=null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("connecting DB....");
			
			conn=DriverManager.getConnection(DB,DB_Username,DB_password);
			stmt=conn.createStatement();
			
			String sql;
			
			sql="Select * from trellologins";
			
			ResultSet rs=stmt.executeQuery(sql);
			
			
			
			while(rs.next()){
				//int id=rs.getInt("ID");
				uname=rs.getString("username");
				password=rs.getString("pwd");
				al.add(uname);
				al1.add(password);
				
				
				
						
						
				
				
			//	System.out.println("username is :"+Un);
				
				//System.out.println("Password id :"+pwd);
			
				//System.out.println("User id : "+id);
						}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	
	}
	 
	public static  void printingcredentials(){
		//Iterator<String>itr=al.iterator();
		//Iterator<String>itr1=al1.iterator();
		
		/*for(String s:al){
		System.out.println("un is "+s);
		
		  
		}
		for(String s1:al1){
			System.out.println("pwdis :"+s1);
		}*/
		
		
		for(int i=0; i<al.size();i++)
		{
			System.out.println("un is "+al.get(i));
			if(i<=al1.size())
			{
				System.out.println("pwdis :"+al1.get(i));
			}
		}
	}
	
	public  static void logintrello() throws InterruptedException{
		System.out.println("size of al1 :"+al1.size());
		System.out.println("size of al :"+al.size());
		driver= new FirefoxDriver();
		//driver.get("https://trello.com/login");
		//Thread.sleep(3000);
		
	for(int i=0;i<al.size();i++){
		driver.get("https://trello.com/login");
		String curl="https://trello.com/";
		Thread.sleep(3000);
		System.out.println("username is :"+al.get(i));
		Thread.sleep(2000);
		driver.findElement(By.id("user")).sendKeys(al.get(i));		
		String expectedtxt="Invalid password";		
		if(i<al1.size()){
			System.out.println("pwd :"+al1.get(i));
			driver.findElement(By.id("password")).sendKeys(al1.get(i));
			driver.findElement(By.id("login")).click();
			Thread.sleep(5000);
			if(driver.getCurrentUrl().equals(curl)){
				System.out.println(driver.getCurrentUrl());
				System.out.println("valid ");
				Thread.sleep(5000);				
				driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[4]/a[2]")).click();
				if(driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/ul[3]/li/a")).isDisplayed()){
					driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/ul[3]/li/a")).click();
				}
			}			
			else if(!driver.getCurrentUrl().equals(curl)){				  
				  System.out.println("invalid");
		   }			
		}	
	} 		
	//System.out.println("Text is ",driver.findElement(By.xpath("/html/body/section/div/div/div[2]/p")).getText());		
	}	
	
	@Test
	public void PrintAll() throws InterruptedException{
		Db_Driven_Logins.Readingdata();
		//Db_Driven_Logins.printingcredentials();		
		Db_Driven_Logins.logintrello();		
	}
}