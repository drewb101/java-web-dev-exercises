package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;
public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius:");
        Double r = input.nextDouble();

        while (r <= 0) {
            System.out.println("Please enter a positive number.");
            r = input.nextDouble();
        }
        if(r.isNaN()) {
            System.out.println("Error: Did not enter a number.");
            return;
        }

        Double area = Circle.getArea(r);
        System.out.println("The area of a circle of radius " + r + " is: " + area);
    }
}
