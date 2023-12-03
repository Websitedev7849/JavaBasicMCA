package EmployeeTypes;

public abstract class Employee {
	int empID;
	String name;
	int age;
	public Employee(int empID, String name, int age) {
		super();
		this.empID = empID;
		this.name = name;
		this.age = age;
	}
	public int getEmpID() {
		return empID;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public abstract float getSalary();
}
