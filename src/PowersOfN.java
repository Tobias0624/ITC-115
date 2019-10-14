
public class PowersOfN {
     //Make arguments for base and exponent
	public static int main(int base_num, int expo_num) {
	  
	int answer = 1;
	/*for loop initializing, conditional
	 *  and incrementing method
	 */
	for (int i = 0; i <= expo_num; i++ ) {
		System.out.print(answer);
		System.out.print(" ");
		answer*=base_num;
	}
	
	 return answer;
	}
	//printing PowerofN 
	public static void main(String[] args) {
	System.out.println(main(4, 3));
	System.out.println(main (5, 6));
	System.out.println(main(-2, 8));
	}
	
	}

