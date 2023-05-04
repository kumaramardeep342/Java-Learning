package com.durgasoft.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.durgasoft.beans.Student;
import com.durgasoft.service.StudentService;

/**
 * Servlet implementation class EditFormServlet
 */
@WebServlet("/edit")
public class EditFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String sid= request.getParameter("sid");
		
		StudentService stdService=new StudentService();
		Student std = stdService.getStudent(sid);
		if (std == null) {
			out.println("<html>");
			out.println("<body>");
			out.println("<h2 style='color:red;' align='center'> Durga Software Solutions</h2>");
			out.println("<h3 style='color:blue;' align='center'> Student Updation Form</h2>");
			out.println("<h1 style='color:blue;' align='center'> Student Not Existed </h1>");
			out.println("<h3 align='center'>");
			out.println("<a href ='./updateform.html'>|Student Update Form|</a>");
			out.println("</h3></body></html>");	
		}
		else
		{
			out.println("<html>");
			out.println("<body>");
			out.println("<h2 style='color:red;' align='center'> Durga Software Solutions</h2>");
			out.println("<h3 style='color:blue;' align='center'> Student Updation Form</h2>");
			out.println("<form method='POST' action='./update'>");
			out.println("<table align='center'>");
			out.println("<tr><td>Student ID </td><td>"+std.getSid()+"</td></tr>");
			out.println("<input type='hidden' name='sid' value='"+sid+"'/> ");
			out.println("<tr><td>Student Name</td><td><input type='text' name='sname' value='"+std.getSname()+"'/></td></tr>");
			out.println("<tr><td>Student Address</td><td><input type='text' name='saddr' value='"+std.getSaddr()+"'/></td></tr>");
			out.println("<tr><td><input type='submit' value='update'</td></tr>");
			out.println("</table></form></body></html>");		
		}
				
	}

}
