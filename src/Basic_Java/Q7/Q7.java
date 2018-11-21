package Basic_Java.Q7;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input Number: ");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {

            System.out.println (num + "*" + i + " = " + (num * i));
        }

    }

}
