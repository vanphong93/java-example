package lab3;

import java.util.Scanner;

/**
 * bai4
 */
public class bai4 {

    public void mangSinhVien() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so sinh vien: ");
        int soSinhVien = scanner.nextInt();
        String arrayName[] = new String[soSinhVien];
        int arrayPoint[] = new int[soSinhVien];
        for (int i = 0; i < soSinhVien; i++) {
            System.out.print("nhap ten sinh vien (ko co khoang trang ): ");
            arrayName[i] = scanner.next();
            System.out.print("nhap diem ");
            arrayPoint[i] = scanner.nextInt();
        }

        for (int i = 0; i < soSinhVien; i++) {
            if (arrayPoint[i] < 5) {

                System.out.println( "Ten "+arrayName[i] + " Diem trung binh: " + arrayPoint[i] + " Hoc luc yeu");
            } else if (5 <= arrayPoint[i] && arrayPoint[i] < 6.5) {
                System.out.println( "Ten "+arrayName[i] + " Diem trung binh: " + arrayPoint[i] + " Hoc luc trung binh");
            } else if (6.5 <= arrayPoint[i] && arrayPoint[i] < 7.5) {
                System.out.println( "Ten "+arrayName[i] + " Diem trung binh: " + arrayPoint[i] + " Hoc luc kha");
            } else if (7.5 <= arrayPoint[i] && arrayPoint[i] < 9) {
                System.out.println( "Ten "+arrayName[i] + " Diem trung binh: " + arrayPoint[i] + " Hoc luc gioi");
            } else {
                System.out.println( "Ten "+arrayName[i] + " Diem trung binh: " + arrayPoint[i] + " Hoc luc xuat sac");
            }
        }
    };

}