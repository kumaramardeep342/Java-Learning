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
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String sid=request.getParameter("sid");
		String sname=request.getParameter("sname");
		String saddr=request.getParameter("saddr");
		
		Student std=new Student();
		std.setSid(sid);
		std.setSname(sname);
		std.setSaddr(saddr);
		
		StudentService stdService=new StudentService();
		String status=stdService.updateStudent(std);
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h2 style='color:red;' align='center'> Durga software solutions</h2>");
		out.println("<h3 style='color:blue;'align='center'> Student Updateion Status</h3>");
		out.println("<h1 style='color:red;' align='center'>");
		if(status.equals("success")) {
			out.println("Student Updation Success");
		}else {
			out.println("Student Updation Faliure");
		}
		out.println("</h1>");
		out.println("<h3 align='center'>");
		out.println("<a href ='./updateform.html'>|Student Updation Form|</a> ");
		out.println("</h3></body></html");
		
	}

}
