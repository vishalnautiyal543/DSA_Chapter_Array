package sorting;

public class Selection_Sort {

	public static void main(String[] args) {
		
		int[] arr = {12,5,6,-4,10};
		
		selectionSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}

	}
	
	public static void selectionSort(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) 
		{
			int min=i; //index
			
			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
			
		}
	}

}
