package Logical_program;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int number = sc.nextInt();
		
		int temp=0;

		for(int i=2; i<number; i++)
		{
			if(number%i==0)
				temp ++;
		}
		
		if(temp==0)
		{
			System.out.println("Number is Prime");
		}
		else System.out.println("Number is not Prime");

	}

}
