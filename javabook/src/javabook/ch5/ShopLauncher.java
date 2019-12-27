package javabook.ch5;

// 쇼핑몰을 실행하는 런처 프로그램,
// IShop 인터페으스를 구현하는 다른 쇼핑몰 클래스도 이곳에서 실행 가능하다.
public class ShopLauncher {

	// 프로그램 메인
	public static void main(String[] args) {
		IShop shop = new MyShop();
		shop.setTitle("MyShop");
		shop.genUser();
		shop.genProduct();
		shop.start();
	}

}
