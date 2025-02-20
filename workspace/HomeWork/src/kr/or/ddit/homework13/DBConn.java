package kr.or.ddit.homework13;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn {
	
	private static Connection conn;
	
	public static Connection getConnection() {
		if(conn== null) {
			System.out.println("디비 접속 시도");
			String url  = "jdbc:oracle:thin:@192.168.145.44:1521:xe";
			String user = "C##SEM";
			String pwd  = "java";
			
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(url, user, pwd);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("디비 접속 완료");
		}
		return conn;
	}
	
}
