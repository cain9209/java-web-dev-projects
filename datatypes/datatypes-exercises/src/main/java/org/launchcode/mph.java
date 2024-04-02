package org.launchcode;

import java.util.Scanner;

public class mph {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double solveMph;

        System.out.println("What are the amount of miles you have driven?");
        Double milesDriven = input.nextDouble();

        System.out.println("How many gallons of gas in (Gallons) have you consumed?");
        Double galUsed = input.nextDouble();

        solveMph = milesDriven / galUsed;
        System.out.println("Your fuel economy equates to: " + solveMph + "mpg.");
    }
}




