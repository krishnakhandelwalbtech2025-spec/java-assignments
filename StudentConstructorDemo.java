public class StudentConstructorDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Krishna Sharma", 21);

        System.out.println("Student 1 (Default Constructor):");
        s1.display();

        System.out.println("\nStudent 2 (Parameterized Constructor):");
        s2.display();
    }
}

class Student {
    String name;
    int rollNumber;

    // default constructor
    Student() {
        name = "Not Assigned";
        rollNumber = 0;
    }

    // parameterized constructor
    Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    void display() {
        System.out.println("Name        : " + name);
        System.out.println("Roll Number : " + rollNumber);
    }
}
