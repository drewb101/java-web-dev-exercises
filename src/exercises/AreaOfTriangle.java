package exercises;

import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the rectangle's length:");
        int length = input.nextInt();

        System.out.println("Enter the rectangle's height:");
        int height = input.nextInt();

        int area = length * height;
        System.out.println("The area of the rectangle is:" + area);
        input.close();
    }
}
