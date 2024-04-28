package org.launchcode;

import java.util.Scanner;
public class Numeric {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double recArea;

        System.out.println("What is the Base of the Rectangle?");
        Double recBase = input.nextDouble();

        System.out.println("What is the Height of the Rectangle?");
        Double recHeight = input.nextDouble();

        System.out.println("What is the Width of the Rectangle.");
        Double recWidth = input.nextDouble();

         recArea = recBase * recHeight * recWidth;
        System.out.println("The Area of the Rectangle is: " + recArea + "Ft.");
    }
}

