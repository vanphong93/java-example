package service;

import java.util.ArrayList;
import java.util.List;
import model.Subject;
import universitymanagement.UException;
import universitymanagement.Util;

/**
 * SubjectService.
 *
 * @author hasu
 */
public class SubjectService {

    private final List<Subject> subjectList;

    public SubjectService() {
        this.subjectList = new ArrayList();
    }

    public List<Subject> getStudentList() {
        return subjectList;
    }

    public Subject getSubjectById(String id) {
        if (id != null && !id.isBlank()) {
            for (Subject subject : subjectList) {
                if (id.equalsIgnoreCase(subject.getId())) {
                    return subject;
                }
            }
        }
        return null;
    }

    public Subject inputNewSubject() {
        String id = Util.inputString("Input subject's id", false);
        Subject subject = getSubjectById(id);
        if (subject == null) {
            try {
                subject = new Subject();
                subject.setId(id);
                subject.input();
                this.subjectList.add(subject);
            } catch (UException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        } else {
            System.out.println("Subject is exists");
        }
        return subject;
    }

    public void inputUpdateSubject() {

    }

    public void output() {
        for (Subject subject : subjectList) {
            subject.output();
        }
    }
}
