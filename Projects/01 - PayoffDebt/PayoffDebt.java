// Purpose: Through principal, annual interest rate, and monthly payment; the program will compute
// the number of months left to pay off a debt as well as the amount, interest, and any over-payments.

import java.util.Scanner;
import java.lang.Math;

public class PayoffDebt {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Prompt User for Inputs
        System.out.print("Principal: \t\t\t");
        double principal = scan.nextDouble();
        System.out.print("Annual Interest Rate (%): \t");
        double annualInterestRate = scan.nextDouble();
        System.out.print("Monthly Payment: \t\t");
        double monthlyPayment = scan.nextDouble();

        scan.close();

        //Spacing
        System.out.println("\t");

        //Calculating months needed to pay off
        double numeratorMonthsNeededToPayOff = (Math.log(monthlyPayment)) - Math.log(monthlyPayment - (annualInterestRate / 1200.0 * principal));
        double denominatorMonthsNeededToPayOff = (Math.log((annualInterestRate / 1200.0) + 1.0));
        double monthsNeededToPayOff = (numeratorMonthsNeededToPayOff / denominatorMonthsNeededToPayOff);

        //Other outputs 
        int monthsToPayOff = (int) Math.ceil(monthsNeededToPayOff);
        System.out.println("Months Needed To Pay Off: \t" + monthsToPayOff);


        double totalAmountPaid = monthlyPayment * monthsToPayOff;
        System.out.printf("Total Amount Paid: \t\t$%.2f", totalAmountPaid);


        double totalInterestPaid = totalAmountPaid - principal;
        System.out.printf("\nTotal Interest Paid: \t\t$%.2f", totalInterestPaid);


        double overPayment = (monthsToPayOff - monthsNeededToPayOff) * monthlyPayment;
        System.out.printf("\nOverpayment: \t\t\t$%.2f", overPayment);


    }
}
