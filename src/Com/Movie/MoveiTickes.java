package Com.Movie;

public class MoveiTickes {
	public static  void main(String[] args){
		String Moviename = "RRR";
		int quantity = 12;
		double  charges= 290.5;
		String Lang ="Kannada";
		int total=100;
		boolean anycoupen=false;	
		System.out.println("main mathed started");
		
		Movie.Buyticket(Moviename,quantity);
		Movie.CancelTicket( Moviename,  quantity,  charges);
		Movie.BookTicket( Moviename,  Lang,  total,  anycoupen);
		
		
		System.out.println("main  end");

		
	}
	

}
