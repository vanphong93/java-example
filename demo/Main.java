
package demo;

import test.Util;

/**
 * Main
 */
class MonHoc {
	String tenmh;
	int sotinchi;

	MonHoc() {
	}

	MonHoc(String t, int stc) {
		tenmh = t;
		sotinchi = stc;
	}

	public String toString() {
		return tenmh + " " + sotinchi;
	}

}

class GiaoVien {
	String hoTen;
	MonHoc[] giangDay;

	GiaoVien(String h, MonHoc[] g) {
		hoTen = h;
		giangDay = new MonHoc[g.length];
		for (int i = 0; i < g.length; i++) {
			giangDay[i] = new MonHoc();
			giangDay[i] = g[i];
		}
	}

	void output() {
		System.out.println("Ho va ten : " + hoTen);
		System.out.println("mon giang day : ");
		for (int i = 0; i < giangDay.length; i++) {
			System.out.println(giangDay[i]);
		}
	}
}

public class Main {

	public static void main(String[] args) {

		int quantityTeacher = Util.inputInteger("Nhap so luong giao vien", null, null);
		GiaoVien[] giaoVien = new GiaoVien[quantityTeacher];
		for (int i = 0; i < quantityTeacher; i++) {
			System.out.println("Giao vien " + (i + 1));
			String ten = Util.inputString("Ten giao vien", false);
			int quantitySubject = Util.inputInteger("Nhap so luong mon hoc", null, null);
			MonHoc[] monHoc = new MonHoc[quantitySubject];
			for (int k = 0; k < quantitySubject; k++) {
				monHoc[k] = new MonHoc();
				monHoc[k].tenmh = Util.inputString("Nhap ten mon hoc", false);
				monHoc[k].sotinchi = Util.inputInteger("Nhap so tin chi", null, null);
			}
			giaoVien[i] = new GiaoVien(ten, monHoc);
		}
		for (GiaoVien item : giaoVien) {
			item.output();
		}
	}

}