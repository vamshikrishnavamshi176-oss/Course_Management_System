package Container;

import javax.swing.*;

public class Professor extends User {

    private String expertise;

    public Professor(String username, String expertise) {
        super(username);
        this.expertise = expertise;
    }

    @Override
    public void showMenu() {

        StringBuilder details = new StringBuilder();
        details.append("Professor Name: ").append(username).append("\n");
        details.append("Expertise: ").append(expertise).append("\n");
        details.append("Available Courses: ")
                .append(CourseService.getCourses());

        JTextArea area = new JTextArea(details.toString());
        area.setEditable(false);

        JOptionPane.showMessageDialog(null, area);
    }
}

