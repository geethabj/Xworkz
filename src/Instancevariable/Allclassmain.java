package Instancevariable;

public class Allclassmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clock clock = new Clock("indian",24.0,"IST","glass");
		System.out.println("Timezone : " + clock.Timezone);
		System.out.println("Hours : " + clock.Hours);
		System.out.println("type" + clock.type);
		System.out.println("material" + clock.material);
		System.out.println("\n");
		Rocket rocket = new Rocket(200,50,"white", "airindia");
		System.out.println("No of seats in Rocket: " + rocket.Noofseats);
		System.out.println("No of windwos in Rocket" + rocket.Noofwindwos);
		System.out.println("colour : " + rocket.colour);
		System.out.println("campany : " + rocket.company);
		System.out.println("\n");
	}

}
