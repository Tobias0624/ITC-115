package javahw;

import java.util.Scanner;


public abstract class tickets {

	//Integer int number variable
	private int number; 
	//Declare a double variable price
	protected double price; 
	//create constructor
	public tickets(int number2) {
		this.number = number;
	}
	public double getPrice() {
		return price; 
	}
	public String toString() {
		return "Number"+ number+"price"+price;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		//Print Statement
		System.out.println("Enter the type of ticket you want");
		System.out.print("\nEnter Choice" +"of ticket type\n"
		+"1 Walkup-ticket\n"+"2 Advanced Ticket\n"+"3. StudentAdvance Ticket\n");
		System.out.print("Choice:");
		
		Scanner console = new Scanner(System.in);
		//take the user input
		choice = console.nextInt();
		// if user needs  walkup ticket
		if (choice==1) {
			int num=(int)(Math.random()*99);
			tickets wt = new WalkUpTicket(num);
			System.out.println(wt);
		}
		if (choice==2) {
			int num=(int)(Math.random()*99);
			//If user come more than ten day early print the tickets accordingly
			tickets sat = new StudentAdvanceTicket(num,11);
			System.out.println(sat);
		}
		//If user needs an Advance Ticket
		if(choice==3);{
			int num= (int)(Math.random()*99);
		//if user comes more than 10 days early print ticket accordingly
		tickets at = new StudentAdvanceTicket(num, 11);
		System.out.println(at);
		}
		console.close();
	}
	

	}


