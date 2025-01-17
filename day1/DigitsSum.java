package day1;

import java.util.Scanner;

public class DigitsSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = 0;
		int sum = 0;
		while(num > 0) {
			temp = num%10;
			sum += temp;
			num /= 10;
		}
		System.out.println("Sum of digits of number is " +sum);
	}

}
