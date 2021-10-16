/**
 Name: Masum Ahmed
 ID: 2012020116
 Section: C
 Email: cse_2012020116@lus.ac.bd
 Date: 16-10-2021
 **/
package masum;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        MyCalculator myCalculator =new MyCalculator();

        System.out.print("Enter the number : ");
        int a = input.nextInt();
        int sum = myCalculator.divisorSum(a);
        System.out.println("The sum of divisors of the number " + a + " is: " + sum + "\n");

        System.out.print("Enter the number for factorial : ");
        int b = input.nextInt();
        BigInteger factorial = myCalculator.findFactorial(b);
        System.out.println("The factorial of the number " + b + " is: " + factorial);
    }
}


