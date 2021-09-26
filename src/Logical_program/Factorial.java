package Logical_program;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
//		int number = sc.nextInt();
//		
//		long fact = 1;
//		
//		for(int i=1; i<=number; i++)
//		{
//			fact =  fact*i;
//		}
		
		//factorial using do while
		int number = 4;
		long fact = 1;
		int i = 1;
		do {
			fact = fact*i;
			i++;
		}while(i<=number);
		
		System.out.println("The factorial of " + number+ " : " + fact);	
	}

}
