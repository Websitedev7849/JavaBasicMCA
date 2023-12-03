package StudentAvg;

import java.util.Scanner;

public class StudentAvgClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students");
		int n = sc.nextInt();
		
		int marks[] = new int[n];
		int sumOfMarks = 0;
		
		System.out.println("Enter the marks of each student");
		for(int i = 0; i < n; i++) {
			marks[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println("The marks of student are");
			System.out.println("Student" + (i + 1) + " : " + marks[i]);
			sumOfMarks += marks[i];
		}
		
		float avg = sumOfMarks / n;
		System.out.println("The average of marks are " );
		System.out.println(avg);
		
		for(int i = 0; i < n; i++) {
			if(marks[i] < avg)
				System.out.println(marks[i] + " is below Average");
			else if (marks[i] > avg)
				System.out.println(marks[i] + " is above Average");
			else 
				System.out.println(marks[i] + " is average");
		}
	}

}
