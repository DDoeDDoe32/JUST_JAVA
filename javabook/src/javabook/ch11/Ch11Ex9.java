package javabook.ch11;

import java.util.ArrayList;

public class Ch11Ex9 {
	public void printArray() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i < 4; i++)
			list.add(i);
		
		// 기존 코드
		for(Integer num : list) {
			System.out.println(num);
		}
		
		// 람다식 적용
		list.forEach(n -> {System.out.println(n);});
	}
	
	public static void main(String[] args) {
		Ch11Ex9 app = new Ch11Ex9();
		app.printArray();
	}
	
}
