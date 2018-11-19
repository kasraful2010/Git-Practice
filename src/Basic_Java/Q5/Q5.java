package Basic_Java.Q5;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        /**
         * 5. Write a Java program that takes two numbers as input and display the product of two numbers. Go to the editor
         * Test Data:
         * Input first number: 25
         * Input second number: 5
         * Expected Output :
         * 25 x 5 = 125
          */

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter value 1: ");
        int num = sc.nextInt();

        System.out.print("Enter value 2: ");
        int num1 = sc.nextInt();

        System.out.println("Total: "+ (num * num1));
    }
}
