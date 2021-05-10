import java.sql.*;

public class SecondJDBCExample {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost/University";
		String username = "guest";
		String password = "Randomguest12#";
		String query = "SELECT Department, FirstName, LastName, PassOutYear, UniversityRank FROM EngineeringStudents";
		
		
		try {
			Connection conn = DriverManager.getConnection(url, username, password);
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(query);
			
			while (result.next()) {
				String UniversityData = "";
				for (int i = 1; i <= 5; i++) {
					UniversityData += result.getString(i) + ": ";
				}
				System.out.println(UniversityData);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
