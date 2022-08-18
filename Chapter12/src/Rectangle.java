public class Rectangle extends Shape{
	private int x; //Kısa kenar
	private int y; //Uzun kenar
	
	public Rectangle(int x,int y) {
		super("Rectangle");
		this.x=x;
		this.y=y;
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
	

	public void draw() {
		super.draw();
	}

	public void erase() {
		super.erase();
	}

	public double calculateArea() {
		double area=x*y;
		System.out.println("Rectangle area is: " + area);
		return area;
	}

	public double calculateCircumference() {
		double circumference=2*(x+y);
		System.out.println("Rectangle circumference is: " + circumference);
		return circumference;
	}
	
	public boolean equals(Object obj) {
		Rectangle e = (Rectangle) obj;
		boolean a = false;
		if(getName()==e.getName() && getX()==e.getX()) {
			a=true;
		}
		System.out.println(a);
		return a;
	}
	
	public int hashCode() {
		System.out.println("Hashcode: " + getName().hashCode());
		return getName().hashCode();
	}

	
	public String toString() {
		String s = new String();
		s="Name: "+getName()+" & x-y:"+getX()+getY();
		System.out.println(s);
		return s;
	}
}