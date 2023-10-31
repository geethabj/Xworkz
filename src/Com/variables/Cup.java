package Com.variables;

public class Cup {
	static String Colour;
	static String Type;
	static double capacity;
	static String material;
	static int Price;
	
	static void Showinfo()
	{
		System.out.println("Colour : " + Colour + "     " + "Type: " + Type+ "     " + "capacity : " + capacity + "    " + " material :" +material + "    " + "Price :" +Price);
	}
	
	public static void main(String[] args)
	{
		Colour = "red";
		Type = "cofee cup";
		capacity = 200;
		material = "Paper";
		Price = 5;
		
		System.out.println("main method ended");
		Showinfo();
	}

}
