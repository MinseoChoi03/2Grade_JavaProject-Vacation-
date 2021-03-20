package SQLTest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class WorkBenchTest2 {
	private final String DB_URL = "jdbc:mysql://localhost/flower?&useSSL=false"; //������ DB ����
	
	private final String USER_NAME = "loveflower"; //DB�� ������ ����� �̸��� ����� ����
	private final String PASSWORD = "1234!@"; //������� ��й�ȣ�� ����� ����
	
	public WorkBenchTest2() throws IOException {
		Connection conn = null;
		Statement state = null;
		
		FileWriter fw=new FileWriter("��.txt", true);    //���ϸ�� ���� ���ϸ��� �����ҽ� ���ٿ��������Ǵ�
        BufferedWriter bf=new BufferedWriter(fw);
		
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
				
	             
	            bf.write(name +"\t");
	            bf.write(stock +"\t");
	            bf.write(price +"\n");    //�������� �Է��� ���� ������.
			}
			
			rs.close();
			state.close();
			conn.close();
			
			bf.close();

            
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
	public static void main(String[] args) throws IOException {
		new WorkBenchTest2();
	}
}
