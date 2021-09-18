package com.phase2.assignments;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class EmployeeLogin extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
		
		PrintWriter pw=resp.getWriter();
		
		String user = req.getParameter("id");
		String pass = req.getParameter("password");
		
		HttpSession session=req.getSession();
		
	      // I have created three servlets that's why I am passing parameteres from one servlet to another
		    // using setAttribute method else I have created one html page then fetched parameter using 
		// request.getparameters and then passed to other two servlets
	      session.setAttribute("ID",user);
	      session.setAttribute("PWD",pass);
	      session.setMaxInactiveInterval(2000);
		
		//pw.println("ID is :" +user);
		//pw.println("Password is " +pass);
		pw.println("Login OK\n");
		pw.println("<a href='dashboard'>Click here for DashBoard</a>");
		pw.close();
		
		
		
	}
	
	private void response(HttpServletResponse resp, String msg) throws IOException {
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		//out.println("<t1>" + msg + "</t1>");
		out.println("</body>");
		out.println("</html>");
	}

}

