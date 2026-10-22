package basic_questions;

public class Max_Number_Array {

	public static void main(String[] args) {
		
		int[] arr = {2,3,1,51,7};
		
		System.out.println(max_2(arr));

	}
	
//	public static int max(int[] arr) {
//		int max =arr[0];
//		
//		for (int j = 0; j < arr.length; j++) {
//			
//			if(arr[j] > max) {
//				max = arr[j];
//			}
//		}
//		
//		return max;
//	}
	
	public static int max_2(int[] arr) {
		int max =Integer.MIN_VALUE;
		
		for (int j = 0; j < arr.length; j++) {
			
			if(arr[j] > max) {
				max = arr[j];
			}
		}
		
		return max;
	}

}
