import java.util.Scanner; 
public class StudentMarksCalculator { 
public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in); 
String[] markStrings = {"85", "92", "78", "88", "95"}; 
int totalMarks = 0; 
System.out.println("--- Subject Marks ---"); 
for (int i = 0; i < markStrings.length; i++) { 
Integer mark = Integer.valueOf(markStrings[i]); 
System.out.println("Subject " + (i + 1) + ": " + mark); 
totalMarks += mark; 
} 
System.out.println("---------------------"); 
System.out.println("Total Marks: " + totalMarks); 
scanner.close(); 
} 
}
