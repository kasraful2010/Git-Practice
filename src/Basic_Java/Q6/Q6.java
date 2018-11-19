package Basic_Java.Q6;
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {

        /**
         * 6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. Go to the editor
         * Test Data:
         * Input first number: 125
         * Input second number: 24
         * Expected Output :
         * 125 + 24 = 149
         * 125 - 24 = 101
         * 125 x 24 = 3000
         * 125 / 24 = 5
         * 125 mod 24 = 5
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = sc.nextInt();

        System.out.print("Input second number: ");
        int num2 = sc.nextInt();

//        int sum = num1 + num2;
//        int minus = num1 - num2;
//        int multiplication = num1 * num2;
//        int division = num1 / num2;
//        int mod = num1 % num2;

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));

        System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));

        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));

        System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2));







    }

}
