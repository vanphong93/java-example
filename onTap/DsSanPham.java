package onTap;

import java.util.ArrayList;
import java.util.List;

public class DsSanPham {
    private List<SanPham> danhSachSp;
    public List<SanPham> getDanhSachSp() {
        return danhSachSp;
    }

    public void setDanhSachSp(List<SanPham> danhSachSp) {
        this.danhSachSp = danhSachSp;
    }

    public DsSanPham() {
        this.danhSachSp = new ArrayList();
    }

    public SanPham getSanPham(String id) {
        for (SanPham sanPham : danhSachSp) {
            if (sanPham.getMaSp().equals(id)) {
                return sanPham;
            }
        }
        return null;
    }

    public void addSanPham(SanPham newSanPham) {
        String id = newSanPham.getMaSp();
        SanPham sp = getSanPham(id);
        if (sp == null) {
            this.danhSachSp.add(newSanPham);
        }
    }

    public void output() {System.out.println(toString());
    }

    @Override
    public String toString() {
        return "DsSanPham [danhSachSp=" + danhSachSp + "]";
    }

}
