package day1;

import java.util.Scanner;


public class NameValidation {
	static public boolean validate(String name) {
		
		return name.matches("^[A-Za-z0-9]+$");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
		if(validate(name))
				System.out.println(name+ " is valid.");
		else
			System.out.println(name+ " is invalid. Please use only AlphaNumberic characters.");
	}

}
