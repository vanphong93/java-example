package lab2;

import java.util.Scanner;

/**
 * bai2
 */
public class bai2 {

    public void giaiPhuongTrinhBacHai() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" a*x^2 + bx +c = 0");
        System.out.print("enter value a= ");
        float a = scanner.nextFloat();
        System.out.print("enter value b= ");
        float b = scanner.nextFloat();
        System.out.print("enter value c= ");
        float c = scanner.nextFloat();
        scanner.close();
        float delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("No solution");
        }else {
            float x1 = (-b + (float) Math.sqrt(delta)) / (2 * a);
            float x2 = (-b - (float) Math.sqrt(delta)) / (2 * a);
            System.out.println("x1 = " + x1 + " and x2 = " + x2);
        }
    }
}