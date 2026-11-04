package searching;

public class Kth_root {

	public static void main(String[] args) {
		
		int n =87;
		int k =3;
		
		int res = kthroot(n,k);
		System.out.println(res);
		
	}
	
	public static int kthroot(int n, int k) {
		int low = 1;
		int high = n;
		int answer = 0;
		
		while (low <= high) {
			int mid = (low+high)/2;
			
			if(Math.pow(mid, k) <= n) {
				answer = mid;
				low = mid + 1;
			}else {
				high = mid -1;
			}
		}
		
		return answer;
	}

}
