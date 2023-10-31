package selfstudy;

public class MultiDimArrayDemo {
	public static void main(String[] args) {

		System.out.println("program no 1:  \n");
		/*
		 * String temp="xworkz"; String temp1="2"; String temp2="xworkz";
		 * 
		 * Jar.run();
		 */

		String[][] names = { { "Mr. ", "Mrs. ", "Ms. " }, { "Smith", "Jones" } };
		// Mr. Smith
		System.out.println(names[0][0] + names[1][0]);
		// Ms. Jones
		System.out.println(names[0][2] + names[1][1]);

		System.out.println("program no 2:  \n");

		String[] copyFrom = { "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado", "Doppio", "Espresso",
				"Frappucino", "Freddo", "Lungo", "Macchiato", "Marocchino", "Ristretto" };

		String[] copyTo = new String[7];
		
		System.arraycopy(copyFrom, 2, copyTo, 0, 7);
		for (String coffee : copyTo) {
			System.out.print(coffee + " ");
		}
		
		System.out.println("\n");

		System.out.println("program no 3:  \n");
		 
        String[] copyTo1 = java.util.Arrays.copyOfRange(copyFrom, 0, 5);        
        for (String coffee1 : copyTo1) {
            System.out.print(coffee1 + " ");           
        }  
        System.out.println("\n");
       // java.util.Arrays.stream(copyTo1).map(coffee -> coffee + " ").forEach(System.out::print);  

	}

}
