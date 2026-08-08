public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int intResult = calc.add(10, 20);
        double doubleResult = calc.add(10.5, 20.3);

        System.out.println("Sum of integers : " + intResult);
        System.out.println("Sum of decimals : " + doubleResult);
        System.out.println("Total Calculations Performed : " + Calculator.calculationCount);
    }
}

class Calculator {
    static int calculationCount = 0;   // static variable shared by all objects

    int add(int a, int b) {
        calculationCount++;
        return a + b;
    }

    double add(double a, double b) {
        calculationCount++;
        return a + b;
    }
}
