package Instancevariable;

public class MatchboxStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matchbox matchbox = new Matchbox("Geetha match works", 5.5, 25, 2.50, 'S', 100.0, "wooden");
		System.out.println("Matchbox brand is : " + matchbox.brand);
		System.out.println("Matchbox length : " + matchbox.length);
		System.out.println("Matchbox NoOfSticks are : " + matchbox.NoOfSticks);
		System.out.println("Matchbox price is : " + matchbox.price);
		System.out.println("Matchbox Size is : " + matchbox.Size);
		System.out.println("Matchbox weight is : " + matchbox.weight);
		System.out.println("Matchbox type is : " + matchbox.type);
		System.out.println("\n");

		Matchbox matchbox1 = new Matchbox("Geetha match works", 5.5, 25, 2.50, 'S', 100.0);
		System.out.println("Matchbox brand is : " + matchbox1.brand);
		System.out.println("Matchbox length : " + matchbox1.length);
		System.out.println("Matchbox NoOfSticks are : " + matchbox1.NoOfSticks);
		System.out.println("Matchbox price is : " + matchbox1.price);
		System.out.println("Matchbox Size is : " + matchbox1.Size);
		System.out.println("Matchbox weight is : " + matchbox1.weight);
		System.out.println("\n");

		Matchbox matchbox2 = new Matchbox("Geetha match works", 5.5, 25, 2.50, 'S');
		System.out.println("Matchbox brand is : " + matchbox2.brand);
		System.out.println("Matchbox length : " + matchbox2.length);
		System.out.println("Matchbox NoOfSticks are : " + matchbox2.NoOfSticks);
		System.out.println("Matchbox price is : " + matchbox2.price);
		System.out.println("Matchbox Size is : " + matchbox2.Size);
		System.out.println("\n");

		Matchbox matchbox3 = new Matchbox("Geetha match works", 5.5, 25, 2.50);
		System.out.println("Matchbox brand is : " + matchbox3.brand);
		System.out.println("Matchbox length : " + matchbox3.length);
		System.out.println("Matchbox NoOfSticks are : " + matchbox3.NoOfSticks);
		System.out.println("Matchbox price is : " + matchbox3.price);
		System.out.println("\n");

		Matchbox matchbox4 = new Matchbox("Geetha match works", 5.5, 25);
		System.out.println("Matchbox brand is : " + matchbox4.brand);
		System.out.println("Matchbox length : " + matchbox4.length);
		System.out.println("Matchbox NoOfSticks are : " + matchbox4.NoOfSticks);
		System.out.println("\n");

		Matchbox matchbox5 = new Matchbox("Geetha match works", 5.5);
		System.out.println("Matchbox brand is : " + matchbox5.brand);
		System.out.println("Matchbox length : " + matchbox5.length);
		System.out.println("\n");

		Matchbox matchbox6 = new Matchbox("Geetha match works");
		System.out.println("Matchbox brand is : " + matchbox6.brand);
		System.out.println("\n");

	}

}
