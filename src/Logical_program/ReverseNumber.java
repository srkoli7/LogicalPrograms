package Logical_program;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int number = sc.nextInt();
		
		int rev=0, rem;
		int temp = number;
		
		while(temp>0)
		{
			rem = temp%10;
			rev = rev*10+rem;
			temp = temp/10;
		}
		System.out.println("Reverse is "+ rev);
	}

}
