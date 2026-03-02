package basic_calls;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_Connection4 {

	public static void main(String[] args) throws SQLException {

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Keshav@123");
	
		PreparedStatement pt=con.prepareStatement("select * from employee where E_id=2");
		
		{
			boolean flag=
					pt.execute();
			if(flag)
			{
				ResultSet rs=pt.getResultSet();
				while(rs.next())
				{
					System.out.println(rs.getInt(1));
					System.out.println(rs.getString(2));
					System.out.println(rs.getString(3));
				}
			}
		}
	}

}
