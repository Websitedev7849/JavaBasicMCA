package EvenOrOdd;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an Integer: ");
		int num = sc.nextInt();
		
		if(num % 2 == 0)
			System.out.println("Entered number " + num + " is an even Integer");
		else
			System.out.println("Entered number " + num + " is an odd Integer");
	}
}
