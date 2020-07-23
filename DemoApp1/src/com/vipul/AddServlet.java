package com.vipul;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add")
public class AddServlet extends HttpServlet{
	//doPost comes under service method only and would take only post method
	//post is used when we want to hide user credentials.
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i+j;
		//HttpSession session = req.getSession();
		//session.setAttribute("k",k);
		//res.sendRedirect("square?k="+k);   //URL re-writing method
		//Cookie cookie = new Cookie("k",String.valueOf(k));
		//res.addCookie(cookie);
		
		//res.sendRedirect("square");
		
		//req.setAttribute("K",k);
		//Session Management - whenever we want to share data from 1 servlet to other
		//Request Dispatcher
		
		//RequestDispatcher rd = req.getRequestDispatcher("square");
		//rd.forward(req, res);
		PrintWriter out = res.getWriter();
		out.println("<html><body bgcolor=orange>");
		out.println("output= "+k);
		out.println("</body></html>");
	}

}
