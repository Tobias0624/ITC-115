package Lawfirm;

public class HarvardLawyer extends Laywer {
	 public double showSalary() {
	        return super.showSalary() * 1.2;
	    }
	    
	    public int showVacationdays() {
	        return super.showVacationdays() + 3;
	    }
	    
	    public String applyForVacation() {
	        String form = super.applyForVaction();
	        return form + form + form + form;
	    }
	}
		


