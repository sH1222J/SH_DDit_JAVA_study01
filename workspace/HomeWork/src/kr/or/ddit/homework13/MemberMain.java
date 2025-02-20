package kr.or.ddit.homework13;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import kr.or.ddit.util.ScanUtil;

public class MemberMain {
	public static void main(String[] args) {
		MemberMain mm = new MemberMain();
		mm.process();
	}
	Connection conn;
	Statement stmt;
	ResultSet rs;
	
	public void process() {
		conn = DBConn.getConnection();
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		while(true) {
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 종료");
			int sel = ScanUtil.nextInt("선택 : ");
			if(sel == 1) memberJoin();
			if(sel == 2) memberLogin();
			if(sel == 3) break;
		}
	}
	
	public void memberJoin() {
		// 인서트 쿼리
		String id = ScanUtil.next("ID : ");
		String pw = ScanUtil.next("PW : ");
		String nm = ScanUtil.next("NM : ");
		String sql = "INSERT INTO JAVA_MEMBER VALUES('"+id+"','"+pw+"','"+nm+"')";
		try {
			stmt.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void memberLogin() {
		// select 쿼리 작성 
		// 회원 정보 출력 
		
		String id = ScanUtil.next("ID : ");
		String pw = ScanUtil.next("PW : ");
		String sql = "SELECT * FROM JAVA_MEMBER WHERE ID = '"+id+"' AND PASS= '"+pw+"'";
		try {
			rs =  stmt.executeQuery(sql);
			int row =0;
			while (rs.next()) {
				String name = rs.getString("NAME");
				System.out.println("아이디\t비밀번호\t이름");
				System.out.println(id + "\t" + pw + "\t" + name);
				row++;
			}
			if(row ==0) System.out.println("로그인 실패");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}
