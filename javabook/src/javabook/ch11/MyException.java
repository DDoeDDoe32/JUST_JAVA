package javabook.ch11;

public class MyException extends Exception {
	private String message = null;
	
	public MyException() {
		super();
		message = "Ŀ���� ���� �߻�!!";
	}
	
	public String toString() {
		return message;
	}
}
