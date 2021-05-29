import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class JDBCExample {
	static final String DB_URL = "jdbc:mysql://localhost/TUTORIALSPOINT"; 
	static final String USER = "guest";
	static final String PASS = "Randomguest12#";
	
	public static void main(String[] args) {
		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();) {
			String sql = "SELECT * FROM Registration;";
			ResultSet result = stmt.executeQuery(sql);
			while (result.next()) {
				System.out.println("Id: " + result.getInt("id"));
				System.out.println("First Name: " + result.getString("firstName"));
				System.out.println("Last Name: " + result.getString("lastName"));
				System.out.println("Age: " + result.getInt("age"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
