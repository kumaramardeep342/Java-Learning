package com.durgasoft.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String uname=request.getParameter("uname");
		String upwd=request.getParameter("upwd");
		
		out.println("<html>");
		out.println("<body>");
		out.println("<br><br>");
		out.println("<h2 style='color:red;' align='center'>");
		if(uname.equals("amar")&& upwd.equals("amar")) {
			out.println("User Login Success");
		}else {
			out.println("User Login Failure");
		}
		out.println("</h2>");
		out.println("<br><br>");
		out.println("<h3 style='color:red;' align='center'>");
		out.println("<a href ='./loginform.html'>|Login Page|</a>");
		out.println("</h3>");
		out.println("</body></html>");
	}
}
