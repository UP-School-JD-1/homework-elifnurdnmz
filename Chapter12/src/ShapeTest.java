
public class ShapeTest {

	public static void main(String[] args) {
		Shape shape1=new Circle(4);
		Shape shape2=new Circle(3);
		Shape shape3=new Rectangle(2,4);
		Shape shape4=new Rectangle(2,4);
		Shape shape5=new Square(3);
		Shape shape6=new Square(4);
		Shape shape7=new Triangle(3,4,5,6);
		Shape shape8=new Triangle(2,4,3,3);

		shape1.draw();
		shape1.erase();
		shape1.calculateArea();
		shape1.calculateCircumference();
		shape1.toString();
		shape1.equals(shape1);
		shape1.equals(shape2);
		shape1.hashCode();
		System.out.println("///////////////////////////");	
		shape3.draw();
		shape3.erase();
		shape3.calculateArea();
		shape3.calculateCircumference();
		shape3.toString();
		shape3.equals(shape3);
		shape3.equals(shape4);
		shape3.hashCode();
		System.out.println("///////////////////////////");	
		shape5.draw();
		shape5.erase();
		shape5.calculateArea();
		shape5.calculateCircumference();
		shape5.toString();
		shape5.equals(shape5);
		shape5.equals(shape6);
		shape5.hashCode();
		System.out.println("///////////////////////////");	
		shape7.draw();
		shape7.erase();
		shape7.calculateArea();
		shape7.calculateCircumference();
		shape7.toString();
		shape7.equals(shape7);
		shape7.equals(shape8);
		shape7.hashCode();

	}

}