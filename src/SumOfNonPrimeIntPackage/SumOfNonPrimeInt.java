package SumOfNonPrimeIntPackage;

import java.util.Scanner;

public class SumOfNonPrimeInt {

	public static void main(String[] args) {
		System.out.println("Enter how many numbers you want to enter:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int numbers[] = new int[n];
		int sum = 0;
		
		System.out.println("Enter " + n +" numbers:");
		for(int i = 0; i < n; i++) 
			numbers[i] = sc.nextInt();
		
		for (int number : numbers) {
			try {
				if (!isPrime(number))
					sum += number;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}	
		}
		
		System.out.println("The sum of all non prime number is " + sum);
		
	}
	
	static boolean isPrime(int n) throws Exception {
		if (n < 2)
			return false;
		
		for (int i = 2; i < n; i++) {
			if(n%i == 0)
				return false;
		}
		
		throw new Exception(n + " is a prime number");
	}

}
