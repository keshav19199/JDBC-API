package basic_calls;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_connection5 {

	public static void main(String[] args) throws SQLException {

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Keshav@123");
		
		CallableStatement call = con.prepareCall("{call find();}");
		
		
	}

}
