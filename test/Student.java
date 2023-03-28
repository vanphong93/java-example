package test;

/**
 * Student
 */
public class Student {

    public static final String ID_FORMAT = "SV\\d{3}";

    private String id;
    private String name;
    private Float averageScore;
    private SubRegister[] subRegisters;

    public static String getIDFormat() {
        return Student.ID_FORMAT;
    }

    public static String inputIdStudent() {
        String id = null;
        do {
            id = Util.inputString("Nhap ma sinh vien", false);
        } while (!Student.isValidId(id));
        return id;
    }

    public static String inputIdSub() {
        String id = null;
        id = Util.inputString("Nhap ma mon hoc", false);
        return id;
    }

    private static boolean isValidId(String id) {
        return Util.validateStringPattern(id, Student.ID_FORMAT, true);
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        if (Student.isValidId(id)) {
            this.id = id.toLowerCase();
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name != null && !name.isBlank()) {
            this.name = name;
        }

    }

    public void setSubject(SubRegister[] subRegisters) {
        this.subRegisters = subRegisters;
    }

    public void addSubRegister(SubRegister data) {
        if (this.subRegisters == null) {
            this.subRegisters = new SubRegister[1];
            this.subRegisters[0] = data;
        } else {
            SubRegister[] newSubRegisters = new SubRegister[this.subRegisters.length + 1];
            System.arraycopy(this.subRegisters, 0, newSubRegisters, 0, this.subRegisters.length);
            newSubRegisters[this.subRegisters.length] = data;
            this.subRegisters = newSubRegisters;
        }

    }

    public String getSubRegisters() {
        String str = "";
        if (this.subRegisters != null) {
            for (SubRegister subRegister : this.subRegisters) {
                str += subRegister.toString();
            }
        }
        return str;

    }

    public void scoreSubUpdate(String idSub, Float score) {
        if (this.subRegisters != null) {
            for (SubRegister subRegister : this.subRegisters) {
                if (subRegister.getId().equals(idSub)) {
                    subRegister.setScore(score);
                }
            }
        }
    }

    public Float getAverageScore() {
        return this.averageScore;
    }

    public void setAverageScore(Float averageScore) {
        if (averageScore > 0 && averageScore <= 10) {
            this.averageScore = averageScore;
        }
    }

    public void input() {
        if (this.id == null) {
            this.setId(Student.inputIdStudent());
        }
        this.setAverageScore(Util.inputFloat("Nhap score", 0F, 10F));
        this.setName(Util.inputString("Nhap name", false));

    }

    public void inputUpdate() {
        String name = Util.inputString("Nhap name", true);
        if (!name.isBlank()) {
            this.setName(name);
        }
        Float averageScore = Util.inputFloat("Nhap score", 0F, 10F, true);
        if (averageScore != null) {
            this.setAverageScore(averageScore);
        }
    }

    public Student() {
        this.averageScore = Float.NEGATIVE_INFINITY;
    }

    public Student(String id, String name, float averageScore) {
        this.setAverageScore(averageScore);
        this.setId(id);
        this.setName(name);
    }

    public void outputStudent() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", name='" + getName() + "'" +
                ", averageScore='" + getAverageScore() + "'" +
                ", subRegisters=" + getSubRegisters() +
                "}";
    }

}