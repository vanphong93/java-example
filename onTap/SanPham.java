package onTap;

public class SanPham {
    private String maSp;
    private String tenSp;
    private String xuatXu;
    private int soLuong;
    private int giaNhap;
    private int giaBan;
    private int soLuongBan;

    public String getMaSp() {
        return maSp;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(int giaNhap) {
        this.giaNhap = giaNhap;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }
    public int getSoLuongBan() {
        return soLuongBan;
    }

    public void setSoLuongBan(int soLuongBan) {
        this.soLuongBan = soLuongBan;
    }

    public SanPham() {

    }

    public SanPham(String maSp, String tenSp, String xuatXu, int soLuong, int giaNhap, int giaBan) {
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.xuatXu = xuatXu;
        this.soLuong = soLuong;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
    }

    public void input() {
        this.setMaSp(Util.inpuString("Nhap ma san pham", false));
        this.setGiaBan(Util.inpuInteger("Nhap gia ban"));
        this.setGiaNhap(Util.inpuInteger("Nhap gia nhap"));
        this.setSoLuong(Util.inpuInteger("Nhap so luong san pham"));
        this.setTenSp(Util.inpuString("Nhap ten san pham", false));
        this.setXuatXu(Util.inpuString("Nhap xua xu san pham", false));
    }

    public void output() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "SanPham [maSp=" + maSp + ", tenSp=" + tenSp + ", xuatXu=" + xuatXu + ", soLuong=" + soLuong
                + ", giaNhap=" + giaNhap + ", giaBan=" + giaBan + "]";
    }

  
}
