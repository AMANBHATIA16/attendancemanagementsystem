package ui;

import javax.swing.*;

public class MainMenu extends JFrame {

    public MainMenu() {
        setTitle("Attendance Management System - GUI");
        setSize(400, 400);
        setLayout(null);

        JButton addStd = new JButton("Add Student");
        JButton viewStd = new JButton("View Students");
        JButton markAtt = new JButton("Mark Attendance");
        JButton viewAtt = new JButton("View Attendance");

        addStd.setBounds(100, 50, 200, 40);
        viewStd.setBounds(100, 110, 200, 40);
        markAtt.setBounds(100, 170, 200, 40);
        viewAtt.setBounds(100, 230, 200, 40);

        add(addStd);
        add(viewStd);
        add(markAtt);
        add(viewAtt);

        addStd.addActionListener(e -> new AddStudentForm());
        viewStd.addActionListener(e -> new ViewStudentsForm());
        markAtt.addActionListener(e -> new MarkAttendanceForm());
        viewAtt.addActionListener(e -> new ViewAttendanceForm());

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}

