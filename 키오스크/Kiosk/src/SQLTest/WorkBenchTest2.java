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
	private final String DB_URL = "jdbc:mysql://localhost/flower?&useSSL=false"; //접속할 DB 서버
	
	private final String USER_NAME = "loveflower"; //DB에 접속할 사용자 이름을 상수로 정의
	private final String PASSWORD = "1234!@"; //사용자의 비밀번호를 상수로 정의
	
	public WorkBenchTest2() throws IOException {
		Connection conn = null;
		Statement state = null;
		
		FileWriter fw=new FileWriter("꽃.txt", true);    //파일명과 같은 파일명이 존재할시 덧붙여쓸여부판단
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
				System.out.println("꽃 이름 : " + name + "\n재고 : " + stock + "\n가격 : " + price);
				System.out.println("====================\n");
				
	             
	            bf.write(name +"\t");
	            bf.write(stock +"\t");
	            bf.write(price +"\n");    //마지막은 입력후 한줄 내린다.
			}
			
			rs.close();
			state.close();
			conn.close();
			
			bf.close();

            
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
	public static void main(String[] args) throws IOException {
		new WorkBenchTest2();
	}
}
