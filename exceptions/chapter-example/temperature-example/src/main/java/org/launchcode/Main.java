package org.launchcode;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double fahrenheit;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        fahrenheit = input.nextDouble();
        input.close();

        Temperature currentTemp = new Temperature();
        currentTemp.setFahrenheit(fahrenheit);
    }
}

// checking to see if the end user inputs a temperature that is less than absolute 0 then we are useing try throw new and catch to throw an exception.
