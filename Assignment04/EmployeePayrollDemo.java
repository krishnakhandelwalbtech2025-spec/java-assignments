import java.util.Scanner; 
public class EmployeePayrollSystem { 
public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in); 
try { 
System.out.print("Enter Employee ID: "); 
String empIdStr = scanner.nextLine(); 
System.out.print("Enter Basic Salary: "); 
String basicSalaryStr = scanner.nextLine(); 
System.out.print("Enter Bonus Amount: "); 
String bonusStr = scanner.nextLine(); 
Integer empId = Integer.valueOf(empIdStr); 
Double basicSalary = Double.valueOf(basicSalaryStr); 
Double bonus = Double.valueOf(bonusStr); 
if (basicSalary <= 0) { 
System.out.println("Validation Error: Basic salary must be greater than 0."); 
return; 
} 
if (bonus < 0) { 
System.out.println("Validation Error: Bonus amount cannot be negative."); 
return; 
} 
double netSalary = basicSalary + bonus; 
System.out.println("\n================================="); 
System.out.println("      
EMPLOYEE PAYROLL SLIP      "); 
System.out.println("================================="); 
System.out.println("Employee ID   : " + empId); 
System.out.println("Basic Salary  : " + basicSalary); 
System.out.println("Bonus Amount  : " + bonus); 
System.out.println("---------------------------------"); 
System.out.println("Net Salary    : " + netSalary); 
System.out.println("================================="); 
} catch (NumberFormatException e) { 
System.out.println("Validation Error: Invalid input format. Please enter valid numeric 
values."); 
} finally { 
scanner.close(); 
} 
} 
}
