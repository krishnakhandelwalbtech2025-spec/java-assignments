public class EmployeePayrollDemo {
    public static void main(String[] args) {
        String[] empIds = {"E101", "E102"};
        String[] basicSalaries = {"45000", "-2000"};   // second value is intentionally invalid, to demo validation
        String[] bonuses = {"5000", "3000"};

        for (int i = 0; i < empIds.length; i++) {
            try {
                // Convert entered String values into wrapper objects
                Double basicSalary = Double.parseDouble(basicSalaries[i]);
                Double bonus = Double.parseDouble(bonuses[i]);

                // Validation to ensure a valid salary value
                if (basicSalary <= 0) {
                    throw new IllegalArgumentException("Basic salary must be positive.");
                }

                double netSalary = basicSalary + bonus;
                System.out.println("Employee ID   : " + empIds[i]);
                System.out.println("Basic Salary  : Rs." + basicSalary);
                System.out.println("Bonus         : Rs." + bonus);
                System.out.println("Net Salary    : Rs." + netSalary);
                System.out.println();

            } catch (IllegalArgumentException e) {
                System.out.println("Invalid salary for Employee " + empIds[i] + ": " + e.getMessage());
                System.out.println();
            }
        }
    }
}
