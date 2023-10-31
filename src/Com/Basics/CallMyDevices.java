package Com.Basics;

public class CallMyDevices {
	public static void main(String[] args)
	{
		System.out.println("CallMyDevices");
		
		ElectroncDevice.gyser();
		
		try {
			ElectroncDevice.Tab();
		}catch (Exception e) {
			System.out.println("skip 2 : tab is unavailable ..!");
			// TODO: handle exception
		}
		
		ElectroncDevice.Laptop();
		ElectroncDevice.Oven();
		ElectroncDevice.Refigeraotor();
		ElectroncDevice.Tv();
		ElectroncDevice.Speaker();
		ElectroncDevice.WashingMachine();
		}

}
