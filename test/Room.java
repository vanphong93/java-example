package test;

public class Room  {
    public static final String ID_FORMAT = "lp\\d{3}";
    private String id;
    private String name;


    public static String getIDFormat() {
        return Room.ID_FORMAT;
    }

    public static String inputIdRoom() {
        String id = null;
        do {
            id = Util.inputString("Enter ma lop hoc", false);
        } while (!Room.isValidId(id));
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

    public void setName(String name) {
        if (name != null && !name.isBlank()) {
            this.name = name;
        }

    }

    public void input() {
        if (this.id == null) {
            this.setId(Room.inputIdRoom());
        }

        this.setName(Util.inputString("enter name", false));

    }

    public void inputUpdate() {
        String name = Util.inputString("enter name", true);
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
            "}";
    }



}
