package day3;

import java.util.Scanner;

public class SimpleCalc {
	public static double add(double num1, double num2) {
		return num1 + num2;
	}
	
	public static double subtract(double num1, double num2) {
		return num2 - num1;
	}
	
	public static double multiply(double num1, double num2) {
		return num1 * num2;
	}
	
	public static double divide(double num1, double num2) {
	if(num2 == 0)
		return Double.NaN; 
	else
		return num1 / num2;
	}
	
	public static double maximum(double num1, double num2) {
		if(num1 > num2)
			return num1;
		else
			return num2;

	}
	
	public static double minimum(double num1, double num2) {
		if(num1 < num2)
			return num1;
		else
			return num2;
	}
	
	public static double average(double num1, double num2) {
		return (num1 + num2)/2;
	}
	
	
	public static double mod(double num1, double num2) {
		if(num2 == 0)
			return -1; 
		else
			return num1 % num2;
		}
	
	public double calculate(double num1, double num2, String operator) {
		double result = 0;
		
		switch(operator) {
		case "+":
			result = add(num1, num2);
			break;
			
		case "-":
			result = subtract(num1, num2);
		    break;
		    
		case "*":
			result = multiply(num1, num2);
			break;
			
		case "/":
			result = divide(num1, num2);
			break;
			
		case "%":
			result = mod(num1, num2);
			break;
			
		case "maxi":
			result = maximum(num1, num2);
			break;
			
		case "mini":
			result = minimum(num1, num2);
			break;
			
		case "avg":
			result = average(num1, num2);
			break;
			
		default:
			System.out.println("Please enter a valid operator.");
			break;
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number:");
		double num1 = sc.nextDouble();
		
		System.out.println("Enter the second number:");
		double num2 = sc.nextDouble();
		
		System.out.println("Enter the operation you want to perform (+, -, /, *, %, maxi, mini, avg):");
		String operation = sc.next();
		
		SimpleCalc calc = new SimpleCalc();
		System.out.println(calc.calculate(num1, num2, operation));
		
		sc.close();

	}

}
