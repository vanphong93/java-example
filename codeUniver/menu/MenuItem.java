package menu;

/**
 * MenuItem.
 *
 * @author hasu
 */
public enum MenuItem {
    MAIN("University"),
    EXIT("Exit"),
    BACK("Back"),
    GROUP("Group"),
    GROUP_INPUT("Input group"),
    GROUP_OUTPUT("Output group"),
    GROUP_UPDATE("Update group"),
    GROUP_ASSIGN_STUDENT("Assign student into group"),
    SUBJECT("Subject"),
    SUBJECT_INPUT("Input subject"),
    SUBJECT_OUTPUT("Output subject"),
    SUBJECT_UPDATE("Update subject"),
    STUDENT("Student"),
    STUDENT_INPUT("Input student"),
    STUDENT_OUTPUT("Output student"),
    STUDENT_UPDATE("Update student"),
    STUDENT_REGISTER_SUBJECT("Student register subject"),
    STUDENT_DO_EXAM("Student do exam"),
    STUDENT_FILTER_BY_SUBJECT("Filter student by subject");
    
    private final String lable;

    private MenuItem(String lable) {
        this.lable = lable;
    }

    public final String getLable() {
        return lable;
    }
}
