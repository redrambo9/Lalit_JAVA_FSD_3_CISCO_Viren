package com.java.assistedassignments;

import java.sql.CallableStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

public class ProductID {
	
	static String url = "jdbc:mysql://localhost:3306/db_world";
    static String user = "root";
    static String password = "root";
    
	static Connection con;
    static Statement stmt;
    static ResultSet rs;
    static PreparedStatement prSt;
	
   public static void main(String[] args) {
      
	    
	    	String query1= "select * from product where id = ?";
	    	
	    	try {     	
	        	try {
					Class.forName("com.mysql.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}  	
	            // opening database connection to MySQL server
	            con = DriverManager.getConnection(url, user, password);

	            // getting Statement object to execute query
	            prSt = con.prepareStatement(query1);
	            
	            Scanner s = new Scanner(System.in);	
	            
	            System.out.print("Enter the Product ID:  ");
	            int inp = s.nextInt();
	            
	            
	            prSt.setInt(1, inp);
	    	
	    	     rs = prSt.executeQuery(); 
	    	
	    	while (rs.next()) 
	    	{ 
	    	   int id = rs.getInt(1); 
	    	   String name = rs.getString(2); 
	    	   String price = rs.getString(3); 
	    	   System.out.printf("Product ID : %d, Product Name: %s, Price : %s %n", id, name, price); 
	    	}
	       }
	    	catch (SQLException sqlEx) 
	    	{
	            sqlEx.printStackTrace();
	        } 
	    	finally 
	    	{
	            //close connection ,stmt and resultset here
	            try 
	            { 
	            	con.close(); 
	            
	            } 
	            catch(SQLException se) 
	            { 
	            	/*can't do anything */ 
	            	
	            }
	           
	            try 
	            { 
	            	rs.close(); 
	            } 
	            catch(SQLException se) 
	            {
	            	/*can't do anything */ 
	            }
	        }
	   
  }
}
