import java.util.*;
import java.io.*;
/*
*  
* ITC115
* 
* The method and class name: BoysGirls
* 
*  Method that reads a file, and prints the sum and absolute
*  difference between the boys and girls.
* 
* By: Adebola Adeyeye
* 11/12/19 
*/
public class Boygirls {

		public static void main (String[] args) throws FileNotFoundException {
			
			Scanner input = new Scanner(new File("boysgirls.txt"));
			
			//Defining Variables
			  int boyCount = 0;
			  int boySum = 0;
			  int girlCount = 0;
			  int girlSum = 0;
					    
			//Nest loop that reads string data, count the data finds next token
			//and checks adds int data
				while(input.hasNext()) {
					 input.next();
					 boyCount++;
					 boySum += input.nextInt();
					        
				 if(!input.hasNext())
					      break;
					        
					 input.next();
					 girlCount++;
					 girlSum += input.nextInt();
					}
					 //print sum of and  difference between  boys and girls
					    System.out.println(boyCount + " boys, " + girlCount + " girls");
					    System.out.println("Difference between boys' and girls' sums: " + 
					        Math.abs(boySum - girlSum));
			}
		
}

				


	


