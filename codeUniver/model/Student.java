package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import universitymanagement.UException;
import universitymanagement.Util;

/**
 * Student.
 *
 * @author hasu
 */
public class Student {

    private String id;
    private String name;
    private final Map<Semester, List<Learned>> subjectLearnedMap;

    public Student() {
        this.subjectLearnedMap = new HashMap();
    }

    public Student(String id, String name) throws UException {
        this.subjectLearnedMap = new HashMap();
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

    public Float getAvgScore() {
        float totalScore = 0F;
        int countSubject = 0;
        for (List<Learned> learnedSubjectList : this.subjectLearnedMap.values()) {
            countSubject += learnedSubjectList.size();
            for (Learned learned : learnedSubjectList) {
                totalScore += learned.getScore();
            }
        }
        return countSubject != 0 ? totalScore / countSubject : Float.NaN;
    }

    public Map<Semester, List<Learned>> getSubjectLearnedMap() {
        return subjectLearnedMap;
    }

    public void input() {
        // input id
        do {
            try {
                setId(Util.inputString("Input student's id", false));
            } catch (UException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        } while (this.id == null);
        // input name
        do {
            try {
                setName(Util.inputString("Input student's name", false));
            } catch (UException ex) {
                System.out.println("Error: " + ex.getMessage());
            }

        } while (this.name == null);

    }

    public void update() {
        // update name
        String newName = Util.inputString("Input group's name", true);
        if (!newName.isBlank()) {
            try {
                setName(name);
            } catch (UException ex) {
                System.out.println("error: " + ex.getMessage());
            }
        }

        // update scores
        Semester semester;
        do {
            semester = Semester.input(true);
            if (semester != null) {
                List<Learned> learnedSubjectList = this.subjectLearnedMap.get(semester);
                if (learnedSubjectList != null) {
                    for (Learned learned : learnedSubjectList) {
                        learned.update();
                    }
                }
            }
        } while (semester != null);
    }

    public void output() {
        System.out.println(this);
    }

    public void registerSubject(Subject subject, Semester semester) throws UException {
        addLearnedSubject(subject, semester);
    }

    public boolean doExam(Semester semester, Subject subject, float score) throws UException {
        if (semester == null || subject == null || score < Util.MIN_SCORE || Util.MAX_SCORE < score) {
            throw new UException("Invalid examed");
        }
        List<Learned> learnedSubjectList = this.subjectLearnedMap.get(semester);
        if (learnedSubjectList != null) {
            for (Learned learned : learnedSubjectList) {
                {
                    if (subject.equals(learned.getSubject())) {
                        learned.setScore(score);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean addLearnedSubject(Subject subject, Semester semester) throws UException {
        if (subject != null && semester != null) {
            List<Learned> learnedSubjectList = this.subjectLearnedMap.get(semester);
            if (learnedSubjectList == null) {
                learnedSubjectList = new ArrayList();
                this.subjectLearnedMap.put(semester, learnedSubjectList);
            }

            for (Learned learned : learnedSubjectList) {
                if (subject.equals(learned.getSubject())) {
                    return false;
                }
            }
            return learnedSubjectList.add(new Learned(subject, null));
        }
        return false;
    }

    public boolean isLearnedSubject(Semester semester, Subject subject) throws UException {
        if (semester == null || subject == null) {
            throw new UException("Invalid semester or subject!");
        }
        List<Learned> learnedList = this.subjectLearnedMap.get(semester);
        return learnedList != null ? learnedList.contains(subject) : false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", avgScore=").append(getAvgScore());
        sb.append('}');
        return sb.toString();
    }

}
