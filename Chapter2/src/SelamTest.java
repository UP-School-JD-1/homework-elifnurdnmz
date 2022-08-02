public class SelamTest {

	public static void main(String[] args) {
		Selam nesne = new Selam();

		String cevap = nesne.selamSoyle("Ayşe");
		System.out.println(nesne.selamSoyle("Ayşe"));

		cevap = nesne.selamSoyle("Zeynep");
		System.out.println(cevap);
		//
		System.out.println("World: " + nesne.world);
		//
		cevap = nesne.selamSoyle("");
		System.out.println(cevap);
	}
}

class Selam {

	String world = "millet";

	public String selamSoyle(String kime) {
		String cumle;
		if (kime != "")
			cumle = "Selam " + kime + " :)";
		else
			cumle = "Selam " + world + " :)";
		return cumle;
	}
}
