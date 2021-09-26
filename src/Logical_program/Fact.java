package Logical_program;

public class Fact {

	public static void main(String[] args) {
		//factorial using for loop
//		int number = 4;
//		long fact = 1;
//		for(int i=number; i>0; i--)
//		{
//			fact = fact*i;
//		}
//		
		//factorial using while loop
//		int number = 4;
//		long fact = 1;
//		int i= number;
//		while(i>0)
//		{
//			fact = fact*i;
//			i--;
//		}
//		
		//factorial using do while loop
		int number = 4;
		long fact = 1;
		int i = number;      
		do {
			fact = fact*i;
			i--;
		}while(i>0);
		
		
		System.out.println("Factorial of a given number is: "+fact);
	}

}