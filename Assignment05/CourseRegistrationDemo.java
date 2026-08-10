import java.util.ArrayList; 
public class CourseRegistrationSystem { 
private String studentName; 
private String prn; 
private ArrayList<String> registeredCourses; 
public CourseRegistrationSystem(String studentName, String prn) { 
this.studentName = studentName; 
this.prn = prn; 
this.registeredCourses = new ArrayList<>(); 
} 
public void addCourse(String courseName) { 
registeredCourses.add(courseName); 
System.out.println("Successfully registered for: " + courseName); 
} 
public void removeCourse(String courseName) { 
if (registeredCourses.remove(courseName)) { 
System.out.println("Successfully dropped: " + courseName); 
} else { 
System.out.println("Error: Course \"" + courseName + "\" not found in registered 
list."); 
} 
} 
public String generateCourseSummary() { 
StringBuffer sb = new StringBuffer(); 
sb.append("=========================================\n"); 
sb.append("    STUDENT COURSE REGISTRATION SUMMARY  \n"); 
sb.append("=========================================\n"); 
sb.append("Student Name : ").append(studentName).append("\n"); 
sb.append("PRN          
: ").append(prn).append("\n"); 
sb.append("-----------------------------------------\n"); 
sb.append("Registered Courses:\n"); 
if (registeredCourses.isEmpty()) { 
sb.append("  No courses currently registered.\n"); 
} else { 
for (int i = 0; i < registeredCourses.size(); i++) { 
sb.append("  
").append(registeredCourses.get(i)).append("\n"); 
} 
} 
sb.append("-----------------------------------------\n"); 
").append(i + 1).append(". 
sb.append("Total Registered Courses: ").append(registeredCourses.size()).append("\n"); 
sb.append("========================================="); 
return sb.toString(); 
} 
public static void main(String[] args) { 
CourseRegistrationSystem student = new CourseRegistrationSystem("Krishna Vishal 
Khandelwal", "25070122280"); 
System.out.println("=== ADDING COURSES ==="); 
student.addCourse("Programming with Java"); 
student.addCourse("Data Structures & Algorithms"); 
student.addCourse("Database Management Systems"); 
student.addCourse("Computer Networks"); 
System.out.println("\n" + student.generateCourseSummary()); 
System.out.println("\n=== DROPPING A COURSE ==="); 
student.removeCourse("Database Management Systems"); 
System.out.println("\n" + student.generateCourseSummary()); 
} 
}
