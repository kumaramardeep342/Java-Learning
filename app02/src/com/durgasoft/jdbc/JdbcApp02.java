package com.durgasoft.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
//import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcApp02 {

	public static void main(String[] args)throws Exception {
		
		 //Load and register driver
		 try {
			 Class.forName("oracle.jdbc.OracleDriver");  
		 }catch (ClassNotFoundException e) {
			 e.printStackTrace();
		 }
		 //Establish Connection between Java application and database
		  Connection con = null;
		 try { 
			 con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","amar");
		 }catch(SQLException e) {
			 e.printStackTrace();
		 }
		 if (con != null) {
		        System.out.println("Successfully connected to DB");
		        } else {
		         System.out.println("Failed to connect to DB");
		       }
		 Statement st = con.createStatement();
		 BufferedReader br =new BufferedReader(new InputStreamReader(System.in ));
		 System.out.println("Table Name : ");
		 String tname= br.readLine();
		 String query = "create table " +tname+"(ENO number(3) primary key , ENAME varchar2(20),ESAL float(5),EADD varchar2(10))";
		 st.executeUpdate(query);
		 System.out.println("table"+tname+"created1 successfully");
		//Close the resources
		st.close();
		con.close();
	}
}
