package com.java.assistedassignments;

import java.io.*;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

//@WebServlet("/hiddenformlogin")
public class HiddenFormServlet extends HttpServlet {

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                
                PrintWriter out = response.getWriter();
                out.println("<html><body>");
                    
                String userId = request.getParameter("userid");
                out.println("Welcome "+userId); 
                
                //creating a new hidden form field
                out.println("<form action='hiddenformdashboard' method='post'>");
                out.println("<input type='hidden' name='uname' value='"+userId+"'>");
                out.println("<input type='submit' value='go' >");
                out.println("</form>");
                //out.println("<script>document.forms[0].submit();</script>");         
        }

        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
               
                doGet(request, response);
        }

}

