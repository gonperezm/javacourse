package Chapter5;

import java.util.Scanner;


public class ChallengePhoneBillCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base plan fee: $");
        double basePlanFee = scanner.nextDouble();

        System.out.print("Enter the number of overage minutes: ");
        int overageMinutes = scanner.nextInt();

        scanner.close();

        double overageFee = calculateOverageFee(overageMinutes);
        double subtotal = basePlanFee + overageFee;
        double tax = calculateTax(subtotal);
        double total = subtotal + tax;

        // Print itemized bill
        System.out.println("** Phone Bill Statement **");
        System.out.println("Base Plan Fee: $" + basePlanFee);
        System.out.println("Overage Fee: $" + overageFee);
        System.out.println("Tax (15%): $" + tax);
        System.out.println("----------------------------");
        System.out.println("Total: $" + total);
    }

    // Method to calculate overage fees
    public static double calculateOverageFee(int overageMinutes) {
        double overageRate = 0.25; // $0.25 per minute
        return overageMinutes * overageRate;
    }

    // Method to calculate tax
    public static double calculateTax(double subtotal) {
        double taxRate = 0.15; // 15%
        return subtotal * taxRate;
    }

}
