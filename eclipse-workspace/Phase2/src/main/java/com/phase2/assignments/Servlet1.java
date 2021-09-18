package com.phase2.assignments;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet1 extends HttpServlet  
{
    protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
    	PrintWriter pw=res.getWriter();
		//res.setContentType("text/html");
    	
    	pw.println("<html><body>");

		ServletContext conf=getServletContext(); //Step 1: create the object of servletcontext

		// retrieve the values from the web.xml
		String s1=conf.getInitParameter("n1");
		String s2=conf.getInitParameter("n2");
		String s3=conf.getInitParameter("n3");
		String s4=conf.getInitParameter("n4");

		pw.println("n1 = " +s1+ " and n2  =" +s2 +"n3 = " +s3+ "n4 = "+s4);
		pw.println("total is " + (s1+ s2+s3+s4));
		//out.println("Name=" + name + "<br>Address=" + address);
        pw.println("</body></html>");

	   pw.close();	
	}
}
