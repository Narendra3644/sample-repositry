package com.slokam.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

public class GetClass {

	
	public static void main(String[] args) {
		try{
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		Statement pstmt=con.createStatement();
		
		ResultSet rs=pstmt.executeQuery("select * from login");
		while(rs.next())  
			System.out.println(rs.getString(1)+"  "+rs.getString(2));  
			con.close();  
		
		
		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
}
