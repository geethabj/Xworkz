package Instancevariable;

public class Ambulance {
	int length = 12;
	String brand="TVS";
	double width = 5.5;
	int NoOfmedicaldevices=10;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("====yash=====");
		System.out.println("stating main method ");
		Ambulance ambulance = new Ambulance();
		System.out.println("Ambulance length : " + ambulance.length);
		System.out.println("Ambulance brand : " + ambulance.brand);
		Ambulance ambulance1 = new Ambulance();
		System.out.println("Ambulance width : " + ambulance1.width);
		System.out.println("Ambulance having  No Of medical devices : " + ambulance1.NoOfmedicaldevices);
		System.out.println("ending main method ");
		
	}

}
