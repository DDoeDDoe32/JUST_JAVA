package javabook.ch9;

import java.util.*;

public class Ch9Ex2 {
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("101", "È«±æµ¿");
		hm.put("102", "¸ô¶ó¿ä");
		hm.put("201", "ÇÑ»ç¶÷");
		
		System.out.println(hm.get("102"));
		System.out.println("-----------");
		
		Collection<String> c = hm.values();
		
		for(String s : c) {
			System.out.println(s);
		}
	}

}
