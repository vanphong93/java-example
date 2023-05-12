package menu;

import universitymanagement.Util;

/**
 * Menu.
 *
 * @author hasu
 */
public class Menu {

    private MenuItem mainOptions[] = {
        MenuItem.EXIT,
        MenuItem.GROUP,
        MenuItem.SUBJECT,
        MenuItem.STUDENT
    };

    private MenuItem groupOptions[] = {
        MenuItem.BACK,
        MenuItem.GROUP_INPUT,
        MenuItem.GROUP_OUTPUT,
        MenuItem.GROUP_UPDATE,
        MenuItem.GROUP_ASSIGN_STUDENT
    };

    private MenuItem subjectOptions[] = {
        MenuItem.BACK,
        MenuItem.SUBJECT_INPUT,
        MenuItem.SUBJECT_OUTPUT,
        MenuItem.SUBJECT_UPDATE
    };

    private MenuItem studentOptions[] = {
        MenuItem.BACK,
        MenuItem.STUDENT_INPUT,
        MenuItem.STUDENT_OUTPUT,
        MenuItem.STUDENT_UPDATE,
        MenuItem.STUDENT_REGISTER_SUBJECT,
        MenuItem.STUDENT_DO_EXAM,
        MenuItem.STUDENT_FILTER_BY_SUBJECT
    };

    private MenuItem mainOption;
    private MenuItem subOption;

    public Menu() {
        this.mainOption = MenuItem.EXIT;
        this.subOption = MenuItem.BACK;
    }

    public MenuItem getUserChoice() {
        if (this.subOption == MenuItem.BACK) {
            this.mainOption = getChoice(MenuItem.MAIN);
        }
        if (this.mainOption != MenuItem.EXIT) {
            this.subOption = getChoice(this.mainOption);
        }
        return this.mainOption != MenuItem.EXIT ? this.subOption : MenuItem.EXIT;
    }

    private MenuItem getChoice(MenuItem menuItem) {
        MenuItem menuOptions[] = getMenuOption(menuItem);
        int numOption = showMenu(menuOptions);
        int idx;
        do {
            idx = Util.inputInteger("Input an integer (0 -> " + (numOption - 1) + ")", false);
        } while (idx < 0 || numOption <= idx);
        return menuOptions[idx];
    }

    private int showMenu(MenuItem menuOptions[]) {
        for (int i = 1; i < menuOptions.length; i++) {
            System.out.println(i + "\t->\t" + menuOptions[i].getLable());
        }
        System.out.println("0\t->\t" + menuOptions[0].getLable());
        return menuOptions.length;
    }

    private MenuItem[] getMenuOption(MenuItem menuItem) {
        MenuItem[] menuOptions;
        switch (menuItem) {
            case GROUP:
                menuOptions = groupOptions;
                break;
            case SUBJECT:
                menuOptions = subjectOptions;
                break;
            case STUDENT:
                menuOptions = studentOptions;
                break;
            default:
                menuOptions = mainOptions;
        }
        return menuOptions;
    }
}
