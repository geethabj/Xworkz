package Instancevariable;

public class Clock {
	String Timezone;
	double Hours;
	String type;
	String material;
	
	Clock(){
		super();
	}
	Clock(String Timezone){
		super();
		this.Timezone=Timezone;
	}
	Clock(String Timezone, double Hours){
		super();
		this.Timezone=Timezone;
		this.Hours=Hours;
	}
	Clock(String Timezone, double Hours,String type){
		super();
		this.Timezone=Timezone;
		this.Hours=Hours;
		this.type=type;
	}
	Clock(String Timezone, double Hours, String type, String material){
		super();
		this.Timezone=Timezone;
		this.Hours=Hours;
		this.type=type;
		this.material=material;	
	}
	
}
