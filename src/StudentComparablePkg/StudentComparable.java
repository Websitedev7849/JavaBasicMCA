package StudentComparablePkg;

interface MyComparable {
    int compare(Object ob2);
}

// Student class implementing Comparable
class Student implements MyComparable {
    int rollNumber;
    
    // Constructor
    public Student(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    @Override
    public int compare(Object ob2) {
        
        Student otherStudent = (Student) ob2;

        // Compare based on roll_number
        if (this.rollNumber == otherStudent.rollNumber) {
            return 0; // Same
        } else if (this.rollNumber > otherStudent.rollNumber) {
            return 1; // Comes after
        } else {
            return -1; // Comes before
        }
    }
}

public class StudentComparable {
    public static void main(String[] args) {
        
        Student student1 = new Student(101);
        Student student2 = new Student(102);

        int result1 = student1.compare(student2);
       

        System.out.println("Comparison result : " + result1); // Expected output: -1 (student1 comes before student2)
    }
}