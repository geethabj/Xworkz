package Instancevariable;

public class Free {
		String icecream;
		String ingrasation;
		int noofday;
		
		Free(){
			System.out.println("free ice cream day ");
		}
		Free(String icecream){
			this.icecream=icecream;
			System.out.println("");
		}
		Free(String icecream,String ingrasation){
			this.icecream=icecream;
			this.ingrasation=ingrasation;
			System.out.println("");
		}
		Free(String icecream,String ingrasation,int noofday){
			this.icecream=icecream;
			this.ingrasation=ingrasation;
			this.noofday=noofday;
			System.out.println("");
		}
		void displayfreeicecreaminfo() {
			
			System.out.println(icecream+" icecream "+ "on ingration day of "+ ingrasation + " free for "+noofday +" day");
		}
	}

