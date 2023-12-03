package Factorial;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Enter a number to find it's factorial");
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		if(n == 0) {
			System.out.println("The Factorial of 0 is 1");
			return;
		}
		long factorial = n;
		int temp = n;
		while(temp > 1) {
			factorial *= temp - 1;
			temp--;
		}

		System.out.println("The factorial of " + n + " is " + factorial);
	}

}
