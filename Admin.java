package Container;

import javax.swing.*;

public class Admin extends User {

    public Admin(String username) {
        super(username);
    }

    public void addCourse(String name) {
        CourseService.addCourse(new Course(name));
        JOptionPane.showMessageDialog(null,"Course Added!");
    }

    public void removeCourse(String name) {
        CourseService.removeCourse(name);
        JOptionPane.showMessageDialog(null,"Course Removed!");
    }

    @Override
    public void showMenu() {

        String[] options = {
                "Add Course",
                "Remove Course",
                "View Courses"
        };

        int choice = JOptionPane.showOptionDialog(null,
                "Admin Panel",
                "Admin",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                options,
                options[0]);

        switch(choice) {
            case 0:
                String add = JOptionPane.showInputDialog("Enter Course Name:");
                addCourse(add);
                break;

            case 1:
                String remove = JOptionPane.showInputDialog("Enter Course Name:");
                removeCourse(remove);
                break;

            case 2:
                JOptionPane.showMessageDialog(null,
                        CourseService.getCourses().toString());
                break;
        }
    }
}

