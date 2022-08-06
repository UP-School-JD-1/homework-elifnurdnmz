import java.util.Scanner;

public class StringInSwitchDemo {

	public static void main(String[] args) {
		switchWithSeason();
	}
	
	public static void switchWithSeason() {
		System.out.print("-> Ay Bilgisi Giriniz: ");
		Scanner stdin = new Scanner(System.in);
		String month = stdin.next();
		switch (month) {
        case "Ocak","Şubat","Mart": System.out.println("Mevsim: Kış"); break;
        case "Nisan","Mayıs","Haziran": System.out.println("Mevsim: İlkbahar"); break;
        case "Temmuz","Ağustos","Eylül": System.out.println("Mevsim: Yaz"); break;
        case "Ekim","Kasım","Aralık": System.out.println("Mevsim: Sonbahar"); break;
        default: System.out.println("Hata ! Geçerli bir ay bilgisi giriniz.");
		};
	}
}