package day1;

import java.util.Scanner;

public class Pallindrome {
	
	static public boolean isPalindrome(int ogNum) {
		int num = ogNum;
		
		int revNum = 0;
		
		while(num != 0) {
			
			revNum = (revNum * 10) + (num % 10);
			num /= 10;
		}
		
		return (revNum == ogNum);
		     	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println(isPalindrome(num));
	}
}
