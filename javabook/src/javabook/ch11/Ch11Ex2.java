package javabook.ch11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ch11Ex2 {
	FileInputStream fis;
	
	void openFile() throws FileNotFoundException {
		fis = new FileInputStream("/tmp/a.txt");
	}
	
	void printFile() throws IOException {
		System.out.println(fis.read());
	}
	
	public static void main(String[] args) {
		Ch11Ex2 app = new Ch11Ex2();
		try {
			app.openFile();
			app.printFile();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
