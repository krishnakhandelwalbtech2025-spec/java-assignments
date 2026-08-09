import java.io.*;

public class PatientFileDemo {
    public static void main(String[] args) {
        String fileName = "patients.txt";

        // Writing patient details to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("PatientID: P001, Name: Ramesh Iyer, Age: 45, Diagnosis: Hypertension");
            writer.newLine();
            writer.write("PatientID: P002, Name: Sneha Patil, Age: 29, Diagnosis: Viral Fever");
            writer.newLine();
            System.out.println("Patient details written to file successfully.\n");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Reading patient details from the file
        System.out.println("Reading Patient Details from file:");
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
