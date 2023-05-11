package onTap;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DsDonHang {
    private List<DonHang> danhSachDh;

    public List<DonHang> getDanhSachDh() {
        return danhSachDh;
    }

    public void setDanhSachDh(List<DonHang> danhSachDh) {
        this.danhSachDh = danhSachDh;
    }

    public DonHang getDonHang(String id) {
        for (DonHang donHang : danhSachDh) {
            if (donHang.getMaDonHang().equals(id)) {
                return donHang;
            }
        }
        return null;
    }

    public DsDonHang() {
        this.danhSachDh = new ArrayList();
    }

    public void addDsDonHang(DonHang item) {
        String id = item.getMaDonHang();
        DonHang dh = getDonHang(id);
        if (dh == null) {
            this.danhSachDh.add(item);
        }
    }

    public DsDonHang compare(Date begin, DsDonHang dsCompare) {
        DsDonHang temp = new DsDonHang();
        for (DonHang item : dsCompare.danhSachDh) {
            Date date = item.getNgayMua();
            if (date.compareTo(begin) < 0) {
                temp.addDsDonHang(item);
            }
        }
        return temp;
    }

    public void output() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "DsDonHang [danhSachDh=" + danhSachDh + "]";
    }

}
