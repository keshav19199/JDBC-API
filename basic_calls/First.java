package basic_calls;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class First {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Properties p=new Properties(); 
		p.put("user","root");
		p.put("password","Keshav@123");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school",p);
		
		System.out.println(con);
		
		System.out.println("Found..");
		con.close();
	}

}
