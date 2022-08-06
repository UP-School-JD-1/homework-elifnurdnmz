import java.util.Scanner;

public class FotokopiUcretiHesaplama {

	public static void main(String[] args) {
		System.out.print("Fotokopi sayısını giriniz: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		FotokopiUcretiHesaplama fotokopi = new FotokopiUcretiHesaplama();
		System.out.println("Method1: " + fotokopi.fiyatHesapla(n));
		System.out.println("Method2: " + fotokopi.özyinelemeliFiyatHesapla(n));
	}

	int fiyatHesapla(int n) {
		int ucret = 0;
		int numberOf25 = n/25;
		ucret += numberOf25* 100;
		n -= numberOf25 * 25;
		int numberOf12 = n/12;
		ucret += numberOf12*50;
		n -= numberOf12 * 12;
		ucret += n *5;
		return ucret;
	}
	
	int özyinelemeliFiyatHesapla(int n) {
		int ucret = 0;
		int numberOf25 = n/25;
		if (numberOf25 > 0) {
			ucret += numberOf25* 100;
			n -= numberOf25 * 25;
			özyinelemeliFiyatHesapla(n);
		}
		int numberOf12 = n/12;
		if (numberOf12 > 0) {
			ucret += numberOf12*50;
			n -= numberOf12 * 12;
			özyinelemeliFiyatHesapla(n);
		}
		ucret += n *5;
		return ucret;
	}
	
	
}
