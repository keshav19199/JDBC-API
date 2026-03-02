package basic_calls;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_Connection3 {

	public static void main(String[] args) throws SQLException {

		try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Keshav@123");

				PreparedStatement st=con.prepareStatement("select * from employee where E_id=1;");)
						
		{
			boolean flag=st.execute();
			if(flag)
			{
				System.out.println("DQL");
				
				ResultSet rs=st.executeQuery();
				
				while(rs.next())
				{
					System.out.println(rs.getInt(1));
					System.out.println(rs.getString(2));
					System.out.println(rs.getString(3));
					System.out.println("*********");
				}
			}
			else
			{
				int row =st.getUpdateCount();
				
				System.out.println("Rows affected: "+row);
				
			}
		}
	}

}
