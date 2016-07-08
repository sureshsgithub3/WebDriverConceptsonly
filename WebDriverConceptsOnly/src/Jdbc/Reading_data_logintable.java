package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Reading_data_logintable {
	
	static final String JDBC_Driver="com.mysql.jdbc.Driver";
	static final String DB_Url="jdbc:mysql://localhost:3306/JDBC_database";
	static final String user="suresh";
	static final String password="pass@word1";

	public static void main(String[] args) {
		
		Connection conn= null;
		Statement stmt=null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("conneting DB.....");
			conn=DriverManager.getConnection(DB_Url,user,password);
			stmt=conn.createStatement();
			String sql;
			sql="Select * from users";
			
			ResultSet rs=stmt.executeQuery(sql);
			
			while(rs.next()){
				//int id=rs.getInt("ID");
				String  fstname=rs.getString("username");
				String  lstname=rs.getString("city");
				
				
				//System.out.print("ID :"+ id);
				System.out.println("name :"+fstname);
				System.out.println("lastname :"+lstname);
				//rs.close();
				//stmt.close();
				//conn.close();
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		

	}

}
