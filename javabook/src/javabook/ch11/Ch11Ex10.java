package javabook.ch11;

public class Ch11Ex10 {
	public void printMsg(MyFuncInterface mfi) {
		mfi.go("hello");
	}
	
	public static void main(String[] args) {
		Ch11Ex10 app = new Ch11Ex10();
		app.printMsg((n) -> {System.out.println(n);});
		app.printMsg((n) -> {
			for(int i = 0; i < 10; i++)
			System.out.println(i + "-" + n);
		});
	}
}
