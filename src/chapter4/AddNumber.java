package chapter4;


/*
DO WWHILE LOOP:
Write a program that allow a user to enter two number,
and them sums up the two numbers. The user should be able to
repeat this action until they indicate they are done.
 */

import java.util.Scanner;

public class AddNumber {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        Boolean again = false;


        do{
            System.out.println("Enter the first number");
            double num1 = scanner.nextDouble();

            System.out.println("Enter the second number");
            double num2 = scanner.nextDouble();

            double sum= num1 + num2;
            System.out.println("The sum is " + sum);
            System.out.println("Would you like to start over?");
            again = scanner.nextBoolean();

        } while (again);
        scanner.close();







    }


}
