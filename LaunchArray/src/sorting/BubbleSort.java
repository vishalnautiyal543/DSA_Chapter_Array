package sorting;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr = {12,5,6,-4,10};
		bubbleSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		
	}
	
	public static void bubbleSort(int[] arr) {
		
		for (int turn = 1; turn < arr.length; turn++) 
		{
			for (int i = 0; i < arr.length -turn; i++) 
			{
				if(arr[i] > arr[i+1]) {
					int temp = arr[i+1];
					arr[i+1] = arr[i];
					arr[i]= temp;
				}
			}
		}

	}
}
