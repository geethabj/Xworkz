package Com.Ruterntype;

public class Amezon {
	static int procudtprice;
	static boolean amezonmembership;

	static boolean onlinepurchase(String ClintName, String Product, int quantity) {
		if (ClintName=="Divya" || ClintName=="Shambu" || ClintName=="Geetha" || ClintName=="Nithin" || ClintName=="Shreyas") {
			amezonmembership=true;
			procudtprice = Vender.BillProduct(Product,quantity);
			System.out.println("Free dilivery to "+ClintName+ " with price: " + procudtprice);
			return true;
		}
		else{
			amezonmembership=false;
			procudtprice = Vender.BillProduct(Product,quantity);
			System.out.println("Charges applied  for dilivery of "+quantity+ " "+Product+" "+procudtprice);
			return false;
		}
		
	}
}
