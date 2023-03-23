package lab1;

import java.util.Scanner;

public class Lab1bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the a:");
        int a = scanner.nextInt();
        System.out.println("Enter the b:");
        int b = scanner.nextInt();
        System.out.println("Enter the c:");
        int c = scanner.nextInt();
        double delta = Math.pow(b, 2) - 4 * a * c;
        System.out.println("Delta:" + delta);
        double deltaSqrt;
        if (delta > 0) {
            deltaSqrt = Math.sqrt(delta);
            System.out.printf("deltaSqrt %.2f", deltaSqrt);
        } else {
            System.out.println("deltaSqrt is not exist");

        }

        scanner.close();

    }
}
