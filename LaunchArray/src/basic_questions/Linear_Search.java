package basic_questions;

public class Linear_Search {

	public static void main(String[] args) {
		
		int[] arr = {3,2,4,-5,6,9};
		int item = 4;
		
		int res = Search(arr, item);
		
		System.out.println("the index of item: " + res);

	}
	
	public static int Search(int[] arr, int item) {
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]==item) {
				return i;
			}
			
		}
		return -1;
	}

}
