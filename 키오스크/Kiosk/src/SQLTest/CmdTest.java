package SQLTest;

import java.sql.*;

public class CmdTest {
	private final String DB_URL = "jdbc:mysql://localhost/test?&useSSL=false"; //������ DB ����
		
	private final String USER_NAME = "tester"; //DB�� ������ ����� �̸��� ����� ����
	private final String PASSWORD = "1234!@"; //������� ��й�ȣ�� ����� ����
	
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
			System.out.println("���� �߻�");
		}finally {
			try {
				if(state != null)
					state.close();
			}catch(SQLException se1) {
				System.out.println("SQL���� �߻�");
			}
			
			try {
				if(conn != null) 
					conn.close();
			}catch(SQLException se2) {
				System.out.println("SQL���� �߻�");
			}
		}
		System.out.println("MySQL Close");
	}
	public static void main(String args[]) {
		new CmdTest();
	}

}
