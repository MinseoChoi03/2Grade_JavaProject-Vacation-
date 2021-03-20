package SQLTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class WorkBenchTest {
	private final String DB_URL = "jdbc:mysql://localhost/test2?&useSSL=false"; //������ DB ����
	
	private final String USER_NAME = "tester"; //DB�� ������ ����� �̸��� ����� ����
	private final String PASSWORD = "1234!@"; //������� ��й�ȣ�� ����� ����
	
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
				System.out.println("�� �̸� : " + name + "\n��� : " + stock + "\n���� : " + price);
				System.out.println("====================\n");
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
	}
	public static void main(String[] args) {
		new WorkBenchTest();
	}
}
