package com.phase2.assignments;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet  
{
    protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
    	PrintWriter pw=res.getWriter();
		res.setContentType("text/html");

		ServletContext conf=getServletContext(); //Step 1: create the object of servletconfig

		// rertirve the values from the web.xml
		String s1=conf.getInitParameter("n3");
		String s2=conf.getInitParameter("n4");

		pw.println("n3 value is " +s1+ " and n4 is " +s2);
		pw.println("total is " + (s1+ s2));
		
		//pw.println("Servlet Name" + conf.getServletName());
		//pw.println("Servlet Name" + conf.hashCode());

	   pw.close();	
	}
}
