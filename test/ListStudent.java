package test;

import java.util.ArrayList;
import java.util.List;

public class ListStudent {
    private List<Student> students;

    public ListStudent() {
        this.students = new ArrayList();
    }

    public List<Student> getStudents() {
        return students;
    }

    public Student inputStudent() {
        String id = Student.inputIdStudent();
        Student st = getStudentById(id);
        if (st == null) {
            st = new Student();
            st.setId(id);
            st.input();
            this.students.add(st);
        }
        return st;

    }

    public Student updateStudent(String id) {
        // String id = Student.inputIdStudent();
        Student st = getStudentById(id);
        if (st != null) {
            st.inputUpdate();
        }
        return st;
    }

    public void outputStudent() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public Student getStudentById(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    public void deleteStuById(Student item) {
        students.remove(item);
    }
}
