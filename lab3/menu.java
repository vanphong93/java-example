package lab3;

import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner choose = new Scanner(System.in);
        System.out.println("Xin chon menu: \n" + "1. Kiem tra so nguyen to \n"
                + "2. In bang cuu chuong \n" + "3. Nhap mang so, sap xep, tinh trung binh \n"
                + "4. Nhap mang sinh vien, diem \n" + "5. Thoat");
        int option = choose.nextInt();
        switch (option) {
            case 1:
                bai1 bai1 = new bai1();
                bai1.checkPrime();
                break;
            case 2:
                bai2 bai2 = new bai2();
                bai2.bangCuuChuong();
                break;
            case 3:
                bai3 bai3 = new bai3();
                bai3.nhapMangSo();
                break;
            case 4:
            bai4 bai4 = new bai4();
            bai4.mangSinhVien();
            break;
            default:
                System.out.println("Da thoat chuong trinh");
        }
        choose.close();
    }
}
