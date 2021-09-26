package Logical_program;

public class Recursion {
	
	 static long factorial(int num)
	{
		if(num==1) return 1;
		long fact = factorial(num-1)*num;
		return fact;
	}
	public static void main(String[] args) {
		long fact = Recursion.factorial(4);
		System.out.println("The factorial of number: "+fact);
	}

}
