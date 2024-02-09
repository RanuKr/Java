class Calculator {
    // Static method to add two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    // Static method to subtract two numbers
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Static method to multiply two numbers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Static method to divide two numbers
    public static double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        int result1 = Calculator.add(5, 3); // Calling the static add method
        System.out.println("5 + 3 = " + result1);

        int result2 = Calculator.subtract(10, 4); // Calling the static subtract method
        System.out.println("10 - 4 = " + result2);

        int result3 = Calculator.multiply(6, 7); // Calling the static multiply method
        System.out.println("6 * 7 = " + result3);

        double result4 = Calculator.divide(8.0, 2.0); // Calling the static divide method
        System.out.println("8.0 / 2.0 = " + result4);

        double result5 = Calculator.divide(5.0, 0.0); // Attempting to divide by zero
        System.out.println("5.0 / 0.0 = " + result5);
    }
}
