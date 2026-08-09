import java.io.*;

public class EmployeeFileDemo {
    public static void main(String[] args) {
        String fileName = "employee.txt";

        // Writing employee details to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("EmpID: 101, Name: Krishna Sharma, Department: IT, Salary: 45000");
            writer.newLine();
            writer.write("EmpID: 102, Name: Anita Rao, Department: HR, Salary: 38000");
            writer.newLine();
            System.out.println("Employee details written to file successfully.\n");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Reading employee details from the file
        System.out.println("Reading Employee Details from file:");
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
