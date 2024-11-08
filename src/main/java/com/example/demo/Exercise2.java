package com.example.demo;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a value for inch: ");
        double inch = input.nextDouble();

        // Conversion factor for inch to meter
        double meter = inch * 0.0254;

        System.out.println(inch + " inch is " + meter + " meters");

        input.close(); // Close the scanner to prevent resource leak
    }
}
