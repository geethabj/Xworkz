package InitVariable;

public class Snack{
	// variable declaration
	static String name;
	static double costInRupee;
	static double quantityinGrams;
	static String taste;
	static boolean  quality;
	
	static void setName(String name) {
		
		Snack.name=name;
	}
static void setcostInRupee(double costInRupee) {
		
		Snack.costInRupee=costInRupee;
	}
static void setquantityinGrams(double quantityinGrams) {
	
	Snack.quantityinGrams=quantityinGrams;
}
static void settaste(String taste) {
	
	Snack.taste=taste;
}
static void setquality(boolean quality) {
	
	Snack.quality=quality;
}
}

