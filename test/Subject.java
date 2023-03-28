package test;

public class Subject {
    public static final String ID_FORMAT = "MH\\d{3}";

    private String id;
    private String name;

    public static String getIDFormat() {
        return Subject.ID_FORMAT;
    }

    public static String inputIdSub() {
        String id = null;
        do {
            id = Util.inputString("Nhap ma mon hoc (mhXXX)", false);
        } while (!Subject.isValidId(id));
        return id;
    }

    private static boolean isValidId(String id) {
        return Util.validateStringPattern(id, Subject.ID_FORMAT, true);
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        if (Subject.isValidId(id)) {
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

    public void input() {
        if (this.id == null) {
            this.setId(Subject.inputIdSub());
        }
        this.setName(Util.inputString("Nhap name", false));

    }

    public void inputUpdate() {
        String name = Util.inputString("Nhap name", true);
        if (!name.isBlank()) {
            this.setName(name);
        }

    }

    public Subject() {
    }

    public Subject(String id, String name) {
        this.setId(id);
        this.setName(name);
    }

    public void outputSubject() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", name='" + getName() + "'" +
                "}";
    }

}
