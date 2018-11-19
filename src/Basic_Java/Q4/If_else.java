package Basic_Java.Q4;

import java.util.Scanner;

public class If_else {
    public static void main(String[] args) {

        int num;
        Scanner input = new Scanner(System.in);

        System.out.println("enter any integer");
        num = input.nextInt();


        if (num>=1){
            System.out.println(" positive ");}

            else{

            System.out.println("Negative");
        }

    }
}
