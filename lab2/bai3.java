package lab2;

import java.util.Scanner;

public class bai3 {
    public void tinhTienDien() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so dien tieu thu kw =");
        int soDien = scanner.nextInt();
        scanner.close();
        long tien;
        if (soDien < 50) {
            tien = soDien * 1000;
        } else {
            tien = 50 * 1000 + (soDien - 50) * 1200;
        }
        System.out.println("So tien dien la = " + tien +" dong");
    }
}
