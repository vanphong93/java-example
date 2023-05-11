
package demo;

import test.Util;



class GiaoVien {
	String hoTen;

	GiaoVien(String h) {
		hoTen = h;

	}

	void output() {
		System.out.println("Ho va ten : " + hoTen);

	}
}

public class Main {

	public static void main(String[] args) {
		GiaoVien[] giaoVien = new GiaoVien[2];


			giaoVien[0] = new GiaoVien("nguyen");
			giaoVien[1] = new GiaoVien("hai");
			// giaoVien[2] = new GiaoVien("thao");
		for (GiaoVien item : giaoVien) {
			item.output();
		}
	}

}	