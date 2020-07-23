package com.vipul;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException {
		//JSTL ->JSP standard tag library
		String name = "vipul";
		Student s = new Student(1,"vipul");
		req.setAttribute("label",name);
		req.setAttribute("s",s);
		RequestDispatcher rd = req.getRequestDispatcher("display.jsp");
		rd.forward(req,res);
		
		
	}

}
