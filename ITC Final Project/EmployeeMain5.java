package Lawfirm;

public class EmployeeMain5 {
	

	public static void print(String profession, String applyforVaction, int showHours,double showSalary,int showVactiondays, String phrase) {
		System.out.println(profession+"");
		System.out.println("Use the "+applyforVaction+" form");
		System.out.println("I work "+showHours+" hours per week.");
		System.out.println("My Salary is " +showSalary);
		System.out.println("I recieve "+ showVactiondays+" days of Vacation");
		System.out.println(phrase);
		System.out.println(" ");
}
	public static void main(String [] args) {
		Laywer employee1 = new Laywer();
		EmployeeMain5.print("Lawyer",employee1.applyForVaction(),
				employee1.showHours(),employee1.showSalary(),employee1.showVacationdays(),employee1.sue());
		Marketer employee2 = new Marketer();
		EmployeeMain5.print("Marketer", employee2.applyForVacation(), employee2.showHours(),
				employee2.showSalary(),employee2.showVacationdays(),employee2.advertise());
		Secretary employee3 = new Secretary();
		EmployeeMain5.print("Secretary", employee3.applyForVacation(), employee3.showHours(),
				employee3.showSalary(), employee3.showVacationdays(), employee3.takeDictation());
		Janitor employee4 = new Janitor();
		EmployeeMain5.print("Janitor", employee4.applyForVacation(), employee4.showHours(), 
				employee4.showSalary(), employee4.showVacationdays(), employee4.clean());
		LegalSecretary employee5 = new LegalSecretary();
		EmployeeMain5.print("Legal Secretary", employee5.applyForVacation(), employee5.showHours(), 
				employee5.showSalary(), employee5.showVacationdays(), employee5.fileLegalBriefs());
		HarvardLawyer employee6 = new HarvardLawyer();
		EmployeeMain5.print("Harvard Lawyer", employee6.applyForVacation(), employee6.showHours(),
				employee6.showSalary(), employee6.showVacationdays(), null);
		
}
	}
