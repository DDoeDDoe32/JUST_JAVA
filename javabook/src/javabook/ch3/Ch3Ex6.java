package javabook.ch3;

public class Ch3Ex6 {

	public static void main(String[] args) {
		int pwd = 123456;
		int encPwd, decPwd;
		int key = 0x1A253B65;
		
		System.out.println("암호화 전 비밀번호 : " + pwd);
		
		encPwd = pwd ^ key;
		
		System.out.println("암호화 후 비밀번호 : " + encPwd);
		
		decPwd = encPwd ^ key;
		
		System.out.println("복호화 후 비밀번호 : " + decPwd);
	}

}
