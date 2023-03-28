package test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Test
 */
public class Test {
    public static void main(String[] args) {
        ListStudent ls = new ListStudent();
        ListRoom lr = new ListRoom();
        ListSubject lsub = new ListSubject();
        boolean condition = true;
        while (condition) {
            System.out.println("1. Them sinh vien "
                    + "2. Xoa sinh vien " + "3. Update sinh vien \n"
                    + "4. Them lop hoc " + "5. Xoa lop hoc "
                    + "6. Update lop hoc " + "7. Them sinh vien vao lop hoc \n" + "8. Them mon hoc "
                    + "9. Xoa mon hoc "
                    + "10. Update mon hoc " + "11. Hoc sinh dang ki mon hoc " + "12. Cap nhat diem mon hoc \n"
                    + "13. Sap xep tang dan theo diem trung binh \n"
                    + "14. Lop co ty le rot >10 % \n"
                    + "15. Exit \n");
            int num = Util.inputInteger("Xin chon ", 1, null);
            switch (num) {
                case 1:
                    int quantity = Util.inputInteger("Xin nhap so sinh vien", 1, null);
                    for (int i = 0; i < quantity; i++) {
                        System.out.println("Nhap sinh vien " + (i + 1) + ":");
                        ls.inputStudent();
                    }
                    ls.outputStudent();
                    break;
                case 2:
                    String idStudent = Util.inputString("Nhap id sinh vien", false);
                    Student stFind = ls.getStudentById(idStudent);
                    if (stFind != null) {
                        ls.deleteStuById(stFind);
                    }
                    ls.outputStudent();
                    break;
                case 3:
                    String idUpdate = Util.inputString("Nhap id sinh vien can update", false);
                    Student stUpdate = ls.updateStudent(idUpdate);
                    System.out.println(stUpdate);
                    break;
                case 4: // them lop hoc

                    int quantityRoom = Util.inputInteger("Xin nhap so lop hoc", 1, null);
                    for (int i = 0; i < quantityRoom; i++) {
                        System.out.println("Nhap lop hoc " + (i + 1) + ":");
                        lr.inputRoom();
                    }
                    lr.outputRoom();
                    break;
                case 5:
                    // xoa lop hoc
                    break;
                case 6: // update lop hoc
                    break;
                case 7: // them sinh vien vao lop hoc
                    String idRoom = Util.inputString("Nhap id lop hoc", false);
                    String idStuAdd = Util.inputString("Nhap id sinh vien can them", false);
                    Student stAdd = ls.getStudentById(idStuAdd);
                    if (stAdd != null) {
                        lr.addStu(idRoom, stAdd);
                    }
                    lr.outputRoom();
                    break;
                case 8:
                    int quaSub = Util.inputInteger("Xin nhap so mon hoc", 1, null);
                    for (int i = 0; i < quaSub; i++) {
                        System.out.println("Nhap mon hoc " + (i + 1) + ":");
                        lsub.inputSubject();
                    }
                    lsub.outputSubject();
                    break;
                case 9:// xoa mon hoc
                    break;
                case 10:// update mon hoc
                    break;
                case 11:
                    String idStu = Util.inputString("Nhap id sinh vien can them mon hoc", false);
                    String idSub = Util.inputString("Nhap id mon hoc can them", false);
                    int semester = Util.inputInteger("Nhap hoc ki", 1, 10);
                    Float score = Util.inputFloat("Nhap so diem", 0F, 10F);
                    Subject sub = lsub.getSubjectById(idSub);
                    if (sub != null) {
                        SubRegister data = new SubRegister(
                                sub.getId(), sub.getName(), semester, score);
                        ls.addSubRegister(idStu, data);
                    }
                    ls.outputStudent();
                    break;
                case 12:
                    String idStuUpdate = Util.inputString("Nhap id sinh vien", true);
                    String idSubUpdate = Util.inputString("Nhap id mon hoc update", true);
                    Float scoreUpdate = Util.inputFloat("Nhap so score update", 0F, 10F);
                    ls.scoreSubUpdate(idStuUpdate, idSubUpdate, scoreUpdate);
                    ls.outputStudent();
                    break;
                case 13:// mmin to max averageScore
                    ls.sortByScore();
                    break;
                case 14:// rooms have averageScore <5
                    lr.averageScoreRoomLess();
                    break;
                case 15:
                    condition = false;
                    break;
                default:
                    condition = false;
                    break;
            }
        }

    }

}