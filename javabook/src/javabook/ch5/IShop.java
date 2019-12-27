package javabook.ch5;

// 교핑몰 규격을 정의한 인터페이스, 모든 쇼핑몰은 IShop 인터페이스를 구현해야 한다.
public interface IShop {
	public abstract void setTitle(String title);
	public abstract void genUser();
	public abstract void genProduct();
	public abstract void start();
}
