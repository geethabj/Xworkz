package InitVariable;

public class Snackluncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Snack.setName("lays");
		System.out.println("Name is : " + Snack.name);
		System.out.println("\n");
		Snack.setquantityinGrams(50);
		System.out.println("quantityinGrams is : " + Snack.quantityinGrams);
		System.out.println("\n");
		Snack.setcostInRupee(20);
		System.out.println("costInRupee is : " + Snack.costInRupee);
		System.out.println("\n");
		Snack.settaste("good");
		System.out.println("taste is : " + Snack.taste);
		System.out.println("\n");
		Snack.setquality(true);
		System.out.println("quality is : " + Snack.quality);

	}

}
