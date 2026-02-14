package Container;

import javax.swing.*;
import java.awt.*;

public class CourseManagementSystem {

    public static void main(String[] args) {

        CourseService.addCourse(new Course("Java"));
        CourseService.addCourse(new Course("Python"));
        CourseService.addCourse(new Course("Machine Learning"));

        JFrame frame = new JFrame("Course Management System");
        frame.setSize(500,400);
        frame.setLayout(new GridLayout(4,1));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().setBackground(new Color(25,25,112));

        JLabel title = new JLabel("NSL GlobalQuest Technologies",JLabel.CENTER);
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Arial",Font.BOLD,20));

        JButton studentBtn = new JButton("Student Login");
        JButton professorBtn = new JButton("Professor Login");
        JButton adminBtn = new JButton("Admin Login");

        studentBtn.setBackground(new Color(60,179,113));
        professorBtn.setBackground(new Color(255,140,0));
        adminBtn.setBackground(new Color(220,20,60));

        frame.add(title);
        frame.add(studentBtn);
        frame.add(professorBtn);
        frame.add(adminBtn);

        frame.setVisible(true);

        studentBtn.addActionListener(e -> {
            String name = JOptionPane.showInputDialog("Enter Username:");
            Student s = new Student(name);
            s.showMenu();
        });

        professorBtn.addActionListener(e -> {
            String name = JOptionPane.showInputDialog("Enter Name:");
            String exp = JOptionPane.showInputDialog("Enter Expertise:");
            Professor p = new Professor(name,exp);
            p.showMenu();
        });

        adminBtn.addActionListener(e -> {
            String pass = JOptionPane.showInputDialog("Enter Password:");
            if(pass.equals("admin123")) {
                Admin a = new Admin("Admin");
                a.showMenu();
            } else {
                JOptionPane.showMessageDialog(null,"Wrong Password!");
            }
        });
    }
}

