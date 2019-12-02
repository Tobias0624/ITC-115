package javahw;

public class StudentAdvanceTicket extends AdvanceTicket {

	public StudentAdvanceTicket(int number, int daysInAdvance) {
		super(number, daysInAdvance);
		// TODO Auto-generated constructor stub
		price =price/2;
	}

}
