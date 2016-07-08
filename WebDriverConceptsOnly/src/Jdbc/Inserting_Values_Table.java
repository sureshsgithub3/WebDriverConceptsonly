package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Inserting_Values_Table {
	
	public static String jdbc_driver="com.mysql.jdbc.Driver";
	public static String DB_URL="jdbc:mysql://localhost:3306/Test_Sele1";
	static final String user="root";
	static final String password="pcadmin";

	public static void main(String[] args) throws SQLException {
		Connection conn=null;
		Statement stmt=null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connecting DB.........");
			
			
			conn=DriverManager.getConnection(DB_URL,user,password);
			stmt=conn.createStatement();
			String sql;
		 	sql="insert into login (UserName,Password) values('emma','pass@word1')";
		 	stmt.executeUpdate(sql);
		 	
		}
		

	
	catch(Exception e){
		e.printStackTrace();
		
	}finally{
		if(conn!=null)
			conn.close();
			
	}

}
}
