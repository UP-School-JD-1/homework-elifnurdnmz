import java.util.Scanner;

public class AsalSayiBul {

	public static void main(String[] args) {
		
		AsalSayiBul asal = new AsalSayiBul();
		System.out.print("Bir sayı giriniz: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(asal.isPrime(n) + "\n");
		asal.AsalSayilarıSay(n);
	}

	boolean isPrime(int n) {
		boolean prime = true;
		int sayac = 0;
		for(int i =2; i< (int) (Math.sqrt(n)+ 1);i++) {
				if(n % i == 0) {
				prime = false;
				break;
				}
		}
	return prime;
	}
	
	void AsalSayilarıSay (int n) {
		int sayac = 0;
		for(int i = 2; i < n; i++) {
			boolean asal = isPrime(i);
			if(asal)
				sayac++;
		}
		System.out.println(n + " Sayısına kadar " + sayac + " adet sayı vardır.");
	}
	 	
}
