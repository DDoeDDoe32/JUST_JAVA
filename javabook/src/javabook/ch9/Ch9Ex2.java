package javabook.ch9;

import java.util.*;

public class Ch9Ex2 {
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("101", "ȫ�浿");
		hm.put("102", "�����");
		hm.put("201", "�ѻ��");
		
		System.out.println(hm.get("102"));
		System.out.println("-----------");
		
		Collection<String> c = hm.values();
		
		for(String s : c) {
			System.out.println(s);
		}
	}

}
