package com.durgasoft.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.durgasoft.beans.Student;

public class StudentService {
	Connection con= null;
	Statement st= null;
	ResultSet rs= null;
	public StudentService()
	{
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","amar");
			st=con.createStatement();	
		}catch(Exception e) {
			e.printStackTrace();	
		}	
	}
	public Student getStudent(String sid)
	{   Student std=null;
		try {
			rs=st.executeQuery("select * from student where SID ='"+sid+"'" );
			boolean b = rs.next();
			if(b==true) {
				std=new Student();
				std.setSid(rs.getString("SID"));
				std.setSname(rs.getString("SNAME"));
				std.setSaddr(rs.getString("SADDR"));
				
			}else {
				std=null;
			}
			
		}catch(Exception e) {
			
		}
		return std;
	}
	public String updateStudent(Student std)
	{
		String status="";
		try{
			int rowCount=st.executeUpdate("update student set SNAME='"+std.getSname()+"',SADDR='"+std.getSaddr()+"' where sid='"+std.getSid()+"'" );
			if (rowCount == 1) {
				status="success";
			}else {
				status="faliure";
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return status;
	}

}
