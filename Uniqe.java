/* 
* ITC115
* 
* The method and class name: BoysGirls
* 
*  Method that  accepts and array as parameters 
*  and returns true if the boolean is unique. 
* 
* By: Adebola Adeyeye
* 11/12/19 
*/
public class Uniqe {

	public static void main(String[] args) {
		//int [] list1 = {3, 8 , 12, 2, 9, 17, 43, -8, 46, 203, 14, 97, 10 , 4};
		int [] list1 = { 4, 7, 2, 3, 9, 12, -47, -19, 308, 3, 74};
		// TODO Auto-generated method stub
		System.out.println(isUnique(list1));
	}
		public static boolean isUnique(int[] list1) {
		    for (int i = 0; i < list1.length; i++) {
		        int min = list1[i];
		        
		        for (int j = i + 1; j < list1.length; j++) {
		            if (min > list1[j]) {
		                list1[i] = list1[j];
		                list1[j] = min;
		                min = list1[i];
		            }
		        }
		        
		    }
		    
		    for (int i = 0; i < list1.length - 1; i++) {
		        if (list1[i] == list1[i + 1]) {
		            return false;
		        }
		    }
			return true;
		    
	}

}
