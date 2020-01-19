package javabook.ch8;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ch8Ex2 extends JFrame {
	public Ch8Ex2() {
		super("Hello World");
		getContentPane().setLayout(new FlowLayout());
		JLabel label = new JLabel("Welcome to Swing");
		getContentPane().add(label);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(200, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ch8Ex2 app = new Ch8Ex2();
	}
}
