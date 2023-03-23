package lab1;

import java.util.Scanner;

public class Lab1bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of rectangle: ");
        int length = scanner.nextInt();
        System.out.println("Enter width of rectangle: ");
        int width = scanner.nextInt();
        scanner.close();
        int area = length * width;
        System.out.println("Area of rectangle: " + area);
        int perimeter = 2 * (length + width);
        System.out.println("Perimeter of rectangle: " + perimeter);
        int min = Math.min(length, width);
        System.out.println("Minimum of rectangle: " + min);
    }
}
