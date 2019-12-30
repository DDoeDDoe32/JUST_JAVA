package javabook.ch7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ch7Ex5 {

	public static void main(String[] args) {
		System.out.println("## ���� �޸��� v1.0 ##");
		System.out.print("## ������ ���ϸ�: ");
		Scanner scanner = new Scanner(System.in);
		String filename = scanner.next();
		System.out.println("## ������ ������ ���ο� q �Է� \n");
		
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter writer = new BufferedWriter(new FileWriter("c:/workspace/justjava/" + filename));
			String s;
			
			while(!(s = reader.readLine()).equals("q")) {
				writer.write(s + "\r\n");
			}
			reader.close();
			writer.close();
			scanner.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("## ���α׷��� �����մϴ�.");
		System.out.println(filename + " ����Ǿ����ϴ�.!!");
	}
}
