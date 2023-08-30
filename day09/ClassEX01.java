package day09;

public class ClassEX01 {

	public static void main(String[] args) {
		Point p = new Point();
		p.print();
		p.setX(1);
		p.setY(4);
		p.print();
		System.out.println(p.getX());
		System.out.println(p.getY());
		p.setX(10);
		p.print();
		
		Point p1 = new Point();
System.out.println("-----------");
		p1.setX(100);
		p1.setY(200);
		p1.print();
		System.out.println("============");
		
		
		Point1 p2 = new Point1();
		p2.setX(10);
		p2.setY(33);
		p2.setZ(41);
		p2.print();
		
		System.out.println(p2.getX());
		System.out.println(p2.getY());
		System.out.println(p2.getZ());
	}

}

class Point{
	private int x;
	private int y;
	
	public void print() {
		System.out.println("("+x+","+y+")");
	}
	
	//getter(멤버변수의 값을 가져오는 역할)
	//setter(멤버변수의 값을 변경하는 역할)
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	public void setX(int xdfdfd) {
		x = xdfdfd;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	
}

class Point1 {
	private int x, y, z;

	void print() {
		System.out.println("(" + x + "," + y + "," + z + ")");
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

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
   
//	int getX() {
//		return x;
//	}
//
//	int getY() {
//		return y;
//	}
//
//	int getZ() {
//		return z;
//	}
//
//	void setX(int x) {
//		this.x = x;
//	}
//
//	void setY(int y) {
//		this.y = y;
//	}
//
//	void setZ(int z) {
//		this.z = z;
//	}

}
