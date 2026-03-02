package basic_calls;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Batch_Processing1 {

	public static void main(String[] args) throws SQLException {

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Keshav@123");
		
		con.setAutoCommit(false);
		
		Statement st=con.createStatement();
		
		st.addBatch("insert into employee values(111,'abc','abc@gmail.com'),(444,'xyz','abc@gmail.com');");
		st.addBatch("insert into employee values(222, 'abc','keshav@gmail.com');");
		
		int count=1;
		int arr[]=st.executeBatch();
		for(int i:arr)
		{
			System.out.println("affected: "+" "+i+" "+"Query: "+count);
			count++;
		}
		
		con.commit();
		con.close();
	}

}
