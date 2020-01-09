package javabook.ch10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

public class ProductDAO {
	String jdbcDriver = "com.mysql.jdbc.Driver";
	String jdbcUrl = "jdbc:mysql://localhost/javadb";
	Connection conn;
	
	PreparedStatement pstmt;
	ResultSet rs;
	
	Vector<String> items = null;
	String sql;
	
	// 콤보박스의 상품 관리 번호 목록을 위한 벡터 리턴
	public Vector<String> getItems() {
		return items;
	}
	
	// 전체 상품 목록을 가져오는 메서드
	public ArrayList<Product> getAll() {
		connectDB();
		sql = "select * from product";
		
		// 전체 검색 데이터를 전달하는 ArrayList
		ArrayList<Product> datas = new ArrayList<Product>();
		
		// 관리번호 콤보박스 데이터를 위한 벡터 초기화
		items = new Vector<String>();
		items.add("전체");
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			// 검색된 데이터 수만큼 루프를 돌며 Product 객체를 만들고 이를 다시 ArrayList에 추가
			while(rs.next()) {
				Product p = new Product();
				p.setPrcode(rs.getInt("prcode"));
				p.setPrname(rs.getString("prname"));
				p.setPrice(rs.getInt("price"));
				p.setManufacture(rs.getString("manufacture"));
				datas.add(p);
				items.add(String.valueOf(rs.getInt("prcode")));
			}
		} catch(SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			closeDB();
		}
		return datas;
	}
	
	// 선택한 상품 코드에 해당하는 사품 정보를 가져오는 메서드
	public Product getProduct(int prcode) {
		connectDB();
		sql = "select * from product where prcode = ?";
		Product p = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,  prcode);
			rs = pstmt.executeQuery();
			rs.next();
			p = new Product();
			p.setPrcode(rs.getInt("prcode"));
			p.setPrname(rs.getString("prname"));
			p.setPrice(rs.getInt("price"));
			p.setManufacture(rs.getString("manufacture"));
		} catch(SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			closeDB();
		}
		
		return p;
	}
	
	// 새로운 상품을 등록하는 메서드
	public boolean newProduct(Product product) {
		connectDB();
		
		// prcode는 자동 증가 컬럼이므로 직접 입력하지 않음.
		sql = "insert into product(prname, price, manufacture) values(?, ?, ?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, product.getPrname());
			pstmt.setInt(2, product.getPrice());
			pstmt.setString(3, product.getManufacture());
			pstmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			closeDB();
		}
		return true;
	}
	
	// 선택한 상품을 삭제하는 메서드
	public boolean delProduct(int prcode) {
		connectDB();
		sql = "delete from product where prcode = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, prcode);
			pstmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			closeDB();
		}
		return true;
	}
	
	// 수정한 정보로 상품 정보를 업데이트하는 메서드
	public boolean updateProduct(Product product) {
		connectDB();
		sql = "update product set prname = ?, price = ?, manufacture = ? where prcode = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  product.getPrname());
			pstmt.setInt(2, product.getPrice());
			pstmt.setString(3, product.getManufacture());
			pstmt.setInt(4, product.getPrcode());
			pstmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			closeDB();
		}
		return true;
	}
	
	// DB 연결 메서드
	public void connectDB() {
		try {
			Class.forName(jdbcDriver);
			conn = DriverManager.getConnection(jdbcUrl, "root", "1234");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// DB 연결 종료 메서드
	public void closeDB() {
		try {
			pstmt.close();
			conn.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}