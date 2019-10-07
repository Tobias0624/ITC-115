
public class loop2 {

	public static void main(String[] args) {
		//define terms 
		int count = 12, fn1 = 0, fn2 = 1;
		System.out.println("Fibonacci Series of " +count+ " numbers");
		
		//Create loops repeat count times 
		for(int i =1; i<=count; ++i)
		{
			System.out.println(fn1+" ");
			
			//
			int f3 = fn1 + fn2;
			fn1 = fn2;
			fn2= f3;
		}

	}

}
