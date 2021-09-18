package com.java.assistedassignments;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Validation_of_UserLogin extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		String user = req.getParameter("user");
		String pass = req.getParameter("password");
		
		if ("lalit".equals(user) && "lalit@123".equals(pass)) {
			
			
			response(resp, "Login OK");
			
            HttpSession session=req.getSession();
            out.println("<html>");
    		out.println("<body>");
    		out.println("<br></br>");
    		out.println("</body>");
    		out.println("</html>");
            
			out.println("\nWelcome "+user);
			
			out.println("<html>");
    		out.println("<body>");
    		out.println("<br></br>");
    		out.println("</body>");
    		out.println("</html>");
			out.println("<a href='loggingout'>Logout of session</a><br>");
			
			
		} else {
			response(resp, "Invalid login");
		}
	}
	
	

	private void response(HttpServletResponse resp, String msg)
			throws IOException {
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("<t1>" + msg + "</t1>");
		out.println("</body>");
		out.println("</html>");
	}
	

}

