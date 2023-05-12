package service;

import java.util.ArrayList;
import java.util.List;
import model.Group;
import model.Student;
import universitymanagement.UException;
import universitymanagement.Util;

/**
 * GroupService.
 *
 * @author hasu
 */
public class GroupService {

    private final List<Group> groupList;

    public GroupService() {
        this.groupList = new ArrayList();
    }

    public List<Group> getGroupList() {
        return groupList;
    }

    public Group getGroupById(String id) {
        if (id != null && !id.isBlank()) {
            for (Group group : groupList) {
                if (id.equalsIgnoreCase(group.getId())) {
                    return group;
                }
            }
        }
        return null;
    }

    public Group inputNewGroup() {
        String id = Util.inputString("Input group's id", false);
        Group group = getGroupById(id);
        if (group == null) {
            try {
                group = new Group();
                group.setId(id);
                group.input();
                this.groupList.add(group);
            } catch (UException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        } else {
            System.out.println(id + " da ton tai");
        }
        return group;
    }

    public void inputUpdateGroup() {

    }

    public void output() {
        for (Group group : groupList) {
            group.output();
        }
    }

    public void assignStudent(Student student) {
        if (student != null) {
            String groupId = Util.inputString("Input group's id", false);
            Group group = getGroupById(groupId);
            if (group != null) {
                group.assignStudent(student);
            }
        }
    }
}
