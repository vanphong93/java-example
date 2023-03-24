package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class bai3 {
    public void nhapMangSo() {
        Scanner scanner = new Scanner(System.in);
        int array[];
        System.out.print("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();
        array = new int[n];
        int i = 0;
        do {
            System.out.print("array" + "[" + i + "]= ");
            array[i] = scanner.nextInt();
            i++;
        } while (i < array.length);

        System.out.print("Mang da nhap: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        int min = array[0];
        int sum = 0;
        int index = 0;
        for (int num : array) {

            min = Math.min(min, num);
            if (num % 3 == 0) {
                sum += num;
                index++;
            }
        }
        System.out.println("\nPhan tu nho nhat trong mang " + min);
        if (index > 0) {
            System.out.println("Gia tri trung binh so chia het 3: " + sum / index);
        } else {
            System.out.println("khong ton tai so chia het 3");
        }

        Arrays.sort(array);
        System.out.print("Mang sau khi sap xep: ");
        for (int num : array) {

            System.out.print(num + " ");
        }
        System.out.println();
    }
}
