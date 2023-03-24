package lab2;

import java.util.Scanner;

public class bai1 {
    public void giaiPhuongTrinh() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ax + b = 0");
        System.out.print("enter value a= ");
        long a = scanner.nextLong();
        System.out.print("enter value b= ");
        long b = scanner.nextLong();
        scanner.close();
        if (a == 0) {
            if (b != 0) {
                System.out.print("No solution");
            } else {
                System.out.print("Infinitely many solutions");
            }
        } else {
            float x = (float) -b / a;
            System.out.println("x = " + x);
        }
    }
}
