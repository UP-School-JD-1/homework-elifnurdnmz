
public class ClothProduct extends Product {
	private String sex;
	private String size;
	
	ClothProduct (String sku, String description, double price, double tax, Location location, String sex, String size) {
		super(sku, description, price, tax, location);
		this.sex = sex;
		this.size = size;
	}
	
	@Override
	public void purchase () {
		System.out.println("ClothProduct " + description + " is purchased at the price of " + price + " with the tax of " + tax );
	}
}
