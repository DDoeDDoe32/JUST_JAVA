package javabook.ch8;

import java.awt.*;

public class Ch8Ex3 extends Frame {

	public Ch8Ex3() {
		super("AWT 기본예제");
		setLayout(new BorderLayout());
		
		Label t1 = new Label("ID");
		Label t2 = new Label("Passwd");
		TextField id = new TextField(10);
		TextField pwd = new TextField(10);
		Button btn = new Button("Login");
		
		Panel p1 = new Panel();
		p1.add(t1);
		p1.add(id);
		
		Panel p2 = new Panel();
		p2.add(t2);
		p2.add(pwd);
		p2.add(btn);
		
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.SOUTH);
		
		setSize(250, 100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ch8Ex3 app = new Ch8Ex3();
	}
}
