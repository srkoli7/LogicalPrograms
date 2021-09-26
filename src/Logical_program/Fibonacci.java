package Logical_program;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many fibonaccis");
		int num = sc.nextInt();
		
		int a = 0, b=1, c;
		System.out.print(a + "\t");
		System.out.print(b+ "\t");
		
		for(int count=3; count<=num; count++)
		{
			c = a+b;
			System.out.print(c+"\t");
			a=b;
			b=c;
		}

	}

}
