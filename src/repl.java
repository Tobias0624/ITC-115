
import java.util.*;
/*
 * 
 * 
 * The method and class name: repl
 * 
 * 
 * By: Adebola Adeyeye
 * 10/21/19
 * 
 */

public class repl {
	public static void main(String[] args) {
		System.out.println("This method accepts a string");
		System.out.println("and a number of repititions");
		System.out.println("as parameters and returns the string");
		System.out.println("concatenated that many times");
		
		// Declaring scanner objects
		Scanner console = new Scanner(System.in);
		
		//user input for string and repititions
		System.out.println("String?: ");
		String words = console.nextLine();
		
		System.out.println("Repititions?: ");
		int reps = console.nextInt();
		
		// Repl with input parameters
		 Repl(words, reps);
	}
		public static String Repl(String words, int reps) {
			
			//condition for reps  
			if ( reps <= 0 ) {
	
				return words;
				}
			else {
				for (int i = 0; i <=reps; i++)
					System.out.print(words);
			
			return words;
		}
	
		
	}
	
		}




