// For an overview of the program and sample inputs, be sure to check out `NetPay.md`

import java.util.Scanner;

public class NetPay {
    public static void main(String[] args) {
        // Declared Implementation Constants
        double FEDERAL_TAX_PERCENT = 0.10;
        double STATE_TAX_PERCENT = .045;
        double SS_PERCENT = .062;
        double MEDICARE_PERCENT = .0145;
        double PAY_PER_HOUR = 7.25;

        //User input for Hours per Week worked
        Scanner HPW_INPUT = new Scanner(System.in);
        System.out.print("Hours per Week: " + '\t');
        double HOURS_PER_WEEK = HPW_INPUT.nextDouble();
        HPW_INPUT.close();

        //Gross Pay
        double GROSS_PAY = HOURS_PER_WEEK * PAY_PER_HOUR;
        //Federal Tax (10%)
        double FEDERAL_TAX = GROSS_PAY * FEDERAL_TAX_PERCENT;
        //State Tax (4.5%)
        double STATE_TAX = GROSS_PAY * STATE_TAX_PERCENT;
        //SS Contribution (6.2%)
        double SS_CONTR = GROSS_PAY * SS_PERCENT;
        //Medicare (1.45%) 
        double MEDICARE = GROSS_PAY * MEDICARE_PERCENT;
        //Net Pay
        double NET_PAY = GROSS_PAY - (FEDERAL_TAX + STATE_TAX + SS_CONTR + MEDICARE); {
            //Program's Console Outputs
            System.out.println("Gross Pay:" + '\t' + '\t' + GROSS_PAY);
            System.out.println("Net Pay:" + '\t' + '\t' + NET_PAY);
            System.out.println("\nDeductions");
            System.out.println("Federal:" + '\t' + '\t' + FEDERAL_TAX);
            System.out.println("State:" + '\t' + '\t' + '\t' + STATE_TAX);
            System.out.println("Social Security:" + '\t' + SS_CONTR);
            System.out.println("Medicare:" + '\t' + '\t' + MEDICARE);
        }
    }
}
