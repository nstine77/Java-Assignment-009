import java.math.BigInteger;
public class Big {

    public static BigInteger factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }

        BigInteger result = BigInteger.ONE; // Start with BigInteger 1
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i)); // Use BigInteger for multiplication
        }
        return result;
    }
    /*public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }

        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i; // Using long to prevent overflow for larger factorials as long as possible.
            if (result < 0) {
                throw new ArithmeticException("Factorial overflows for large numbers.");
            }
        }
        return result;
    }*/

    public static void showFactorialTable(int upperLimit) {
        System.out.printf("%-15s %-20s\n", "Number", "Factorial");
        System.out.println("------------------------------");
        for (int i = 0; i <= upperLimit; i++) {
            try {
               /* long fact = factorial(i);
                System.out.printf("%-15d %,20d\n", i, fact);*/
            } catch (ArithmeticException e) {
                System.out.printf("%-15d Overflow\n", i);
            }
        }
    }

    public static void main(String[] args) {
        showFactorialTable(30);
    }
}

    /*public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}*/
/*  I'm starting to think I'm making this too complex by keeping both sets of code in
 and only separating them using comment lines. */