package javabook.ch6;

import java.util.Scanner;

public class Ch6Ex4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("환경변수 PATH: " + System.getenv("PATH"));
		
		System.setProperty("user", "홍길동");
		System.out.println("user 속성값: " + System.getProperty("user"));
		
		System.out.println("종료하려면 x를 누르세요!");
		
		while(true) {
			if(scanner.next().equals("x")) {
				System.out.println("프로그램 종료함!");
				System.exit(0);
			}
			else
				System.out.println("다시 입력하세요!");
		}
	}
}
