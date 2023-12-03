package EmployeeTypes;

public class SalariedEmployee extends Employee {

	float DAPercentage;
	float HRAPercentage;
	float basicSalary;
	
	public SalariedEmployee(int empID, String name, int age, float basicSalary, float DAPercentage, float HRAPercentage) {
		super(empID, name, age);
		this.basicSalary = basicSalary;
		this.DAPercentage = DAPercentage;
		this.HRAPercentage = HRAPercentage;
	}


	@Override
	public float getSalary() {
		return basicSalary + (basicSalary * DAPercentage) / 100 + (basicSalary * HRAPercentage) / 100;
	}

}
