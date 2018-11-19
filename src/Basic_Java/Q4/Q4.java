package Basic_Java.Q4;

public class Q4 {
    public static void main(String[] args) {

        /**
         * 4. Write a Java program to print the result of the following operations. Go to the editor
         * Test Data:
         * a. -5 + 8 * 6
         * b. (55+9) % 9
         * c. 20 + -3*5 / 8
         * d. 5 + 15 / 3 * 2 - 8 % 3
         * Expected Output :
         * 43
         * 1
         * 19
         * 13
         */

       int a, num1=-5, num2=8, num3 =6;
       a = num1+num2*num3;
        System.out.println("Total "+a);

        int b,num4=(55+9),num5=9;
        b = num4%num5;
        System.out.println("total "+ b);

        int c,num6=20,num7=-3*5,num8=8;
        c = num6+num7/num8;
        System.out.println("total "+ c);

        int num10 = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println("total "+ num10 );

    }
}

