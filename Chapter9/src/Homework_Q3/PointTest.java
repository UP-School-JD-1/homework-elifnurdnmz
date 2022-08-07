package Homework_Q3;

public class PointTest {
	public static void main(String[] args) {
		
		Point point = new Point();
		Point pointCopy = new Point();
		
		System.out.println(point.koordinat() + "\n");
		
		System.out.println("Point nesnesinin merkeze olan uzaklığı -> " + point.merkezeUzaklık());		
		System.out.println("Point nesnesindeki iki farklı koordinatın birbirine olan uzaklığı -> " + point.digerNesneyeUzaklık() + "\n");
		
		System.out.println("Taşıma işlemi sonrasında x ve y değerleri -> " + point.move() + "\n");
		System.out.println(point.clone());
	}
}