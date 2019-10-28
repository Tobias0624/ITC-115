package hWork;
import java.util.*;
/*
 * ITC115
 * 
 * The method and class name: repl
 * 
 * 
 * By: Adebola Adeyeye
 * 10/28/19
 * 
 */
public class seasons {
	
	public static void main(String [] args) {
		Scanner console = new Scanner(System.in);
		//prompting user to for input and assigning int month and date variables for console
		System.out.println("Enter the month");
		int month = console.nextInt();
		
		System.out.println("Enter the date");
		int date = console.nextInt();
		
		season(month, date);
		 //out put of  method season 
		System.out.println("It is  "+season(month, date));
		
		
}
	public static String season(int month, int date) {
		//if else Statements with conditions of date and month  
	    if(month < 3 || (month == 3 && date <= 15) || (month == 12 && date >= 16)) {
	        return "Winter";
	    } else if((3 < month && month < 6) || (month == 3 && date >= 16) || (month == 6 && date <= 15)) {
	        return "Spring";
	    } else if((6 < month && month < 9) || (month == 6 && date >= 16) || (month == 9 && date <= 15)) {
	        return "Summer";
	    } else {
	        return "Fall";
	    }
    }
		}







