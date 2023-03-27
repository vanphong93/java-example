package test;

import java.util.Scanner;

/**
 * Test
 */
public class Test {
    public static void main(String[] args) {
        ListStudent ls = new ListStudent();
        ListRoom lr = new ListRoom();
        boolean condition = true;
        Room roomClass = new Room();
        while (condition) {

            System.out.println("1. Them sinh vien \n"
                    + "2. Xoa sinh vien \n" + "3. Update sinh vien \n"
                    + "4. Them lop hoc \n" + "5. Xoa lop hoc \n"
                    + "6. Update lop hoc \n" + "5. Them lop hoc \n" + "5. Them lop hoc \n" + "5. Them lop hoc \n"
                    + "5. Them lop hoc \n" + "5. Them lop hoc \n" + "5. Them lop hoc \n" + "5. Them lop hoc \n");
            int num = Util.inputInteger("Xin chon: ", 1, null);
            switch (num) {
                case 1:
                    int quantity = Util.inputInteger("Xin nhap so sinh vien", 1, null);
                    for (int i = 0; i < quantity; i++) {
                        System.out.println("input student " + i + ":");
                        ls.inputStudent();
                    }
                    ls.outputStudent();
                    break;
                case 2:
                    String idStudent = Util.inputString("nhap id sinh vien", false);
                    Student stFind = ls.getStudentById(idStudent);
                    if (stFind != null) {
                        ls.deleteStuById(stFind);
                    }
                    ls.outputStudent();
                    break;
                case 3:
                    String idUpdate = Util.inputString("nhap id sinh vien can update", false);
                    Student stUpdate = ls.updateStudent(idUpdate);
                    System.out.println(stUpdate);
                    break;
                case 4:
                    int quantityRoom = Util.inputInteger("Xin nhap so lop hoc", 1, null);
                    for (int i = 0; i < quantityRoom; i++) {
                        System.out.println("input student " + i + ":");
                        lr.inputRoom();
                    }
                    lr.outputRoom();
                    break;
                case 5:

                    break;
                case 10:
                    condition = false;
                    break;
                default:
                    break;
            }
        }

    }

}