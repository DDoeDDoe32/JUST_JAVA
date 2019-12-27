package javabook.ch3;

class JHexahedron {
	int horizontal, vertical, height;
	int area;
	int x, y;
	
	JHexahedron(int h, int v, int hh) {
		this.horizontal = h;
		this.vertical = v;
		this.height = hh;
	}
	
	int volume() {
		return horizontal * vertical * height;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	int surface() {
		return ((horizontal * vertical) + (horizontal * height) + (vertical * height)) * 2;
	}
	
}

class Child_JHexahedron extends JHexahedron{
	Child_JHexahedron(int h, int v, int hh) {
		super(h, v, hh);
	}
}

public class test3 {
	public static void main(String[] args) {
		JHexahedron a = new JHexahedron(2, 5, 3);
		Child_JHexahedron b = new Child_JHexahedron(4, 6, 2);
		Child_JHexahedron c = new Child_JHexahedron(3, 1, 4);
		
		JHexahedron[] list = new JHexahedron[3];
		
		a.setX(0);
		a.setY(0);
		b.setX(0);
		b.setY(0);
		c.setX(0);
		c.setY(0);
		
		list[0] = a;
		list[1] = b;
		list[2] = c;
		
		System.out.println("-------");
		System.out.println("a");
		System.out.println("vol = " + a.volume());
		System.out.println("surface = " + a.surface());
		
		System.out.println("-------");
		System.out.println("b");
		System.out.println("vol = " + b.volume());
		System.out.println("surface = " + b.surface());

		System.out.println("-------");
		System.out.println("c");
		System.out.println("vol = " + c.volume());
		System.out.println("surface = " + c.surface());
		
		System.out.println(move(list, b, 1, 2));
	}
	
	static String move(JHexahedron[] list, JHexahedron moveObj, int x, int y) {
		moveObj.setX(moveObj.getX() + x);
		moveObj.setY(moveObj.getY() + y);
		
		for(int i = 0; i < list.length; i++) {
			if(list[i] == moveObj) {
				continue;
			}
			
			if(Math.abs(moveObj.getX()) - Math.abs(list[i].getX()) < 2 ) {
				moveObj.setX(moveObj.getX() + 2);
			}
			
			if(Math.abs(moveObj.getY()) - Math.abs(list[i].getY()) < 2 ) {
				moveObj.setY(moveObj.getY() + 2);
			}
		}
		
		return moveObj.getX() + ", " + moveObj.getY();
	}
}
