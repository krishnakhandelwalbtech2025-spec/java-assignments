import student.StudentInfo;
import faculty.FacultyInfo;

public class CollegeManagementDemo {
    public static void main(String[] args) {
        StudentInfo student = new StudentInfo();
        student.display("Krishna Sharma", 21, "B.Tech Computer Engineering");

        System.out.println();

        FacultyInfo faculty = new FacultyInfo();
        faculty.display("Dr. Meera Joshi", "Computer Science and Engineering", "Programming with Java");
    }
}

/*
 * To compile and run (from inside the Assignment12 folder):
 *   javac student/StudentInfo.java faculty/FacultyInfo.java CollegeManagementDemo.java
 *   java CollegeManagementDemo
 */
