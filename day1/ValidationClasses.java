package day1;

import java.util.Scanner;

class NameValidate{
static public boolean validate(String name) {
		
		return name.matches("^[A-Za-z0-9]+$");
		
	}
}

public class ValidationClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    NameValidate nm = new NameValidate();

          System.out.println("Enter your name:");
          Scanner sc = new Scanner(System.in);
          String name = sc.next();

      if(nm.validate(name))
		   System.out.println(name+ " is valid.");
     else
	      System.out.println(name+ " is invalid. Please use only AlphaNumberic characters.");
	}

}
