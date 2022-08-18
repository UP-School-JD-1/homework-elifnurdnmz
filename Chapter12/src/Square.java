public class Square extends Shape{
	private int s; //kenar
	public Square(int s) {
		super("Square");
		this.s=s;
	}
	public int getS() {
		return s;
	}
	public void setS(int s) {
		this.s = s;
	}
	
	public void draw() {
		super.draw();
	}

	public void erase() {
		super.erase();
	}

	public double calculateArea() {
		double area = Math.sqrt(s);
		System.out.println("Square area is : " + area);
		return area;
	}

	public double calculateCircumference() {
		double circumference = 4*s;
		System.out.println("Square circumference is : " + circumference);
		return circumference;
	}

	public boolean equals(Object obj) {
		Square e =(Square) obj;
		boolean a=false;
		if(getName()==e.getName() && getS()==e.getS()) {
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
		s="Name: "+getName()+" & Edge:"+getS();
		System.out.println(s);
		return s;		
	}
	
}