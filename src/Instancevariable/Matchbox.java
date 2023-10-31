package Instancevariable;

public class Matchbox {
	String brand;
	double length;
	int NoOfSticks;
	double price;
	char Size;
	double weight;
	String type;
	
	Matchbox(){
		System.out.println("Matchbox constractor created");
		
	}
	Matchbox(String brand, double length, int NoOfSticks, double price,	char Size,double weight,String type){
		this.brand=brand;
		this.length=length;
		this.NoOfSticks=NoOfSticks;
		this.price=price;
		this.Size=Size;
		this.weight=weight;
		this.type=type;
	}
		Matchbox(String brand, double length, int NoOfSticks, double price,	char Size,double weight){
			this.brand=brand;
			this.length=length;
			this.NoOfSticks=NoOfSticks;
			this.price=price;
			this.Size=Size;
			this.weight=weight;
		}
		Matchbox(String brand, double length, int NoOfSticks, double price,	char Size){
			this.brand=brand;
			this.length=length;
			this.NoOfSticks=NoOfSticks;
			this.price=price;
			this.Size=Size;	
	}
		Matchbox(String brand, double length, int NoOfSticks, double price){
			this.brand=brand;
			this.length=length;
			this.NoOfSticks=NoOfSticks;
			this.price=price;
			
	}
		Matchbox(String brand, double length, int NoOfSticks){
			this.brand=brand;
			this.length=length;
			this.NoOfSticks=NoOfSticks;
		}
		Matchbox(String brand, double length){
			this.brand=brand;
			this.length=length;
			
		}
		Matchbox(String brand){
			this.brand=brand;		
		}
	}


