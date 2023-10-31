package Com.Movie;

class Movie{
	
	static void Buyticket(String Moviename, int quantity) {
		if (quantity > 0 && quantity < 10) {
            System.out.println("inside method 1: Moviename is: " + Moviename + "  Quantity is: " + quantity);
        } else {
            System.out.println("Invalid quantity. Quantity should be greater than 0 and less than 10.");
        }
		
	}
	
	static void CancelTicket(String Moviename, int quantity, double charges) {
		if (charges > 0 && charges < 5) {
			System.out.println("inside method 2 : Movienameis : "+Moviename+"  Quantity is:"+quantity+"  charges : "+charges);
		}else {
            System.out.println("Invalid charges. charges should be greater than 0 and less than 5.");
        }

	}
	
	 static void BookTicket(String Moviename, String Lang, int total, boolean anycoupen) {
		 if (total > 0 && total < 10) {
			 System.out.println("inside method 3 : Movienameis : "+Moviename+"  Lang is:"+Lang+"  total : "+total+"  anycoupen :"+anycoupen);
			}else {
	            System.out.println("Invalid total. total should be greater than 0 and less than 10");
	        }
		
	}
	
	
}
