package com.durgatsoft.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.io.InputStreamReader;
import java.io.BufferedReader;;
public class JdbcApp03 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement st = null;
		BufferedReader br = null;
		try
		{
		//Load and Register Driver
		Class.forName("oracle.jdbc.OracleDriver");
		//Establish the connection between java application and database
		con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","amar");
		//Create the statement
		st=con.createStatement();
		//prepare the sql queries
		br=new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.println("Employee Number	: ");
			int eno=Integer.parseInt(br.readLine());
			System.out.println("Employe Name :	");
			String ename=br.readLine();
			System.out.println("Employee Salary : ");
			float esal = Float.parseFloat(br.readLine());
			System.out.println("Employee Address : ");
			String eaddr =br.readLine();
			String query = "insert into emp1 values("+eno+",'"+ename+"',"+esal+",'"+eaddr+"')";
			st.executeUpdate(query);
			System.out.println("Employee Inserted Successfully");
			System.out.println("onemore Employee[yes/no]? :");
			String option = br.readLine();
			if(option.equalsIgnoreCase("yes")) {
				continue;
			}
			else {
				break;
			}	
		}

		}catch(Exception e) {
		 e.printStackTrace();	
		}finally {
			try {
			br.close();
			st.close();
			con.close();
			}catch(Exception e) {
				 e.printStackTrace();
			}
		}
	}
}
