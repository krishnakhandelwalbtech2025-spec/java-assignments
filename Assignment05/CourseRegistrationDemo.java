import java.util.ArrayList;

public class CourseRegistrationDemo {
    public static void main(String[] args) {
        ArrayList<String> registeredCourses = new ArrayList<>();

        // add courses
        registeredCourses.add("Java Programming");
        registeredCourses.add("Database Management Systems");
        registeredCourses.add("Operating Systems");

        // remove a course
        registeredCourses.remove("Operating Systems");

        // view registered courses, generated and displayed using StringBuffer
        StringBuffer courseList = new StringBuffer();
        courseList.append("Registered Courses:\n");
        for (String course : registeredCourses) {
            courseList.append("- ").append(course).append("\n");
        }

        System.out.print(courseList);
    }
}
