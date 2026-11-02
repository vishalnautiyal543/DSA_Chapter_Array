package searching;

public class Binary_Search {

	public static void main(String[] args) {
		
		int[] arr = {2,3,4,5,7,8,12,22,35};
		int target = 12;
		int res = Search(arr,target);
		System.out.println(res);
	}
	
	public static int Search(int[] arr, int target) {
			
		int low = 0;
		int high = arr.length -1;
		
		while(low <= high) {
			int mid = (low+high)/2;
			
			if(arr[mid] == target) {
				return mid;
			}else if(target > arr[mid]) {
				low = mid+1;
			}else {
				high = mid -1;
			}
		}
		
		return -1;
	}

}
