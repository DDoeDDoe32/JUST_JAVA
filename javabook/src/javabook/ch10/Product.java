package javabook.ch10;

// 상품 정보 테이블 데이터 표현을 위한 클래스
public class Product {
	
	// 컬럼 정보에 따른 필드 선언
	private int prcode;
	private String prname;
	private int price;
	private String manufacture;
	public int getPrcode() {
		return prcode;
	}
	
	// getter/setter 메서드
	public void setPrcode(int prcode) {
		this.prcode = prcode;
	}
	public String getPrname() {
		return prname;
	}
	public void setPrname(String prname) {
		this.prname = prname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getManufacture() {
		return manufacture;
	}
	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}
	
}
