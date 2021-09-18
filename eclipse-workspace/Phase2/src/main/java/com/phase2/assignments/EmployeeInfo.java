package com.phase2.assignments;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class EmployeeInfo extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			  try{
			      response.setContentType("text/html");
			      PrintWriter pwriter = response.getWriter();
			     
			      HttpSession session=request.getSession(false);
			      
			      String myName=(String)session.getAttribute("SHOWID");
			      String myPass=(String)session.getAttribute("SHOWPWD");
			      
			      pwriter.print("<br>");
			      pwriter.print("session creation time" + session.getCreationTime());
			      pwriter.print("<br>");
			      pwriter.print("session last accessed time" +session.getLastAccessedTime());
			      pwriter.print("<br>");
			      pwriter.print("session max interval time" +session.getMaxInactiveInterval());
			      pwriter.print("<br>");
			      pwriter.print("session servelt context" +session.getServletContext());
			      
			      session.invalidate();
			      pwriter.print("<br>");
			      
			      pwriter.print("ID is : "+myName+" Password is : "+myPass);
			      pwriter.close();
			  }catch(Exception exp){
			      System.out.println(exp);
			   }
		
	}

}
