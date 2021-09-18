package com.phase2.assignments;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebServlet("/EmployeeServlet1")
public class EmployeeDashboard extends HttpServlet {

	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try{
		      response.setContentType("text/html");
		      PrintWriter pwriter = response.getWriter();

		      HttpSession session=request.getSession(); 
		      String myName=(String)session.getAttribute("ID");
		      String myPass=(String)session.getAttribute("PWD");
		      
		      pwriter.print("Hello  "+myName +" Wecome to your Dashboard");
		      //pwriter.print("Your Password is: "+myPass);
		      
		      
		      
		      session.setAttribute("SHOWID",myName);
		      session.setAttribute("SHOWPWD",myPass);
		      session.setMaxInactiveInterval(2000); 
		      
		      pwriter.println("<a href='info'>Click here for More Info</a>");
		      pwriter.close();
		    }catch(Exception exp){
		       System.out.println(exp);
		     }
	}
}

