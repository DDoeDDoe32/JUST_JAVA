package javabook.ch11;
//java
/*
// 단순한 자바 스레드 코드
public class Ch11Ex8 implements Runnable {
	public void run() {
		System.out.println("Hello World!!");
	}
	
	public static void main(String[] args) {
		Ch11Ex8 app = new Ch11Ex8();
		Thread t = new Thread(app);
		t.start();
	}
}
*/

// 람다식으로 구현한 스레드 코드
public class Ch11Ex8 {
	public static void main(String[] args) {
		new Thread(() -> {
			System.out.println("Hello World!!");
		}).start();
	}
}
