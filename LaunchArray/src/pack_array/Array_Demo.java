package pack_array;

public class Array_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]a = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		
		
		int[] other = a;
		other[2] = 100;
		
		for(int num: a) {
			System.out.println(num);
		}
		
//		System.out.println(a[2]);

	}

}
