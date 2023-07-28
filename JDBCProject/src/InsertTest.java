import java.sql.Connection;
import java.sql.DriverManager; // all methods throws SQLException
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTest {

	public static void main(String[] args) {
		try {
			
			//1.load the driver
			System.out.println("Trying to load the driver...");
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver is loaded..");
			//2
			System.out.println("Trying to connect the driver..");
			Connection conn=DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb");
			
			System.out.println("Connected :"+conn);
			//3. make a desired statement (insert/update/delete/select)
			
			PreparedStatement pst = 
					conn.prepareStatement("INSERT INTO MYDEPT120 VALUES (?,?,?)");
			pst.setInt(1, 50);
			pst.setString(2,"ELECTRONICS");
			pst.setString(3,"PUNE");
			
			System.out.println("PreparedStatement is created :"+pst);
			
			
			//4. execute that statement //  UR TABLENAME IS 
			int rows = pst.executeUpdate();
			
			System.out.println("Rows created : "+rows);
			
			//5. process teh result if any
			
			//6. close the statement, and connection
			pst.close();
			pst.close();
			conn.close();
			System.out.println("Disconnected from the database....");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
