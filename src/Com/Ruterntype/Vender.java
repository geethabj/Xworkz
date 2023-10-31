package Com.Ruterntype;

public class Vender {

	static int BillProduct(String product, int quantity) {
		int discount = Manufacturer.GetDiscount(product, quantity);
		int price;
		int finalPrice=0;

		if (product.equalsIgnoreCase("tv")) {
			if(quantity > 10 && Amezon.amezonmembership==true) {
			price = 2000 * quantity;
			finalPrice = price - ((price * discount) / 100);
			}else {
			finalPrice = 2000 * quantity;
			}		
		} else if (product.equalsIgnoreCase("Fridge")) {
			if (quantity > 20 && Amezon.amezonmembership==true) {
				price = 25000 * quantity;
				finalPrice = price - ((price * discount) / 100);
			} else {
				finalPrice = 25000 * quantity;
			}
		} else if (product.equalsIgnoreCase("owen")) {
			if (quantity > 30 && Amezon.amezonmembership==true) {
				price = 50000 * quantity;
				finalPrice = price - ((price * discount) / 100);
			} else {
				finalPrice = 50000 * quantity;
			}
		} else if (product.equalsIgnoreCase("mobile")) {
			if (quantity > 30 && Amezon.amezonmembership==true) {
				price = 7500 * quantity;
				finalPrice = price - ((price * discount) / 100);
			} else {
				finalPrice = 7500 * quantity;
			}
			
		} else if (product.equalsIgnoreCase("toster")) {
			finalPrice = 1000 * quantity;
		} else {
			System.out.println(" Discount not applied for " + product);
			
		}
		
		System.out.println("Discount for " + quantity + " "+product + " is : " + finalPrice);
		return finalPrice;
	}
}
