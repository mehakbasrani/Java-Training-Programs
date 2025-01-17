package day1;

import java.util.Scanner;

public class NPalindrome {
	
	static public void isPalindrome(int n) {
		
		for(int i=1; i<= n ;i++) {
			
			int revNum = 0;
			int temp = i;
			
		while(temp != 0) {
			
			revNum = (revNum * 10) + (temp % 10);
			temp /= 10;
		}
		
		if (revNum == i) 
			System.out.print(i+ " ");
		
		 }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		isPalindrome(n);
	}
}
