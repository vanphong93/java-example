package onTap;

import java.util.ArrayList;
import java.util.List;

public class DsKhachHang {
    private List<KhachHang> danhSachKh;

    public List<KhachHang> getDanhSachKh() {
        return danhSachKh;
    }

    public void setDanhSachKh(List<KhachHang> danhSachKh) {
        this.danhSachKh = danhSachKh;
    }

    public DsKhachHang() {
        this.danhSachKh = new ArrayList();
    }

    public KhachHang getKhachHang(String id) {
        for (KhachHang KhachHang : danhSachKh) {
            if (KhachHang.getMaKh().equals(id)) {
                return KhachHang;
            }
        }
        return null;
    }

    public void addKh(KhachHang newKhachHang) {
        String id = newKhachHang.getMaKh();
        KhachHang sp = getKhachHang(id);
        if (sp==null) {

            this.danhSachKh.add(newKhachHang);
        }
    }
public void output(){
    System.out.println(toString());
}
    @Override
    public String toString() {
        return "DsKhachHang [danhSachKh=" + danhSachKh + "]";
    }
    
}
