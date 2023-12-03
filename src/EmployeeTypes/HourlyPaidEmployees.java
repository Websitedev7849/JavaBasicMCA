package EmployeeTypes;

public class HourlyPaidEmployees extends Employee {

	float hourlySalary;
	int numberOfHoursWorked;
	
	public HourlyPaidEmployees(int empID, String name, int age, int numberOfHoursWorked, float hourlySalary) {
		super(empID, name, age);
		this.numberOfHoursWorked = numberOfHoursWorked;
		this.hourlySalary = hourlySalary;
	}

	@Override
	public float getSalary() {
		return hourlySalary * numberOfHoursWorked;
	}

}
