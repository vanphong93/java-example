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
                case 2:// xoa sinh vien
                    String idStudent = Util.inputString("Nhap id sinh vien", false);
                    Student stFind = ls.getStudentById(idStudent);
                    if (stFind != null) {
                        ls.deleteStuById(stFind);
                        ls.outputStudent();
                    } else {
                        Util.decoExit();
                        System.out.println("Khong tim thay sinh vien");
                    }

                    break;
                case 3:// update sinh vien
                    String idUpdate = Util.inputString("Nhap id sinh vien can update", false);
                    Student stUpdate = ls.updateStudent(idUpdate);
                    if (stUpdate != null) {
                        System.out.println("----Sinh vien da update-----");
                        System.out.println(stUpdate);
                        Util.decoExit();
                    } else {
                        Util.decoExit();
                        System.out.println("Khong tim thay sinh vien");
                    }
                    break;
                case 4: // them lop hoc
                    int quantityRoom = Util.inputInteger("Xin nhap so lop hoc", 1, null);
                    for (int i = 0; i < quantityRoom; i++) {
                        System.out.println("Nhap lop hoc " + (i + 1) + ":");
                        lr.inputRoom();
                    }
                    lr.outputRoom();
                    break;
                case 5: // xoa lop hoc

                    String roomDelete = Util.inputString("Nhap id lop hoc", false);
                    Room rFind = lr.getRoomById(roomDelete);
                    if (rFind != null) {
                        lr.deleteRoomById(rFind);
                        lr.outputRoom();
                    } else {
                        Util.decoExit();
                        System.out.println("Khong tim thay lop hoc");
                    }
                    break;
                case 6: // update lop hoc
                    String idUpdateRoom = Util.inputString("Nhap id lop hoc can update", false);
                    Room rUpdate = lr.updateRoom(idUpdateRoom);
                    if (rUpdate != null) {
                        System.out.println("----Lop hoc da update-----");
                        System.out.println(rUpdate);
                        Util.decoExit();

                    } else {
                        Util.decoExit();
                        System.out.println("Khong tim thay lop hoc");

                    }
                    break;
                case 7: // them sinh vien vao lop hoc
                String idStuAdd = Util.inputString("Nhap id sinh vien can them", false);
                Student stAdd = ls.getStudentById(idStuAdd);
                if (stAdd != null) {
                        String idRoom = Util.inputString("Nhap id lop hoc", false);
                        lr.addStu(idRoom, stAdd);
                        lr.outputRoom();
                    }
                    else {
                        Util.decoExit();
                        System.out.println("Khong tim thay sinh vien");
                    }
                    break;
                case 8:// them mon hoc
                    int quaSub = Util.inputInteger("Xin nhap so mon hoc", 1, null);
                    for (int i = 0; i < quaSub; i++) {
                        System.out.println("Nhap mon hoc " + (i + 1) + ":");
                        lsub.inputSubject();
                    }
                    System.out.println("----Mon Hoc ------");
                    lsub.outputSubject();
                    break;
                case 9:// xoa mon hoc
                    String subDelete = Util.inputString("Nhap id mon hoc", false);
                    Subject subFind = lsub.getSubjectById(subDelete);
                    if (subFind != null) {
                        lsub.delSubById(subFind);
                        System.out.println("----Mon Hoc Con Lai------");
                        lsub.outputSubject();
                    } else {
                        Util.decoExit();
                        System.out.println("Khong tim thay mon hoc");
                    }
                    break;
                case 10:// update mon hoc
                    String idUpdateSub = Util.inputString("Nhap id mon hoc can update", false);
                    Subject subUpdate = lsub.updateSubject(idUpdateSub);
                    if (subUpdate != null) {
                        System.out.println("----Mon hoc da update-----");
                        System.out.println(subUpdate);
                        Util.decoExit();

                    } else {
                        Util.decoExit();
                        System.out.println("Khong tim thay mon hoc");
                    }
                    break;
                case 11: // sinh vien dang ki mon hoc
                    String idSub = Util.inputString("Nhap id mon hoc can them (mhXXX)", false);
                    Subject sub = lsub.getSubjectById(idSub);
                    if (sub != null) {
                        String idStu = Util.inputString("Nhap id sinh vien can them mon hoc (svXXX)", false);
                        int semester = Util.inputInteger("Nhap hoc ki (1-10)", 1, 10);
                        Float score = Util.inputFloat("Nhap so diem (0-10)", 0F, 10F);
                        SubRegister data = new SubRegister(
                                sub.getId(), sub.getName(), semester, score);
                        ls.addSubRegister(idStu, data);
                        ls.outputStudent();
                    } else {
                        Util.decoExit();
                        System.out.println("Khong tim thay mon hoc");
                    }
                    break;
                case 12: // cap nhat diem mon hoc cho sinh vien
                    String idStuUpdate = Util.inputString("Nhap id sinh vien (svXXX)", true);
                    String idSubUpdate = Util.inputString("Nhap id mon hoc update (mhXXX)", true);
                    Float scoreUpdate = Util.inputFloat("Nhap so diem update (0-10)", 0F, 10F);
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