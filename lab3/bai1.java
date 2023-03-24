package lab3;

import java.util.Scanner;

public class bai1 {
    public void checkPrime() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=scanner.nextInt();
        scanner.close();
        float sqrt= (float) Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                System.out.println(n + " is not a prime number");
                return;
            }
        }
        System.out.println(n + " is a prime number");
    }
}
