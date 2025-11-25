package ui;

import service.AttendanceService;
import javax.swing.*;

public class AddStudentForm extends JFrame {

    AttendanceService service = new AttendanceService();

    public AddStudentForm() {
        setTitle("Add Student");
        setSize(350, 250);
        setLayout(null);

        JLabel lbl1 = new JLabel("Name:");
        JLabel lbl2 = new JLabel("Course:");
        JTextField nameField = new JTextField();
        JTextField courseField = new JTextField();
        JButton addBtn = new JButton("Add");

        lbl1.setBounds(30, 40, 100, 30);
        nameField.setBounds(140, 40, 150, 30);
        lbl2.setBounds(30, 90, 100, 30);
        courseField.setBounds(140, 90, 150, 30);
        addBtn.setBounds(100, 150, 120, 35);

        add(lbl1); add(nameField);
        add(lbl2); add(courseField);
        add(addBtn);

        addBtn.addActionListener(e -> {
            service.addStudent(nameField.getText(), courseField.getText());
            JOptionPane.showMessageDialog(this, "Student Added!");
        });

        setVisible(true);
    }
}

