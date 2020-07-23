package com.vipul;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/* 
 Servletconfig and  servletcontext*/

public class MyServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{
		PrintWriter out = res.getWriter();
		out.println("Hi ");
		//servletconfig is used to make changes on every servlet
		//while sevletcontext is use for every servlet.
		ServletConfig cg = getServletConfig();
		String str = cg.getInitParameter("name");
		out.println(str);
		ServletContext ctx = getServletContext();
		String str2 = ctx.getInitParameter("Phone");
		out.println(str2);
	}

}
