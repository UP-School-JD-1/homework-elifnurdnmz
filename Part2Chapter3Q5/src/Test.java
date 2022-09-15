import java.sql.Date;
import java.text.SimpleDateFormat;

public class Test {
	
	public static void main(String[] args ) {
	Location location = new Location("Kadıköy", "İstanbul");
	ClothProduct buyCloth = new ClothProduct("fsa452", "T-shirt", 100, 10, location, "Women", "M");
	buyCloth.purchase();
	
	System.out.println();
	
	ConsultancyProduct consultProduct = new ConsultancyProduct();
	System.out.println(consultProduct.toConsult());
	
	System.out.println();
	
	OldProduct toSell = new OldProduct();
	System.out.println(toSell.toSell());
	
	Location location1 = new Location("Göztepe", "İstanbul"); 
    Date date = new Date(122, 8, 15);  
	FoodProduct buyFood = new FoodProduct("fsa452", "T-shirt", 100, 10, location1, date, 5);
	buyFood.purchase();
	
	}
}
