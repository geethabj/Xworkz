package Instancevariable;

public class KeybordStarted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Keybord keybord0 = new Keybord();
		Keybord keybord = new Keybord("dell");
		System.out.println("Keybord brand " + keybord.brand);
		Keybord keybord1 = new Keybord("dell", "black");
		System.out.println("Keybord brand : " + keybord.brand + " & colour is : " + keybord1.color);
		Keybord keybord2 = new Keybord("dell", "black", 50);
		System.out.println("Keybord brand : " + keybord.brand + " & colour is : " + keybord1.color
				+ " Number of keys in keybord is : " + keybord2.NoOfKeys);
		Keybord keybord3 = new Keybord("dell", "black", 50, 999.9);
		System.out.println("Keybord brand : " + keybord.brand + " & colour is : " + keybord1.color
				+ " Number of keys in keybord is : " + keybord2.NoOfKeys + " cost is :" + keybord3.cost);
		Keybord keybord4 = new Keybord("dell", "black", 50, 999.9, "poratable");
		System.out.println("Keybord brand : " + keybord.brand + " & colour is : " + keybord1.color
				+ " Number of keys in keybord is : " + keybord2.NoOfKeys + " cost is :" + keybord3.cost + " type is : "
				+ keybord4.type);

	}

}
