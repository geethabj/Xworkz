package Instancevariable;

public class Month {
	String name;
	int Noofdays;
	int noofweekends;
	int noofholidyas;
	
	Month(){
		System.out.println("November month info");
		System.out.println("");
	}
	Month(String name){
		this.name=name;
		System.out.println("");
	}
	Month(String name,int Noofdays){
		this.name=name;
		this.Noofdays=Noofdays;
		System.out.println("");
	}
	Month(String name,int Noofdays,int noofweekends){
		this.name=name;
		this.Noofdays=Noofdays;
		this.noofweekends=noofweekends;
		System.out.println("");
	}
	Month(String name,int Noofdays,int noofweekends,int noofholidyas){
		this.name=name;
		this.Noofdays=Noofdays;
		this.noofweekends=noofweekends;
		this.noofholidyas=noofholidyas;
		System.out.println("");
	}
	void displayMonthInfo() {
		
		System.out.println(" in "+name+" No of days: "+ Noofdays + ". No of weekends: "+noofweekends +". No of holidyas : " +noofholidyas);
	}
}
