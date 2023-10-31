package Instancevariable;

public class Pendrive {
	int storage=64;
	String brand="sandisk";
	String FileSystem="NTFS";
	boolean portable=true;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("stating main method ");
		Pendrive pendrive = new Pendrive();
		System.out.println("Pendrive Storage : " + pendrive.storage);
		System.out.println("Pendrive brand : " + pendrive.brand);
		Pendrive pendrive1 = new Pendrive();
		System.out.println("Pendrive FileSystem : " + pendrive1.FileSystem);
		System.out.println("Pendrive FileSystem : " + pendrive1.portable);
		System.out.println("ending main method ");
		
	}

}
