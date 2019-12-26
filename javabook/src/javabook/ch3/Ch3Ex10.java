package javabook.ch3;

public class Ch3Ex10 {

	public static void main(String[] args) {
		String memberLevel = "YOUNG";		// VIP, NEW, YOUNG 중 선택
		String msg;
		
		switch(memberLevel) {
		case "VIP" :
			msg = "VIP 고객 혜택 적용";
			break;
		
		case "NEW" :
			msg = "신규 고객 혜택 적용";
			break;
			
		case "YOUNG" :
			msg = "청소년 고객 혜택 적용";
			
		default :
			msg = "등급없음";
			
		}
		
		System.out.println(msg);
		
	}

}
