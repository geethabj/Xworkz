package Instancevariable;

public class Rocket {
	int Noofseats ;
	int Noofwindwos;
	String colour;
	String company;
	
	Rocket(){
		super();
	}
	Rocket(int Noofseats){
		super();
		this.Noofseats=Noofseats;
	}
	Rocket(int Noofseats, int Noofwindwos){
		super();
		this.Noofseats=Noofseats;
		this.Noofwindwos=Noofwindwos;
	}
	Rocket(int Noofseats, int Noofwindwos,String colour){
		super();
		this.Noofseats=Noofseats;
		this.Noofwindwos=Noofwindwos;
		this.colour=colour;
	}
	Rocket(int Noofseats, int Noofwindwos, String colour,String company){
		super();
		this.Noofseats=Noofseats;
		this.Noofwindwos=Noofwindwos;
		this.colour=colour;
		this.company=company;	
	}
	

}
