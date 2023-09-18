package chapter3;

import java.util.Scanner;

/*
if statement
All sales people get a payment of $1000 a week.
Salespeople who exceed 10 sales get an addition bonus of $250
 */
public class salaryCalculator {
    public static void main (String args[]){

        //initialize know values
        int salary =1000;
        int bonus = 250;
        int quota = 10;

        //get values for the unknown
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //quick detour for the bonus earners
        if(sales > quota){
            salary = salary + bonus;
        }

        //output
        System.out.println("The employee's pay is $" + salary);

    }
}
