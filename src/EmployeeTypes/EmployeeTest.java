package EmployeeTypes;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee[] employees = new Employee[5];
		
		employees[0] = new SalariedEmployee(1, "Virat Kohli", 32, 10000, 13, 20);
		employees[1] = new HourlyPaidEmployees(2, "Trent Boult", 30, 45, 500);
		employees[2] = new SalariedEmployee(3, "Rohit Sharma", 33, 15000, 16, 25);
		employees[3] = new HourlyPaidEmployees(4, "Mitchel Marsh", 28, 39, 700);
		employees[4] = new SalariedEmployee(5, "Steve Smith", 36, 12000, 15, 30);
		
		System.out.println("Emp ID \t Name \t\t\t Age \t Salary");
		for (Employee emp : employees) {
			System.out.println(emp.getEmpID() + "\t" + emp.getName() + "\t\t" + 
					emp.getAge() + "\t" + emp.getSalary());
		}
		
	}

}
