package service;

import java.util.ArrayList;
import java.util.List;
import model.Semester;
import model.Student;
import model.Subject;
import universitymanagement.UException;
import universitymanagement.Util;

/**
 * StudentService.
 *
 * @author hasu
 */
public class StudentService {

    private final List<Student> studentList;

    public StudentService() {
        this.studentList = new ArrayList();
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public Student getStudentById(String id) {
        if (id != null && !id.isBlank()) {
            for (Student student : studentList) {
                if (id.equalsIgnoreCase(student.getId())) {
                    return student;
                }
            }
        }
        return null;
    }

    public Student inputNewStudent() {
        String id = Util.inputString("Input student's id", false);
        Student student = getStudentById(id);
        if (student == null) {
            try {
                student = new Student();
                student.setId(id);
                student.input();
                this.studentList.add(student);
            } catch (UException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        } else {
            System.out.println("Student is exists");
        }
        return student;
    }

    public void inputUpdateStudent() {

    }

    public void output() {
        for (Student student : studentList) {
            student.output();
        }
    }

    public void registerSubject(Subject subject) {
        if (subject != null) {
            
        }
    }

    public void doExam(Semester semester, Subject subject) {
        if (subject != null) {
            List<Student> learnStudent = filterStudentBySubject(semester, subject);
            float score;
            String message;
            System.out.println("Semester: " + semester + " do exam for " + subject.getName());
            for (Student student : learnStudent) {
                try {
                    message = "Input " + student.getName() + "'s score";
                    score = Util.inputFloat(message, false);
                    student.doExam(semester, subject, score);
                } catch (UException ex) {
                    System.out.println("Error: " + ex.getMessage());
                }
            }
        }
    }

    public List<Student> filterStudentBySubject(Semester semester, Subject subject) {
        List<Student> filterList = new ArrayList();
        for (Student student : studentList) {
            try {
                if (student.isLearnedSubject(semester, subject)) {
                    filterList.add(student);
                }
            } catch (UException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
        return filterList;
    }

    public List<Student> filterStudentByAverageScoreInRange(Semester semester, float minScore, float maxScore) {
        return null;
    }
}
