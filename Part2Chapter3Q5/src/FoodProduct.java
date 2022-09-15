import java.sql.Date;

public class FoodProduct extends Product {
	
	private Date productionDate;
	private int life;
	
	public FoodProduct (String sku, String description, double price, double tax, Location location, Date productionDate, int life) {
		super(sku, description, price, tax, location);
		this.productionDate = productionDate;
		this.life = life;
	}
	
	@Override
	public void purchase () {
		System.out.println("FoodProduct " + description + " is purchased at the price of " + price + " with the tax of " + tax + " and production date of " + productionDate);
	}
	
}
