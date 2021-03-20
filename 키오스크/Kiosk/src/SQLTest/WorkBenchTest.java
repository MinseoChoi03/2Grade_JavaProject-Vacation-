package SQLTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class WorkBenchTest {
	private final String DB_URL = "jdbc:mysql://localhost/test2?&useSSL=false"; //접속할 DB 서버
	
	private final String USER_NAME = "tester"; //DB에 접속할 사용자 이름을 상수로 정의
	private final String PASSWORD = "1234!@"; //사용자의 비밀번호를 상수로 정의
	
	public WorkBenchTest() {
		Connection conn = null;
		Statement state = null;
		
		try {
			conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
			System.out.println("[MySQL Connection]\n");
			state = conn.createStatement();
			
			String sql;
			sql = "SELECT * FROM flower";
			ResultSet rs = state.executeQuery(sql);
			
			while(rs.next()) {
				String name = rs.getString("name");
				String stock = rs.getString("stock");
				String price = rs.getString("price");
				System.out.println("꽃 이름 : " + name + "\n재고 : " + stock + "\n가격 : " + price);
				System.out.println("====================\n");
			}
			
			rs.close();
			state.close();
			conn.close();
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("예외 발생");
		}finally {
			try {
				if(state != null)
					state.close();
			}catch(SQLException se1) {
				System.out.println("SQL예외 발생");
			}
			
			try {
				if(conn != null) 
					conn.close();
			}catch(SQLException se2) {
				System.out.println("SQL예외 발생");
			}
		}
	}
	public static void main(String[] args) {
		new WorkBenchTest();
	}
}
