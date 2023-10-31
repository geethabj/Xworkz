package Com.variables;

public class Jar {
	static String material = "Glass";
	static double Storage = 250;
	static String cap = "Steel";
	static String type= "air tight container";
	static String desighn = "Transperent hellow";

	static void Displayinfo() {
		System.out.println("Method started");
		material="Glass";
		Storage=250;
		cap="Steel";
		type="air tight container";
		desighn = "Transperent hellow";	
		System.out.println(material);
		System.out.println(Storage);
		System.out.println(cap);
		System.out.println(type);
		System.out.println(desighn);
	}
}