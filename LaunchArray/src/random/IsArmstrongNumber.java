package random;

import java.util.Scanner;

public class IsArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println(Is_Armstrong_Checker(num));
		
		sc.close();

	}
	
	public static boolean Is_Armstrong_Checker(int n) {
		int d = countDigit(n);
		int sum=0;
		int p= n;
		
		while(n>0) {
			int rem = n%10;
			sum = (int)(sum + Math.powExact(rem, d));
			n = n/10;
		}
		
		if (sum==p) {
			return true;
		} else {
			return false;
		}
	}
	
	public static int countDigit(int num) {
		int count=0;
		while(num > 0) {
			num = num/10;
			count++;
		}
		
		return count;
	}

}
