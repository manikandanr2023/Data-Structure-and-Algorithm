import java.sql.*;
import java.io.*;
public class DemoClass {
public static void main(String args[])

{
	try {
		String url="jdbc:mysql://localhost:3306/contact",name="root",password="Manikandan08@1";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,name,password);
	    con.setAutoCommit(false);
	    Statement stmt =con.createStatement();
	    stmt.executeUpdate("insert into user420 values(190,'abhi',400000)");
	    stmt.executeUpdate("insert into user420 values(191,'umesh',500000)");
	   con.commit();
	   con.close();
	    
	  
	}
	catch(Exception ee)	
	{
		System.out.println(ee);
	}
}
}
