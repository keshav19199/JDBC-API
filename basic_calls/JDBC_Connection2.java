package basic_calls;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_Connection2 {

	public static void main(String[] args) throws SQLException {

		try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Keshav@123");

		PreparedStatement st=con.prepareStatement("select * from employee;");
				
				ResultSet rs= st.executeQuery();)
		
		
				{
					while(rs.next())
					{
						System.out.println("id: "+rs.getInt(1));
						System.out.println("id: "+rs.getString(2));
						System.out.println("id: "+rs.getString(3));
					}
				}
	}

}
