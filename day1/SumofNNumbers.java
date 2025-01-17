package day1;

import java.util.Scanner;

public class SumofNNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum = n*(n+1)/2;
		
//		for(int i=0; i<n; i++) {
//	          sum += i;
//}
		System.out.println("Sum of n numbers is:" + sum);
	}

}
