package Logical_program;

import java.util.Scanner;

public class ArrayMaxElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of the array");
		int n = sc.nextInt();
		
		System.out.println("Enter the " +n+ " number of array elements ");
		
		int a[] = new int[n];
		for(int i = 0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}
		
		int max = a[0];
		for(int i=1; i<n; i++)
		{
			if(a[i]>max)
			{
				max = a[i];
			}
		}
		System.out.println("maximum element is: "+max);
	}

}
