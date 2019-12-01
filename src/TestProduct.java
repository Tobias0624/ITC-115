import java.util.*;
public class TestProduct {
	
	public static void main(String [] args) {
		products p1 = new products("P001", "keyboard", 10, 5);
		products p2 = new products("P002","phone", 700, 20);
		products p3 = new products("P003","Mouse", 8, 10);
		
		System.out.println(p1);
		System.out.println("\n"+ p2);
		System.out.println("\n" + p3);
		
		System.out.println("\nThe total number of products objects created:" + products.getCount());

	}

}
