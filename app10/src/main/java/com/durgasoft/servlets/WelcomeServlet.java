package com.durgasoft.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet(
		name = "AnnoatedServlet", 
		urlPatterns = { "/welcome" },
		loadOnStartup=1,
		initParams = { 
				@WebInitParam(name = "A", value = "AA"), 
				@WebInitParam(name = "B", value = "BB")
		})
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static {
		System.out.println("Servlet Loading");
	}
	public WelcomeServlet()
	{
		//constructor
		System.out.println("Servlet Instantiation");
	}
	@Override
	public void init()throws ServletException
	{
		System.out.println("Servlet initialization");
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		ServletConfig config= getServletConfig();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>");
		out.println("Welcome to Annotations in Servlets<br>");
		//display logical name
		out.println("Logical Name :" +config.getServletName()+"<br>");
		//display initialization parameter
		out.println("a ------>"+config.getInitParameter("A")+"<br>");
		out.println("b ------>"+config.getInitParameter("B")+"<br>");
		out.println("</h1></body></html>");
	}
	@Override
	public void destroy() {
		System.out.println("Servlet Deinstantiation");
	}
	
}
