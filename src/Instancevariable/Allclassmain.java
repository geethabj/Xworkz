package Instancevariable;

public class Allclassmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clock clock = new Clock("indian",24.0,"IST","glass");
		System.out.println("Matchbox brand is : " + clock.Timezone);
		System.out.println("Matchbox length : " + clock.Hours);
		System.out.println("Matchbox NoOfSticks are : " + clock.type);
		System.out.println("Matchbox price is : " + clock.material);
		System.out.println("\n");
	}

}
