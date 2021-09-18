package com.phase2.assignments;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class authbook {
	
	static String url = "jdbc:mysql://localhost:3306/db_world";
    static String user = "root";
    static String password = "root";
    static String sql = "{call myproc5(?,?,?)}";
    //	This is the procedure 
    /*delimiter //
     create procedure myproc5(IN pid int, IN newprice int, INOUT new_auth varchar(50))
     begin
     declare Name varchar(50);
     declare id2 int;
     select author into id2 from book where BookId=pid; 
     select authorName into Name from author where author_id=id2;
     update author set authorName=new_auth where author_id=id2;
     update book set price=newprice where  BookId = pid;
     set new_auth = Name;
     
     end //
    */
	private static Connection con;
	
   public static void main(String[] args) {
      
      try {
    	  
    	  //STEP 2: Register JDBC driver
	      try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	      //STEP 3: Open a connection
	      System.out.println("Connecting to database...");
	      con = DriverManager.getConnection(url, user, password);
	      
	      CallableStatement stmt=con.prepareCall(sql);
         
         //Set IN parameter
         stmt.setInt(1, 2);
         
         stmt.setInt(2, 1200);
         
         //Set OUT parameter
         //stmt.registerOutParameter(2, Types.VARCHAR);
         
         //Set INOUT parameter
         stmt.setString(3, "Harry Potter");
         stmt.registerOutParameter(3, Types.VARCHAR);
         
         //Execute stored procedure
         stmt.execute();
         
         // Get Out and InOut parameters
         //System.out.println("Price = "+stmt.getInt(2));
         System.out.println("Old Author = "+stmt.getString(3));
         
      } catch (SQLException e) {
         e.printStackTrace();
         e.getErrorCode();
      }
   }
}
