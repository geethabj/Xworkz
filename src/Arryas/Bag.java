package Arryas;

import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Stream;

public class Bag {

	public static void main(String[] args) {
		
		double[] Tv = { 10.10, 20.20, 30.30, 40.40, 50.50, 60.60, 70.70, 80.80, 90.90, 100.0 };
		double[] TvReverse = new double[Tv.length];
		for (int j = Tv.length - 1, i = 0; j >= 0; j--, i++) {
				TvReverse[i]=Tv[j];
				System.out.println("given double array index is Ji  "+"jid " + Tv[j] + ": " + TvReverse[i] );
			}
		System.out.println(" \n");
		for (int i = 0; i < TvReverse.length; i++) {
			System.out.println(" TvReverse order value is " + i + ": " + TvReverse[i]);
			
		}
		System.out.println("\n");
		int[] Pc = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		System.out.println(Pc.length);
		/* for(int i : Pc) */ 
		  for (int i = 0; i < Pc.length; i++) { 
			  Pc[0] = 15; 
			  Pc[1] = 25; 
			  Pc[2] = 35;
		      Pc[3] = 45; 
		      Pc[4] = 55;
		 
			System.out.println("given int array index is " + i + ":" + Pc[i]);			
		}
		System.out.println("\n");
		short[] Ac = {11, 22, 33, 44, 55, 66, 77, 88, 99, 111 };
		for (short s : Ac) {
			System.out.println("Short");
			
		}
		
		/*
		 * String[] nums = {"Zen","AC","CAR","Bat","EAT","KITE","MASS"};
		 * Arrays.stream(nums).forEach(num ->
		 * System.out.println("$%$%$%$%%$%$%%........"+num));
		 * 
		 * Stream<String> sortedStream = Arrays.stream(nums).sorted(); // This will sort
		 * the stream sortedStream.forEach(num ->
		 * System.out.println("@@@@@@@@@@@@@@@@@@@@@"+num));
		 */
		
		Ac[2] = 22;
		Ac[4] = 44;
		Ac[6] = 66;
		Ac[8] = 88;
		Ac[9] = 99;
		for (int i = 0; i < Ac.length; i= i+2) {
			System.out.println("given short array index is " + i + ": " + Ac[i]);
		}
		System.out.println("\n");
		long[] Vc = { 21, 31, 41, 51, 61, 71, 81, 91, 010, 123 };
		for (Long i : Vc){
			 System.out.println("Float assign value is " + i);
		 }
		for (int i = Vc.length-1; i>0 ; i= i-2) {
			System.out.println("given long array index is " + i + ": " + Vc[i]);
	}
		System.out.println("\n");
		 boolean[] Ra = { true, false, true, false, true, false, true, false, true, false };
		 for (int i = 0; i<Ra.length ; i= i+3) {
				System.out.println("given boolean array index is " + i + ": " + Ra[i]);
		}
		 System.out.println("\n");
		 float[] Vp = { 10.1f, 20.2f, 30.3f, 40.4f, 50.5f, 60.6f, 70.7f, 80.8f, 90.9f, 100.0f};
		 for (Float i : Vp){
			 System.out.println("Float assign value is " + i);
		 }
		 for (int i = Vp.length/2; i<=Vp.length-1 ; i= i+2) {
				System.out.println("given boolean array index is " + i + ": " + Vp[i]);	
		}
		 System.out.println("\n");
		 char[] Ap = {'A', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j' };
		 for (char i : Ap) {
			/*
			 * char[] ApNew=new char[Ap.length]; for (int j=Ap.length-1, i=0; j>=0; i++,
			 * j--) { ApNew[j]=Ap[i];
			 */
			System.out.println("given char array index is " + i);
		}
		 System.out.println("\n");
		byte[] Sm = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		/* for (int i = 0; i < Ra.length; i++) */ 
		for (byte i : Sm){
			if (Sm[i] % 2 == 0) {
				System.out.println("even number : "+ i);
			} else {
				System.out.println("add number : " + i);
			}	
		}
		System.out.println("\n");
		String[] junk = { "donuts", "burger", "pizza", "KFC", "french fries", "momos", "panipuri", "icecream", "milkshake", "cococola" };{
			/* for (int i = 0; i<junk.length ; i++) */ 
			for (String i : junk){
				System.out.println(" String array index is " + i );		
		}
			System.out.println("\n");
			
			String[]dress = {"lehenga", "chudi", "saree", "kurtha", "plasa", "gown", "traditional", "weastern", "nightwear", "partywear"};
				for (int i = 0; i<dress.length ; i++) {
					
					System.out.println(" String array index is " + i + ": " + dress[i]);	
			}
	}
}
}
