package Instancevariable;

public class Keybord {

	String brand;
	String color;
	int NoOfKeys;
	double cost;
	String type;
	
	Keybord() {
		System.out.println("keybord is created.......");
	}

	Keybord(String brand) {
		this.brand = brand;
	}

	Keybord(String brand, String color) {
		this.color = color;
	}

	Keybord(String brand, String color, int NoOfKeys) {
		this.NoOfKeys = NoOfKeys;
	}

	Keybord(String brand, String color, int NoOfKeys, double cost) {
		this.cost = cost;
		}
		Keybord(String brand, String color, int NoOfKeys, double cost, String type) {
			this.type = type;

	}
}
