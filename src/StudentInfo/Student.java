package StudentInfo;

public class Student {
	int rollNo;
	String name;
	String highestQualification;
	int age;
	
	public Student(int rollNo, String name, String highestQualification, int age) {
		this.rollNo = rollNo;
		this.name = name;
		this.highestQualification = highestQualification;
		this.age = age;
	}
	public int getRollNo() {
		return rollNo;
	}
	public String getName() {
		return name;
	}
	public String getHighestQualification() {
		return highestQualification;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setHighestQualification(String highestQualification) {
		this.highestQualification = highestQualification;
	}
	

	public static void main(String[] args) {
		Student[] students = new Student[5];
		
		students[0] = new Student(1, "Steve Smith", "BCA", 50);
		students[1] = new Student(2, "Trent Boult", "MCA", 45);
		students[2] = new Student(3, "Virat Kohli", "Phd", 32);
		students[3] = new Student(4, "Rohit Sharma", "Phd", 50);
		students[4] = new Student(5, "David Warner", "BCS", 48);
		
		System.out.println("Roll no. \t Name \t\t Highest Qualification \t\t Age");
		for(Student student : students) {
			System.out.println(student.getRollNo() + "\t\t" + student.getName() + "\t\t" 
					+  student.getHighestQualification() + "\t\t\t" + student.getAge());
		}

	}
	
	
}
