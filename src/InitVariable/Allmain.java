package InitVariable;

public class Allmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle.setcolour("Red");
		System.out.println("My car Name is : " + Vehicle.colour);
		Vehicle.setcostInRs(120000);
		System.out.println("costInRupee is : " + Vehicle.cost);
		Vehicle.setbrand("Nexon");
		System.out.println("brand is : " + Vehicle.brand);
		System.out.println("\n");
		Road.setName("Kuvempu rasthe");
		System.out.println("My Road Name is : " + Road.name);
		Road.setlength(125);
		System.out.println("Road length is : " + Road.length);
		Road.setquality(false);
		System.out.println("Road qualityis : " + Road.quality);
		System.out.println("\n");
			
		
	}

}
