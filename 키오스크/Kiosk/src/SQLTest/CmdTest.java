package SQLTest;

import java.sql.*;

public class CmdTest {
	private final String DB_URL = "jdbc:mysql://localhost/test?&useSSL=false"; //접속할 DB 서버
		
	private final String USER_NAME = "tester"; //DB에 접속할 사용자 이름을 상수로 정의
	private final String PASSWORD = "1234!@"; //사용자의 비밀번호를 상수로 정의
	
	public CmdTest() {
		Connection conn = null;
		Statement state = null;
		
		try {
			conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
			System.out.println("[MySQL Connection]\n");
			state = conn.createStatement();
			
			String sql;
			sql = "SELECT * FROM test1";
			ResultSet rs = state.executeQuery(sql);
			
			while(rs.next()) {
				String num = rs.getString("number");
				String name = rs.getString("name");
				String kor = rs.getString("kor");
				String math = rs.getString("math");
				String eng = rs.getString("eng");
				System.out.println("Number : " + num + "\nName : " + name + "\nKOR : " + kor);
				System.out.println("MATH : " + math + "\nENG : " + eng + "\n----------\n");
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
		System.out.println("MySQL Close");
	}
	public static void main(String args[]) {
		new CmdTest();
	}

}
