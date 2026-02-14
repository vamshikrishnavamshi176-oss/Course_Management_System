package Container;

import javax.swing.*;
import java.util.*;

public class Student extends User {

    private List<Course> registeredCourses = new ArrayList<>();

    public Student(String username) {
        super(username);
    }

    public void applyCourse(Course course) {
        registeredCourses.add(course);
        JOptionPane.showMessageDialog(null, "Applied Successfully!");
    }

    public void viewRegisteredCourses() {
        JOptionPane.showMessageDialog(null, registeredCourses.toString());
    }

    @Override
    public void showMenu() {

        String[] options = {
                "View All Courses",
                "Apply Course",
                "View Registered Courses",
                "Pay Fees"
        };

        int choice = JOptionPane.showOptionDialog(null,
                "Welcome " + username,
                "Student Menu",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                options,
                options[0]);

        switch(choice) {
            case 0:
                JOptionPane.showMessageDialog(null,
                        CourseService.getCourses().toString());
                break;

            case 1:
                String name = JOptionPane.showInputDialog("Enter Course Name:");
                Course c = CourseService.findCourse(name);
                if(c != null)
                    applyCourse(c);
                else
                    JOptionPane.showMessageDialog(null,"Course Not Found!");
                break;

            case 2:
                viewRegisteredCourses();
                break;

            case 3:
                JOptionPane.showMessageDialog(null,"Payment Successful!");
                break;
        }
    }
}

