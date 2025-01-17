package day1;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {

		
		
		for (int i = 1; i <= 1000; i++) {
			
            int sum = 0;
            int temp = i;
            
            while (temp > 0) {
                
                int lastdigit = temp % 10;
                sum += Math.pow(lastdigit, 3);
                temp /= 10;
	
            }
            if (sum == i) {
                System.out.print(i + " ");
            }
		}
	}
}
