package com.vipul;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter("/addAlien")
public class idFilter implements Filter {

    public idFilter() {
        
    }

	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest)request;
	
		 int aid = Integer.parseInt(req.getParameter("aid"));
		 PrintWriter out = response.getWriter();
		 if(aid>1)
			 chain.doFilter(request, response);   /*it is fofr chaining of filter if it is last then it will call servlet*/
		 else
			 out.println("Invalid id");
		
		
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
