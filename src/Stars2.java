//Print several line of different characters. 
//Uses a parameterized method to remove redundancy.
public class Stars2 {

	public static void main(String[] args) {
		// calling the method
		line(13,"*");
		 line(5,"#");
		  line(35,"?");
		  

	}
	
	//print the given number of stars plus a line break. 
	public static void line(int count, String s) {
		for(int i = 1; i <= count; i++) {
			System.out.print(s);
		}
		System.out.println();
	}

}
