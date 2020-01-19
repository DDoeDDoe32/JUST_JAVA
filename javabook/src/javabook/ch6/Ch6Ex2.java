package javabook.ch6;

public class Ch6Ex2 {
	public static void main(String[] args) {
		String str = "문자열";
		for(int i = 0; i < 50; i++) {
			str = str + i;
		}
		System.out.println(str);
		StringBuffer sb = new StringBuffer();
		sb.append("문자열");
		
		for(int i = 0; i < 50; i++) {
			sb.append(i);
		}
		System.out.println(sb.toString());
	}
}
