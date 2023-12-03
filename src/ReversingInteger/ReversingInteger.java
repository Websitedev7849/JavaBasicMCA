package ReversingInteger;

import java.util.Scanner;

public class ReversingInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int reversed = 0;
		System.out.print("Enter an Integer: ");
		int num = sc.nextInt();
		
		while(num != 0) {
		      int digit = num % 10;
		      reversed = reversed * 10 + digit;
		      num = num / 10;
		    }
		System.out.println("Reversed Number: " + reversed);
	}
}
