package basic_calls;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_Connection1 {

	public static void main(String[] args) throws Exception {

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","Keshav@123");
		System.out.println(con);
		
		System.out.println("class found...");
		con.close();
	}

}
