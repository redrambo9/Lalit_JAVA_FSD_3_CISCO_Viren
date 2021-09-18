package com.java.assistedassignments;

import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
  
  
public class HttpWithsession extends HttpServlet {  
  
public void doGet(HttpServletRequest request, HttpServletResponse response){  
        try{  
  
        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
          
        String n=request.getParameter("userName");  
        out.print("Welcome "+n);  
          
        HttpSession session=request.getSession();  
        session.setAttribute("uname",n);  
  
        out.print("<a href='servlet2'> Without Session</a>");  
                  
        out.close();  
  
                }catch(Exception e)
        		{
                	System.out.println(e);
                }  
    }  
  
}  