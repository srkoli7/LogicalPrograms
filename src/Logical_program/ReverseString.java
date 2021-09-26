package Logical_program;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the String ");
	 String name = sc.next();
	 
	 int len = name.length();
	 
	 //reversing string
	 String rev ="";
	 for(int i=len-1; i>=0; i--)
	 {
		 rev = rev + name.charAt(i);
	 }
	 System.out.println("Reverse string is " + rev);
	 
	 //to get middle character of string 
	 int mid2= len/2;
	 System.out.println(name.charAt(mid2));
	}

}
