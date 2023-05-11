package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

    public void addSubRegister(String id, SubRegister item) {
        Student st = getStudentById(id);
        if (st != null) {
            st.addSubRegister(item);
        }
    }

    public void scoreSubUpdate(String idStu, String idSub, Float score) {
        if (getStudentById(idStu) != null) {
            Student st = getStudentById(idStu);
            st.scoreSubUpdate(idSub, score);
        }

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
        System.out.println("-----Ket Qua-----");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("----------------------------------------------------------------");
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

    private class CompareStudentByNameThenScore implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            int cmp = o1.getAverageScore().compareTo(o2.getAverageScore());
            return cmp;
        }

    }

    public void sortByScore() {
        System.out.println("-----Ket Qua-----");
        Collections.sort(this.students, new CompareStudentByNameThenScore());
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("----------------------------------------------------------------");
    }
}
