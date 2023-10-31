package Com.Ruterntype;

public class MovieTicket {

	static public String name;
	static public int quantity;

	static String purchaseInAdvance(String MovieName, int quantity_i) {
		name = MovieName;
		quantity = quantity_i;
		String returnValue = null;
	
		if (MovieName != null) {
			if (MovieName.isEmpty()) {
				returnValue = "Please enter correct movie name";
				return returnValue;
			} else if (quantity <= 0) {
				returnValue = "Please enter Quantity";
				return returnValue;
			} else {
				int price1=NoOfmoveiTicket.Totalprice(300, 2);	
				String theater = "Saayadhri";
				returnValue=MovieTicket.name+" ticket is succssfully booked for "+MovieTicket.quantity+" seets of price "+price1+" in "+theater;
			}
		} else {
			
			returnValue = "Please enter movie name";
			return returnValue;
		}
		return returnValue;

	}
}
