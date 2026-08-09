public class PrintableDemo {
    public static void main(String[] args) {
        Printable s = new Student("Krishna Sharma", 21);
        Printable e = new Employee("Anita Rao", "HR Manager");

        s.print();
        e.print();
    }
}

interface Printable {
    void print();
}

class Student implements Printable {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public void print() {
        System.out.println("Student -> Name: " + name + ", Roll No: " + rollNo);
    }
}

class Employee implements Printable {
    String name;
    String designation;

    Employee(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public void print() {
        System.out.println("Employee -> Name: " + name + ", Designation: " + designation);
    }
}
