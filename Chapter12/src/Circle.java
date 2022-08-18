public class Circle extends Shape {
	private double r; //radius

	public Circle(double r) {
		super("Circle");
		this.r=r;
	}
	
	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public void draw() {
		super.draw();
	}

	public void erase() {
		super.erase();
	}

	public double calculateArea() {
		double area = Math.PI*(Math.pow(r, 2));
		System.out.println("Circle area is: " + area);
		return area;
	}

	public double calculateCircumference() {
		double circumference = 2*Math.PI*r;
		System.out.println("Circle circumference is: " + circumference);
		return circumference;
	}

	public boolean equals(Object obj) {
		Circle e =(Circle) obj;
		boolean a = false;
		if(getName()==e.getName() && getR()==e.getR()) {
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
		s="Name: "+getName()+" & Radius:"+getR();
		System.out.println(s);
		return s;
	}

}