package Lawfirm;

public class Janitor extends Employee { // Janitor extends by Employee

		public int showHours() { // get hours super class function

		return 80;

		}

		public double showSalary() { // get salary super function

		return super.showSalary() - 10000;

		}

		public int showVacationdays() { // get vacationsdays super function

		return super.showVacationdays() / 2; // half of others

		}

		public String clean() {

		System.out.println("Workin' for the man."); //
		return null;

		}

		}


