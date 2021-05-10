import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FourthJDBCExample {
	static final String DB_URL = "jdbc:mysql://localhost/TUTORIALSPOINT";
	static final String USER = "guest";
	static final String PASS = "Randomguest12#";
	static final String QUERY = "SELECT id, first, last, age FROM Employees";
	static final String UPDATE_QUERY = "UPDATE Employees set age=33333 WHERE id=103";
	
	public static void main(String[] args) {
		
		try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement stmt = conn.createStatement();) {
			Boolean ret = stmt.execute(UPDATE_QUERY);
			System.out.println("Return value is : " + ret.toString());
			
			int rows = stmt.executeUpdate(UPDATE_QUERY);
			System.out.println("Rows impacted : " + rows);
			
			ResultSet rs = stmt.executeQuery(QUERY);
			
			while (rs.next()) {
				System.out.println("ID: " + rs.getInt("id"));
				System.out.println(", Age: " + rs.getInt("age"));
				System.out.println(", FirstName: " + rs.getString("first"));
				System.out.println(", LastName: " + rs.getString("last"));
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
