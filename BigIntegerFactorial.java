import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerFactorial {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        long a = input.nextLong();
       
        System.out.println("Factorial of " + a + " is " + factorial(a));
    }
    
    public static BigInteger factorial(long a) {
        
        BigInteger myResult = BigInteger.ONE;
        
        for (int i = 1; i <= a; i++) {
            myResult = myResult.multiply(new BigInteger(i + ""));
        }
        return myResult;
    }
}