/*
 *  UCF COP3330 Summer 2021 Exercise 12 Solution
 *  Copyright 2021 Christopher Gray
 */
package base;

import java.util.Scanner;

public class App {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        double principal = myApp.readPrincipal();
        double roi = myApp.readRoi();
        int years = myApp.readYears();

        double investment = myApp.calculateInvestment(principal, roi, years);
        String output = myApp.generateOutputString(years, roi * 100, investment);

        myApp.displayOutput(output);
    }

    private double readPrincipal() {
        System.out.print("Enter the Principal: ");
        return in.nextDouble();
    }

    private double readRoi() {
        System.out.print("Enter the rate of interest: ");
        return in.nextDouble() / 100;
    }

    private int readYears() {
        System.out.print("Enter the number of years: ");
        return in.nextInt();
    }

    private double calculateInvestment(double principal, double roi, int years) {
        return Math.ceil(principal * (1 + (roi * years)) * 100) / 100;
    }

    // Ensure roi is entered as a percentage i.e 4.3 not .043
    public String generateOutputString(int years, double roi, double investment) {
        return String.format("After %d years at %.1f%%, the investment will be worth $%.0f.", years, roi, investment);
    }

    public void displayOutput(String output) { System.out.println(output); }
}
