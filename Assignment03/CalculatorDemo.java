public class Calculator { 
private static int calculationCount = 0; 
public int add(int a, int b) { 
calculationCount++; 
return a + b; 
} 
public int add(int a, int b, int c) { 
calculationCount++; 
return a + b + c; 
} 
public double add(double a, double b) { 
calculationCount++; 
return a + b; 
} 
public double add(double a, double b, double c) { 
calculationCount++; 
return a + b + c; 
} 
public static int getCalculationCount() { 
return calculationCount; 
} 
public static void main(String[] args) { 
Calculator calc = new Calculator(); 
System.out.println("Sum of 2 integers (10, 20): " + calc.add(10, 20)); 
System.out.println("Sum of 3 integers (5, 15, 25): " + calc.add(5, 15, 25)); 
System.out.println("Sum of 2 decimals (10.5, 20.25): " + calc.add(10.5, 20.25)); 
System.out.println("Sum of 3 decimals (1.1, 2.2, 3.3): " + calc.add(1.1, 2.2, 3.3)); 
System.out.println("\nTotal 
Calculator.getCalculationCount()); 
} 
}
