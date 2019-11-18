/*
*  
* ITC115
* 
* The method and class name: Issorted
* 
*  Method that  accepts an array as parameters 
*  and returns true if list is sorted.
* 
* By: Adebola Adeyeye
* 11/12/19 
*/
public class Issorted {

	public static void main(String[] args) {
	double [] list = {20.1, 18.3, 15.2, 14.4};
	double [] list2 = {1.8, 3.9, 14.0, 16.5, 26.1, 31.2};
	if(isSorted(list)) {
	System.out.println("The list sorted:" + isSorted(list));}
	else {
		System.out.println("The list sorted:"+ isSorted(list));
	}
	if(isSorted(list2)){
	System.out.println("The list sorted:" +isSorted(list2));
	}
	else {
		System.out.println("The list sorted:" +isSorted(list2));
	}
	}
	public static boolean isSorted(double[] list) {
		//to check the list is increasing
		double preVal = 0.0;
		int count = 0;
		for (double d : list) {
			if (count > 0)
			{
				if (preVal > d) {
				//list is decreasing
					return false;
				}
			}
			preVal = d;
			count ++;
		}
		return true;
		
	}
}
	