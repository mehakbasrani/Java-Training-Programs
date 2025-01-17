package day1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class NumberWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     HashMap<Integer, String> hm = new HashMap<>();
      hm.put(0, "Zero");
      hm.put(1, "One");
      hm.put(2, "Two");
      hm.put(3, "Three");
      hm.put(4, "Four");
      hm.put(5, "Five");
      hm.put(6, "Six");
      hm.put(7, "Seven");
      hm.put(8, "Eight");
      hm.put(9, "Nine");
      
      System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();  //345
		
		int temp = 0;
		int sum = 0;
		ArrayList<String> al = new ArrayList<>();
		
		while(num > 0) {
			temp = num % 10;  
			al.add(hm.get(temp)) ;
			num /= 10;
		}
		
		for(int i = al.size()-1; i>=0; i--)
		System.out.print(al.get(i)+ " ");
	}

}
