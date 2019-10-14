
public class Practice1 {

	public static void main(String[] args) {
		line(13);
		line(7);
		line(35);

	}

	//print the given number of stars plus a line break.
	public static void line(int count) {
		for (int i = 1; i <= count; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}


