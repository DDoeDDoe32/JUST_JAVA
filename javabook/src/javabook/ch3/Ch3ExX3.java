package javabook.ch3;

public class Ch3ExX3 {

	public static void main(String[] args) {
		String[] products = {"애플 아이폰", "삼성 갤럭시", "노키아 루미아", "소니 엑스페리아"};
		
		for(int i = 0; i < products.length; i++) {
			System.out.println(products[i]);
		}
		
		System.out.println("--------------------------");
		
		// 새로운 for문 사용
		for(String s : products) {
			System.out.println(s);
		}
	}

}
