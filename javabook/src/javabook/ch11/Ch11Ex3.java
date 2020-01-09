package javabook.ch11;

public class Ch11Ex3 {
	public void print() throws MyException {
		System.out.println("메시지 출력!!");
		throw new MyException();
	}
	
	public static void main(String[] args) {
		Ch11Ex3 app = new Ch11Ex3();
		try {
			app.print();
		} catch(MyException e) {
			e.printStackTrace();
		}
	}
}
