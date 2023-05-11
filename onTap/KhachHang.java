package onTap;

public class KhachHang {
    private String maKh;
    private String tenKh;
    private int phone;

    public String getMaKh() {
        return maKh;
    }

    public void setMaKh(String maKh) {
        this.maKh = maKh;
    }

    public String getTenKh() {
        return tenKh;
    }

    public void setTenKh(String tenKh) {
        this.tenKh = tenKh;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public KhachHang() {
    }

    public KhachHang(String maKh, String tenKh, int phone) {
        this.maKh = maKh;
        this.tenKh = tenKh;
        this.phone = phone;
    }

    public void input() {
        this.setMaKh(Util.inpuString("Nhap ma khach hang", false));
        this.setTenKh(Util.inpuString("Nhap ten khach hang", false));
        this.setPhone(Util.inpuInteger("Nhap ten khach hang"));

    }

    public void output() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "KhachHang [maKh=" + maKh + ", tenKh=" + tenKh + ", phone=" + phone + "]";
    }

}
