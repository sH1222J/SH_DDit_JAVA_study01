package kr.or.ddit.study06.sec05.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import kr.or.ddit.util.ScanUtil;

public class DBmain {
	public static void main(String[] args) {
		DBmain db = new DBmain();
		db.selectAll();
	}

	Connection conn; 
	Statement stmt;
	ResultSet rs;
	
	public void selectAll() {
		
		try {
			stmt.executeQuery("");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("selectAll 실행");
		try {
			conn = DBConn.getConnection();
			stmt = conn.createStatement();
			String sql = "SELECT * FROM MEMBER";
			
			rs = stmt.executeQuery(sql);
			
			String query = ScanUtil.next("취미 : ");
			while(rs.next()) {
				String mid = rs.getString("MEM_ID");
				String name = rs.getString("MEM_NAME");
//				String add  = rs.getString("MEM_ADD1");
//				// 용운동 사는사람만 출력
//				if(add.contains(query)) {
//					System.out.println(mid+"\t"+name+"\t"+add);
//				}
				
				String hobby = rs.getString("MEM_HOBBY");
				// 취미 
				if(hobby.equals(query)) {
					System.out.println(mid+"\t"+name+"\t"+hobby);
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
