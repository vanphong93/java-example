package test;

import java.util.List;

public class Room {
    public static final String ID_FORMAT = "lp\\d{3}";
    private String id;
    private String name;
    private Student[] students;

    public static String getIDFormat() {
        return Room.ID_FORMAT;
    }

    public static String inputIdRoom() {
        String id = null;
        do {
            id = Util.inputString("Nhap ma lop hoc", false);
        } while (!Room.isValidId(id));
        return id;
    }

    public static String inputIdStu() {
        String id = null;
        id = Util.inputString("Nhap ma sinh vien", false);
        return id;
    }

    private static boolean isValidId(String id) {
        return Util.validateStringPattern(id, Room.ID_FORMAT, true);
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        if (Room.isValidId(id)) {
            this.id = id.toLowerCase();
        }
    }

    public String getName() {
        return this.name;
    }
public String getStudents(){
    String str = "";
    if (this.students!= null) {
        for (int i = 0; i < this.students.length; i++) {
            str = str + this.students[i].toString() + "\n";
        }
    }
    return str;
}
    public void setName(String name) {
        if (name != null && !name.isBlank()) {
            this.name = name;
        }

    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void addStu(Student data) {
        if (this.students == null) {
            this.students = new Student[1];
            this.students[0] = data;
        } else {
            Student[] newStudents = new Student[this.students.length + 1];
            for (int i = 0; i < this.students.length; i++) {
                newStudents[i] = this.students[i];
            }
            newStudents[this.students.length] = data;
            this.students = newStudents;
        }
    }

    public void input() {
        if (this.id == null) {
            this.setId(Room.inputIdRoom());
        }

        this.setName(Util.inputString("Nhap name", false));

    }

    public void inputUpdate() {
        String name = Util.inputString("Nhap name", true);
        if (!name.isBlank()) {
            this.setName(name);
        }
    }

    public Room(String id, String name) {
        this.setId(id);
        this.setName(name);
    }

    public Room() {
    }

    public void outputRoom() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", name='" + getName() + "'" +
                ", students=" + getStudents() +
                "}";
    }

}
