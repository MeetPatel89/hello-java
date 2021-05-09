import java.sql.*;

public class FirstJDBCExample {
	static final String DB_URL = "jdbc:mysql://localhost/TUTORIALSPOINT";
	static final String USER = "guest";
	static final String PASS = "Brotherchoksi12#";
	static final String QUERY = "SELECT id, first, last, age FROM Employees";
	
	public static void main(String[] args) {
		
		// open an sql connection
		try {
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS );
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(QUERY);
			
			// Extract data from result set
			while (rs.next()) {
				//Retrieve by column name
				System.out.println("ID: " + rs.getInt("id"));
				System.out.println("Age: " + rs.getInt("age"));
				System.out.println("First: " + rs.getString("first"));
				System.out.println("Last: " + rs.getString("last"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
}
