package chapter3;

import java.util.Scanner;

public class ChallengeDollarGame {
    public static void main(String args []){
        //The objective is to enter enough change to equal exactly to $1

        double penniesValue = 0.01;
        double nickelsValue = 0.05;
        double dimesValue = 0.10;
        double quarterValue = 0.25;


        //ask for each coin how many
        System.out.println("the goal of the game is to enter quatities of coins to equals $1");
        System.out.println("How many Pennies would you like?");
        Scanner scanner = new Scanner(System.in);
        double pennies = scanner.nextDouble();
        System.out.println("How many Nickles would you like?");
        double nickles = scanner.nextDouble();
        System.out.println("How many Dimes would you like?");
        double dimes = scanner.nextDouble();
        System.out.println("How many Quartes would you like?");
        double quarter = scanner.nextDouble();

        scanner.close();

        //logical math
        double change =(pennies * penniesValue) + (nickles * nickelsValue) +
                (dimes * dimesValue) + (quarter * quarterValue);

        double down = 1- change;
        double up = change - 1;

        if(change == 1) {
            System.out.println("Congrats! your  WIN");
        }
            if (change <1){
                System.out.println("Sorry, are down by $" + down);
            }
            else {
                System.out.println("Sorry, are up by $" + up);
            }
    }
}
