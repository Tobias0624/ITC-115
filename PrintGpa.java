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
public class PrintGpa {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		Gpa(console);
		
	
	}
	public static void Gpa(Scanner input) {
		// Import scanner for user input 
		 Scanner console = new Scanner(System.in);
		    System.out.print("Enter a student record: ");
		    
		    //Assigning variables name and amount to user input 
		    String name = console.nextLine();
		    int amount = console.nextInt();
		    
		    
		    double sum = 0.0;
		 
		    //initializing loop for amount of scores & assinging score to user input and sum 
		    for (int i = 0; i < amount; i++) {
		        int score = console.nextInt();
		        sum += score;
		    }
		    //find the average 
		    double average = sum / amount;
		    
		    //System output
		    System.out.println(name + "'s grade is " + average);
}
}