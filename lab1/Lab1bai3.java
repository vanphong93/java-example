package lab1;

import java.util.Scanner;

public class Lab1bai3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the length ");
        int length=scanner.nextInt();
        double volume= Math.pow(length, 3);
        System.out.println("volume is cube "+volume);
        scanner.close();
    }
}
