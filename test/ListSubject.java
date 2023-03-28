package test;

import java.util.ArrayList;
import java.util.List;

public class ListSubject {
    private List<Subject> Subjects;

    public ListSubject() {
        this.Subjects = new ArrayList();
    }

    public List<Subject> getSubjects() {
        return Subjects;
    }

    public Subject inputSubject() {
        String id = Subject.inputIdSub();
        Subject sb = getSubjectById(id);
        if (sb == null) {
            sb = new Subject();
            sb.setId(id);
            sb.input();
            this.Subjects.add(sb);
        } else {
            Util.decoExit();
            System.out.println("Ma mon hoc da su dung");
        }
        return sb;

    }

    public Subject updateSubject(String id) {
        Subject st = getSubjectById(id);
        if (st != null) {
            st.inputUpdate();
        }
        return st;
    }

    public void outputSubject() {
        for (Subject Subject : Subjects) {
            System.out.println(Subject);
        }
Util.decoExit();
    }

    public Subject getSubjectById(String id) {
        for (Subject Subject : Subjects) {
            if (Subject.getId().equals(id)) {
                return Subject;
            }
        }
        return null;
    }

    public void delSubById(Subject item) {
        Subjects.remove(item);
    }

}
