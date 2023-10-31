package Com.variables;

public class Charger {
static double price = (int)55.55;
static int voltage = 110;
static String Connectortype ="C type";
static String compatiblity = "Android";
static String chargingtype = "wired";

static void show() {
	System.out.println("charger application got started");
	System.out.println("price is in integer " + price );
	System.out.println("voltage is  " + voltage );
	System.out.println("Connectortype is " + Connectortype );
	System.out.println("compatiblity is " + compatiblity );
	System.out.println("chargingtype is " + chargingtype );
	System.out.println("charger application completed");
	System.out.println(compatiblity);
	}
}


