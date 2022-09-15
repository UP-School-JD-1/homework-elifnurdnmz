public abstract class Product {
	protected String sku;
	protected String description;
	protected double price;
	protected double tax;
	protected Location location;
	
	public Product (String sku, String description, double price, double tax, Location location) {
		this.sku = sku;
		this.description = description;
		this.price = price;
		this.tax = tax;
		this.location = location;
		
	}
	
	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
	
	public abstract void purchase();

}
