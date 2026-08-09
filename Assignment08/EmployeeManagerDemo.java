public class EmployeeManagerDemo {
    public static void main(String[] args) {
        Manager m = new Manager("Krishna Sharma", 75000.0, "Computer Engineering");
        m.display();
    }
}

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee Name : " + name);
        System.out.println("Salary        : Rs." + salary);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, double salary, String department) {
        super(name, salary);   // calling the parent class constructor
        this.department = department;
    }

    void display() {
        super.display();       // calling the parent class method
        System.out.println("Department    : " + department);
    }
}
