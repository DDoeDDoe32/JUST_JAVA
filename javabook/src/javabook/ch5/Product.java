package javabook.ch5;

// 쇼핑몰 상품 정의를 위한 추상클래스,
// 다양한 상품 종류를 지원하려고 기본 정보 설정과 출력만 추상클래스에서 지정하고
// 추가 정보는 서브클래스에서 구현하도록 유도한다.
public abstract class Product {
	// 상품 이름과 가격 변수
	String pname;
	int price;
	
	// 상품 이름과 가격을 출력하는 기본정보 출력메서드
	public void printDetail() {
		System.out.print("상품명: " + pname + " , ");
		System.out.print("가격: " + price + " , ");
		printExtra();
	}
	
	public abstract void printExtra();
}
