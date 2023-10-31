package Instancevariable;

public class Train {
	double length;
	String name;
	int NoOfSeats;
	int NoOfStops;

	void runningTrain() {
		System.out.println("starting runningTrain method in train");
		Train ref = new Train();
		{
			length = 5.5;
			name = "siddhaganga express";
			System.out.println("Train Length is : " + length);
			System.out.println("Train Length is : " + name);
			ref.length = 5.5;
			ref.name = "siddhaganga express";
			System.out.println("Train Length is : " + ref.length);
			System.out.println("Train Length is : " + ref.name);
			System.out.println("ending runningTrain method in train");
		}
	}

	public static void main(String[] args) {
		System.out.println("stating main method ");
		Train ref1 = new Train();
		ref1.runningTrain();
		System.out.println("ending main method");
	}

}
