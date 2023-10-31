package Com.Ruterntype;

public class Manufacturer {
	static int GetDiscount(String Product, int quantity) {

		if (Product.equalsIgnoreCase("tv") && quantity > 10) {
			return 5;

		}
		if (Product.equalsIgnoreCase("Fridge") && quantity > 20) {
			return 10;
		}
		if (Product.equalsIgnoreCase("owen") || Product.equalsIgnoreCase("mobile") && quantity > 30) {
			return 15;
		} else {

			return 0;
		}
	}
}
