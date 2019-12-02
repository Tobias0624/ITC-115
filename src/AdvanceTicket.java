package javahw;

public class AdvanceTicket extends tickets{
	public AdvanceTicket(int number, int daysInAdvance) {
		super(number);
		
		if (daysInAdvance < 10) {
			price = 40; 
		}else {
			price = 30; 
		}
	}

}
