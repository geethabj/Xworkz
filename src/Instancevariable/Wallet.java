package Instancevariable;

public class Wallet {
	public class Makupkit {
		int Noofpouches;
		String colour;
		String material;
		String type;
		
		Makupkit(){
			super();
		}
		Makupkit(int Noofpouches){
			super();
			this.Noofpouches=Noofpouches;
		}
		Makupkit(int Noofpouches, String colour){
			super();
			this.Noofpouches=Noofpouches;
			this.colour=colour;
		}
		Makupkit(int Noofpouches, String colour,String material){
			super();
			this.Noofpouches=Noofpouches;
			this.colour=colour;
			this.material=material;
		}
		Makupkit(int Noofpouches, String colour, String material,boolean type){
			super();
			this.Noofpouches=Noofpouches;
			this.colour=colour;
			this.material=material;
			this.type=type;	
		}
	}


}
