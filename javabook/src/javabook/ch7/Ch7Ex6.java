package javabook.ch7;

import java.io.*;
import java.net.URL;

public class Ch7Ex6 {
	public static void main(String[] args) {
		try {
			URL url = new URL("http://www.daum.net:80/index.html");
			
			System.out.println("��������: " + url.getProtocol());
			System.out.println("ȣ��Ʈ: " + url.getHost());
			System.out.println("��Ʈ: " + url.getPort());
			
			System.out.println(">> HTML ����");
			InputStream is = url.openStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String msg;
			while((msg = br.readLine()) != null) {
				System.out.println(msg);
			}
			br.close();
			is.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}