package Com.Movie;

public class Person {
	static void age(int age) {	
		System.out.println("person age is :" +age);
		
		if(age>=6 && age<15) {
			System.out.println("kid");
			System.out.println("\n" );
		}
		else if (age>15 && age<25) {
			System.out.println("adult");
			System.out.println("\n" );
		}
		else if (age>20 && age<25) {
			System.out.println("graduate");
			System.out.println("\n" );
		}
		else if (age>25 && age<45) {
			System.out.println("employee or proffessional");
			System.out.println("\n" );
		}
		else{
			System.out.println("family man");
			System.out.println("\n" );
		}
		
	}
	
}