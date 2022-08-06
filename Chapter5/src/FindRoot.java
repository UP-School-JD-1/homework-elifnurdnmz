import java.util.Scanner;

public class FindRoot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("A: ");
		int a = sc.nextInt();
		System.out.print("B: ");
		int b = sc.nextInt();
		System.out.print("C: ");
		int c = sc.nextInt();
		double x = 0;
		double x1 = 0;
		double	x2 = 0;
		double delta;
		delta = (b*b)-(4*a*c);
		if (delta>0) {
			x1 =(-b + Math.sqrt(delta))/(2*a);
			x2 =(-b - Math.sqrt(delta))/(2*a);
			System.out.print("1.Kök: " + x1 + "\n" + "2.Kök" + x2);
		} else if (delta==0) {
			x = (-b/2*a);
			System.out.print("Kök: " + x);
		} else {
			System.out.print("Reel Kök Yoktur!");
		}
	}
}
