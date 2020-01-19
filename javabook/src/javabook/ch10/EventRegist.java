package javabook.ch10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javabook.ch9.Ch9Ex3;

public class EventRegist {
	Scanner scanner= new Scanner(System.in);
	
	String jdbcDriver = "com.mysql.jdbc.Driver";
	String jdbcUrl = "jdbc:mysql://localhost/javadb";
	Connection conn;
	
	PreparedStatement pstmt;
	ResultSet rs;

	// �̺�Ʈ�� ����ϴ� ������ �޼���
	public EventRegist() {
		System.out.println("## �̺�Ʈ ����� ���� �̸��� �̸����� �Է��ϼ���");
		System.out.print("�̸�: ");
		String uname = scanner.next();
		System.out.println("�̸���: ");
		String email = scanner.next();
		
		connectDB();
		registUser(uname, email);
		printList();
		closeDB();
	}
	
	// DB ���� �޼���
	public void connectDB() {
		try {
			// 1�ܰ� : JDBC ����̹� �ε�
			Class.forName(jdbcDriver);
			
			// 2�ܰ� : �����ͺ��̽� ����
			conn = DriverManager.getConnection(jdbcUrl, "root", "1234");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// DB ���� ���� �޼���
	public void closeDB() {
		try {
			// 6�ܰ� : ���� ����
			pstmt.close();
			rs.close();
			conn.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void registUser(String uname, String email ) {
		String sql = "insert into event values(?, ?)";
		try {
			// 3�ܰ� : Statement ����
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, uname);
			pstmt.setString(2, email);
			
			// 4�ܰ� : SQL �� ����
			pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void printList() {
		System.out.println("# ����� ���");
		String sql = "select * from event";
		try {
			pstmt = conn.prepareStatement(sql);
			
			// 5�ܰ� : ����ޱ�
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("uname") + ", " + rs.getString(2));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		EventRegist app = new EventRegist();
	}
	
}
