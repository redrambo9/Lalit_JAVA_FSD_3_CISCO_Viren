package com.java.assistedassignments;


import java.io.*;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Get_and_Post extends HttpServlet {
   
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
               
                    PrintWriter out = response.getWriter();
                    out.println("<html><body>");
                    
                    String input = request.getParameter("fname");
                    
                    
                    out.println("This is doGet method");
                    out.println("<br/> You Entered =" +input );
                    out.println("</body></html>");
                    
        }

        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            
          PrintWriter out = response.getWriter();
            out.println("<html><body>");
            String input2 = request.getParameter("fname1");
            
            
            out.print("This is doPost method");
            out.print("<br/> You Entered =" +input2 );
            out.println("</body></html>");
           
        }
        
       

}
