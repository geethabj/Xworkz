package Instancevariable;

public class Monthstarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Month month=new Month();
		month.displayMonthInfo();
		Month month1=new Month("November");
		month1.displayMonthInfo();
		Month month2=new Month("November", 31);
		month2.displayMonthInfo();
		Month month3=new Month("November", 31, 4);
		month3.displayMonthInfo();
		Month month4=new Month("November", 31, 4, 4);
		month4.displayMonthInfo();
	}

}
