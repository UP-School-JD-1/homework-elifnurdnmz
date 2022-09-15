
public class ConsultancyProduct implements Pricable{

	@Override
	public String toConsult() {
		String s = "Consult for product";
		return s;
	}

	@Override
	public String toSell() {
		String s = "Product is sold";
		return s;
	}

}
