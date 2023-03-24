package lab2;

import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner choose = new Scanner(System.in);
        System.out.println("Xin chon menu: \n" + "1. Giai phuong trinh bac nhat \n"
                + "2. Giai phuong trinh bac hai \n" + "3. Tinh tien dien \n" + "4. Thoat");
        int option = choose.nextInt();
        switch (option) {
            case 1:
                bai1 bai1 = new bai1();
                bai1.giaiPhuongTrinh();
                break;
            case 2:
                bai2 bai2 = new bai2();
                bai2.giaiPhuongTrinhBacHai();
            case 3:
                bai3 bai3 = new bai3();
                bai3.tinhTienDien();
                break;
            default:
                System.out.println("Da thoat chuong trinh");
        }
        choose.close();
    }
}
