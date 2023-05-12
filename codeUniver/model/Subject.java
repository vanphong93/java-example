package model;

import universitymanagement.UException;

/**
 * Subject.
 *
 * @author hasu
 */
public class Subject {

    private String id;
    private String name;

    public Subject() {
    }

    public Subject(String id, String name) throws UException {
        this.setId(id);
        this.setName(name);
    }

    public String getId() {
        return id;
    }

    public final void setId(String id) throws UException {
        if (id == null || id.isBlank()) {
            throw new UException("id is null or empty");
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public final void setName(String name) throws UException {
        if (name == null || name.isBlank()) {
            throw new UException("name is null or empty");
        }
        this.name = name;
    }

    public void input() {

    }

    public void output() {

    }

    public void update() {

    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Subject) {
            return this.id.equalsIgnoreCase(((Subject)obj).id);
        }
        return super.equals(obj);
    }
}
