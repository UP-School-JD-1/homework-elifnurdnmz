import java.util.Scanner;

public class Family {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int i= 0;
			int j= 0;
			int k= 0;
			int l= 0;
			int m= 0;
			int n= 0;
			
			System.out.print("-> Yaşınızı Giriniz: ");
			int A = sc.nextInt();
			System.out.print("-> Yaşınızı Giriniz: ");
			int B = sc.nextInt();
			System.out.print("-> Yaşınızı Giriniz: ");
			int C = sc.nextInt();
			
			here: if(A <0 & A>=120) {
				break here;
			} else if (A >=0 & A<=3) {
				i++ ;
			} else if (A >=4 & A <=12) {
			    j++ ;
			} else if (A >=13 & A <=19) {
			    k++ ;
			} else if (A >=20 & A <=30) {
			    l++ ;
			} else if (A >=31 & A <=59) {
			    m++ ;
			} else if (A >=60 & A <=120) {
			    n++ ;
			}
			
			here: if(B <0 & B>=120) {
				break here;
			}else if (B >=0 & B<=3) {
				i++ ;
			} else if (B >=4 & B <=12) {
			    j++ ;
			} else if (B >=13 & B <=19) {
			    k++ ;
			} else if (B >=20 & B <=30) {
			    l++ ;
			} else if (B >=31 & B <=59) {
			    m++ ;
			} else if (B >=60 & B <=120) {
			    n++ ;
			}
			
			here: if(C <0 & C>=120) {
				break here;
			} else if (C >=0 & C<=3) {
				i++ ;
			} else if (C >=4 & C <=12) {
			    j++ ;
			} else if (C >=13 & C <=19) {
			    k++ ;
			} else if (C >=20 & C <=30) {
			    l++ ;
			} else if (C >=31 & C <=59) {
			    m++ ;
			} else if (C >=60 & C <=120) {
			    n++ ;
			}
			if (i != 0)
			System.out.println("0 ile 3 Yaş Aralığında Kişi Sayısı: " + i);
			if (j != 0)
			System.out.println("4 ile 12 Yaş Aralığında Kişi Sayısı: " + j);
			if (k != 0)
			System.out.println("13 ile 19 Yaş Aralığında Kişi Sayısı: " + k);
			if (l != 0)
			System.out.println("20 ile 30 Yaş Aralığında Kişi Sayısı: " + l);
			if (m != 0)
			System.out.println("31 ile 59 Yaş Aralığında Kişi Sayısı: " + m);
			if (n != 0)
			System.out.println("60 ile 120 Yaş Aralığında Kişi Sayısı: " + n);
		}
	}
}
