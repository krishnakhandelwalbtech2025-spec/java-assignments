class Student { 
private String name; 
private int rollNumber; 
public Student() { 
this.name = "Unknown"; 
this.rollNumber = 0; 
}  
public Student(String name, int rollNumber) { 
this.name = name; 
this.rollNumber = rollNumber; 
}  
public void display() { 
System.out.println("Student Name : " + name); 
System.out.println("Roll Number  : " + rollNumber); 
System.out.println("---------------------------"); 
} 
} 
public class StudentDemo { 
public static void main(String[] args) { 
Student student1 = new Student(); 
Student student2 = new Student("Krishna Khandelwal", 101); 
System.out.println("--- Student Details ---"); 
student1.display(); 
student2.display(); 
} 
} 
