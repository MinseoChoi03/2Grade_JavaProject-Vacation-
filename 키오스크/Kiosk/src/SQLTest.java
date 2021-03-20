import java.sql.*;

public class SQLTest {
	public static void main(String[] args) {
		Connection conn;
		
		try {
			String dbURL = "jdbc:mysql://localhost:3306/JBS?serverTimezone=UTC";
			String dbID = "Mirim";
			String dbPassword = "mirim";
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
