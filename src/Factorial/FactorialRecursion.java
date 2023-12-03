package Factorial;

import java.util.Scanner;

public class FactorialRecursion {
	public static void main(String[] args) {
		System.out.println("Enter a number to find it's factorial");
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		System.out.println("The factorial of " + n + " is " + getFactorial(n));
	}
	
	static long getFactorial(int n) {
		if (n == 1 || n == 0)
			return 1;
		
		return n * getFactorial(n-1);
	}
}
