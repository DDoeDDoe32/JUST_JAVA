package javabook.ch8;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Ch8Ex1 {
	public static void main(String[] args) {
		Frame f = new Frame("Hello World");
		f.setLayout(new FlowLayout());
		Label label = new Label("Welcome to AWT");
		f.add(label);
		f.setSize(200, 200);
		f.setVisible(true);
	}
}
