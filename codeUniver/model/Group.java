package model;

import java.util.ArrayList;
import java.util.List;
import universitymanagement.UException;
import universitymanagement.Util;

/**
 * Group.
 *
 * @author hasu
 */
public class Group {

    private String id;
    private String name;
    private final List<Student> studentList;

    public Group() {
        this.studentList = new ArrayList();
    }

    public Group(String id, String name) throws UException {
        this.studentList = new ArrayList();
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

    public List<Student> getStudentList() {
        return studentList;
    }

    public void input() {
        while (this.id == null) {
            try {
                setId(Util.inputString("Input group's id", false));
            } catch (UException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
        do {
            try {
                setName(Util.inputString("Input group's name", false));
            } catch (UException ex) {
                System.out.println("Error: " + ex.getMessage());
            }

        } while (this.name == null);

    }

    public void inpoutUpdate() {
        String newName = Util.inputString("Input group's name", true);
        if (!newName.isBlank()) {
            try {
                setName(name);
            } catch (UException ex) {
                System.out.println("error: " + ex.getMessage());
            }
        }
    }

    public void output() {
        System.out.println(this);
    }

    public boolean assignStudent(Student student) {
        return addStudent(student);
    }

    public boolean addStudent(Student student) {
        if (student != null && getStudentById(student.getId()) == null) {
            return this.studentList.add(student);
        }
        return false;
    }
    
    public boolean removeStudent(Student student) {
        if (student != null) {
            return this.studentList.remove(student);
        }
        return false;
    }

    private Student getStudentById(String studentId) {
        if (studentId != null && !studentId.isBlank()) {
            for (Student student : this.studentList) {
                if (studentId.equalsIgnoreCase(student.getId())) {
                    return student;
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Group{" + "id=" + id + ", name=" + name + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Group) {
            return this.id.equalsIgnoreCase(((Group) obj).id);
        }
        return super.equals(obj);
    }

}
