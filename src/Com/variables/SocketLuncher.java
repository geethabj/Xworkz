package Com.variables;

public class SocketLuncher {
	
	static void Display() {
		Socket.voltage=110;
		Socket.Noofplug=3;
		Socket.wirelenth=15;
		Socket.Color="white";
		Socket.brand = "Transperent hellow";	
		System.out.println("voltage:"+ Socket.voltage);
		System.out.println("Noofplug:"+ Socket.Noofplug);
		System.out.println("wirelenth:"+ Socket.wirelenth);
		System.out.println("Color:"+ Socket.Color);
		System.out.println("brand:"+ Socket.brand);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("method started");
		Display();
				System.out.println("method ended");
	}

}
