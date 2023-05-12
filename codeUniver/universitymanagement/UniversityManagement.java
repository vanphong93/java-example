package universitymanagement;

import java.util.List;
import menu.Menu;
import menu.MenuItem;
import model.Semester;
import model.Student;
import model.Subject;
import service.GroupService;
import service.StudentService;
import service.SubjectService;

/**
 * UniversityManagement.
 *
 * @author hasu
 */
public class UniversityManagement {

    private final GroupService groupService;
    private final SubjectService subjectService;
    private final StudentService studentService;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new UniversityManagement().process();
    }

    public UniversityManagement() {
        this.groupService = new GroupService();
        this.subjectService = new SubjectService();
        this.studentService = new StudentService();
    }

    private void process() {
        Menu menu = new Menu();
        MenuItem userChoice;
        do {
            userChoice = menu.getUserChoice();
            switch (userChoice) {
                // Group
                case GROUP_INPUT:
                    inputGroup();
                    break;
                case GROUP_OUTPUT:
                    outputGroup();
                    break;
                case GROUP_ASSIGN_STUDENT:
                    assignStudentToGroup();
                    break;

                // Student
                case STUDENT_INPUT:
                    inputStudent();
                    break;
                case STUDENT_UPDATE:
                    updateStudent();
                    break;
                case STUDENT_OUTPUT:
                    outputStudent();
                    break;
                case STUDENT_REGISTER_SUBJECT:
                    studentRegisterSubject();
                    break;
                case STUDENT_FILTER_BY_SUBJECT:
                    filterStudentBySubject();
                    break;
                default:
                    throw new AssertionError();
            }

        } while (userChoice != MenuItem.EXIT);
    }

    private void inputGroup() {
        this.groupService.inputNewGroup();
    }

    private void outputGroup() {
        this.groupService.output();
    }

    private void assignStudentToGroup() {
        String studentId = Util.inputString("Input student's id", false);
        Student student = this.studentService.getStudentById(studentId);
        this.groupService.assignStudent(student);
    }

    private void inputStudent() {
        this.studentService.inputNewStudent();
    }

    private void updateStudent() {
        this.studentService.inputUpdateStudent();
    }

    private void outputStudent() {
        this.studentService.output();
    }

    private void studentRegisterSubject() {
        String subjectId = Util.inputString("Input subject's id", false);
        Subject subject = this.subjectService.getSubjectById(subjectId);
        this.studentService.registerSubject(subject);
    }

    private void filterStudentBySubject() {
        Semester semester = Semester.input(false);
        String subjectId = Util.inputString("Input subject's id", false);
        Subject subject = this.subjectService.getSubjectById(subjectId);
        List<Student> filterList = this.studentService.filterStudentBySubject(semester, subject);
        for (Student student : filterList) {
            student.output();
        }
    }
}
