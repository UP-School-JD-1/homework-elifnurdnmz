public class Triangle extends Shape{
	private int h; //yükseklik
	private int a; //taban
	private int b; //kenar
	private int c; //kenar
	public Triangle(int h,int a,int b,int c) {
		super("Triangle");
		this.h=h;
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}

	public void draw() {
		super.draw();
	}

	public void erase() {
		super.erase();
	}

	public double calculateArea() {
		double area =(a*h)/2;
		System.out.println("Triangle area is : " + area);
		return area;
	}
	
	public double calculateCircumference() {
		double circumference = a+b+c;
		System.out.println("Triangle circumference is : " +circumference);
		return circumference;
	}
	
	public boolean equals(Object obj) {
		Triangle e = (Triangle) obj;
		boolean a = false;
		if(getName()==e.getName() && getA()==e.getA()) {
			a=true;
		}
		System.out.println(a);
		return a;
	}
	
	public int hashCode() {
		System.out.println("Hashcode: " +getName().hashCode());
		return getName().hashCode();
	}

	public String toString() {
		String s = new String();
		s="Name: "+getName()+" & a-b-c:"+getA()+getB()+getC();
		System.out.println(s);
		return s;
	}
	
}