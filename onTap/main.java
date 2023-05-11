package onTap;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class main {
    public static void main(String[] args) throws ParseException {
        DsKhachHang danhSachKhachHang = new DsKhachHang();
        KhachHang kh1 = new KhachHang("x112", "Ho Nguyen Nam", 999);
        KhachHang kh2 = new KhachHang("x114", "Ho Nguyen Van", 111);
        KhachHang kh3 = new KhachHang("x113", "Ho Nguyen Hai", 888);
        danhSachKhachHang.addKh(kh3);
        danhSachKhachHang.addKh(kh1);
        danhSachKhachHang.addKh(kh2);
        System.out.println("----------------------------------------------------------------");
        danhSachKhachHang.output();
        SanPham sp1 = new SanPham("x112", "ao dai tay", "Trung Quoc", 12, 20000, 30000);
        SanPham sp2 = new SanPham("x113", "ao ngan tay", "Trung Quoc", 20, 25000, 40000);
        SanPham sp3 = new SanPham("x114", "quan dai", "Trung Quoc", 29, 30000, 50000);
        DsSanPham danhSachSanPham = new DsSanPham();
        danhSachSanPham.addSanPham(sp3);
        danhSachSanPham.addSanPham(sp1);
        danhSachSanPham.addSanPham(sp2);
        System.out.println("----------------------------------------------------------------");
        danhSachSanPham.output();
        DsSanPham danhSachMua1 = new DsSanPham();
        sp1.setSoLuongBan(1);
        sp2.setSoLuongBan(1);
        danhSachMua1.addSanPham(sp2);
        danhSachMua1.addSanPham(sp1);
        DonHang donHang1 = new DonHang();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        donHang1.addDonHang("x123", format.parse("12/02/2022"), "x123", danhSachMua1);
        System.out.println("----------------------------------------------------------------");
        donHang1.output();
        DsSanPham danhSachMua2 = new DsSanPham();
        sp1.setSoLuongBan(3);
        sp2.setSoLuongBan(10);
        danhSachMua2.addSanPham(sp2);
        danhSachMua2.addSanPham(sp1);
        DonHang donHang2 = new DonHang();
        donHang2.addDonHang("x123", format.parse("12/08/2022"), "x123", danhSachMua2);
        DsDonHang danhSachDonHang = new DsDonHang();
        danhSachDonHang.addDsDonHang(donHang2);
        danhSachDonHang.addDsDonHang(donHang1);
        Date date = new Date();
        DsDonHang checkCompare=danhSachDonHang.compare(date, danhSachDonHang);
        System.out.println("------------------------Compate----------------------------------------");
        checkCompare.output();

    }
}
