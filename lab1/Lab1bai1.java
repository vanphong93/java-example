package lab1;

import java.util.Scanner;

public class Lab1bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name ");
        String name = scanner.nextLine();
        System.out.print("Enter the point ");
        double point = scanner.nextInt();
        System.out.printf("%s %.2f point", name, point);
        scanner.close();
    }

}
