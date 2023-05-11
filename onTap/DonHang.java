package onTap;

import java.util.Date;
import java.util.Map;

public class DonHang {
    private String maDonHang;
    private Date ngayMua;
    private String maKhachHang;
    private DsSanPham ds;

    public void DonHang() {
    }

    public void addDonHang(String maDonHang, Date ngayMua, String maKhach, DsSanPham dsMua) {
        this.maKhachHang = maKhach;
        this.maDonHang = maDonHang;
        this.ngayMua = ngayMua;
        this.ds = dsMua;
    }

    public String getMaDonHang() {
        return maDonHang;
    }

    public void setMaDonHang(String maDonHang) {
        this.maDonHang = maDonHang;
    }

    public Date getNgayMua() {
        return ngayMua;
    }

    public void setNgayMua(Date ngayMua) {
        this.ngayMua = ngayMua;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public DsSanPham getDs() {
        return ds;
    }

    public void setDs(DsSanPham ds) {
        this.ds = ds;
    }

    public int tinhTong() {
        int total = 0;
        for (SanPham item : this.ds.getDanhSachSp()) {
            int giaTien = item.getSoLuongBan() * item.getGiaBan();
            total += giaTien;
        }
        return total;
    }

    public void output() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "DonHang [maDonHang=" + maDonHang + ", ngayMua=" + ngayMua + ", maKhachHang=" + maKhachHang + ", ds="
                + ds + "]";
    }

}
