public class JavaBasicsDemo {

    // instance variables
    String studentName;
    int rollNumber;

    // default constructor
    JavaBasicsDemo() {
        studentName = "Unknown";
        rollNumber = 0;
    }

    // parameterized constructor
    JavaBasicsDemo(String studentName, int rollNumber) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
    }

    // method to display details
    void displayDetails() {
        System.out.println("Student Name : " + studentName);
        System.out.println("Roll Number  : " + rollNumber);
    }

    // method demonstrating local variables and a return value
    int addNumbers(int a, int b) {
        int sum = a + b;   // local variable
        return sum;
    }

    public static void main(String[] args) {
        JavaBasicsDemo obj1 = new JavaBasicsDemo();                      // default constructor
        JavaBasicsDemo obj2 = new JavaBasicsDemo("Krishna Sharma", 21);  // parameterized constructor

        obj1.displayDetails();
        System.out.println();
        obj2.displayDetails();

        int result = obj2.addNumbers(15, 25);
        System.out.println("\nSum of 15 and 25 is: " + result);
    }
}
