import java.util.Scanner;

public class MonteCarloPI {

	public static void main(String[] args) {
		System.out.print("Nokta Sayısını Giriniz: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = 0;
		long start = System.currentTimeMillis();
		
		for(int i = 0; i < n; i++) {
			double x = Math.random();
			double y = Math.random();
			double distance = x * x + y * y;
			if(distance <= 1) 
			r++;
			
		}
		
		long end = System.currentTimeMillis();
		double myPI = 4.0 * r / n;
		System.out.print("Pi numarası: " + myPI + "\n");
		System.out.print("Java'daki Pi numarası: " + Math.PI + "\n");
		System.out.print("Çalışma zamanı: " + (end-start) + " ms.");
		
	}

}
