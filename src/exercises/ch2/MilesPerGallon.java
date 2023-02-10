package exercises.ch2;

import java.util.Scanner;
public class MilesPerGallon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter miles driven:");
        double miles = input.nextDouble();

        System.out.println("Enter gallons consumed:");
        double gallons = input.nextDouble();

        double mpg = miles/gallons;
        System.out.println("Your miles-per-gallon is: " + mpg);
    }
}
