package Instancevariable;

public class FreeStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Free free=new Free();
		free.displayfreeicecreaminfo();
		Free free1=new Free("vennilla");
		free1.displayfreeicecreaminfo();
		Free free2=new Free("venilla", "1st november");
		free2.displayfreeicecreaminfo();
		Free free3=new Free("venilla", "1st november", 1);
		free3.displayfreeicecreaminfo();
	}

}
