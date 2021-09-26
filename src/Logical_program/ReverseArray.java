package Logical_program;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter the length of the array ");
		int n = sc.nextInt();
		
		System.out.println("Enter the " +n+ "number of array elements " );
		int a[] = new int[n];
		
		for(int i =0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}
		
		for(int i = a.length-1; i>=0; i--)
		{
			System.out.print(a[i] + "  ");
		}
	}

}
