package com.java.assistedassignments;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionLogin extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		//HttpSession session=req.getSession(); 
		
		PrintWriter out = resp.getWriter();
		//req.getRequestDispatcher("sessionloginlogout.html").include(req, resp);  
		String user = req.getParameter("user");
		String pass = req.getParameter("password");
		
		if ("lalit".equals(user) && "lalit@123".equals(pass)) {
			
			out.println("Login OK");
			
			HttpSession session=req.getSession(); 
			
			out.println("<a href='loggingout'>Logout of session</a><br>");
		} 
		else {
			out.println("Invalid login try again");
			//req.getRequestDispatcher("sessionloginlogout.html").include(req, resp);  
		}
		out.close();
	}
}

