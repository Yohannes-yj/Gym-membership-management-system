package gui;

import service.AttendanceService;

import javax.swing.*;
import java.awt.*;

public class AttendancePanel extends JPanel {

    private AttendanceService service;

    public AttendancePanel() {

        service = new AttendanceService();

        setLayout(new GridLayout(3,2));

        JTextField memberField = new JTextField();

        JTextField dateField = new JTextField();

        JButton button =
                new JButton("Record Attendance");

        add(new JLabel("Member ID"));
        add(memberField);

        add(new JLabel("Date"));
        add(dateField);

        add(button);

        button.addActionListener(e -> {

            service.checkIn(
                    Integer.parseInt(memberField.getText()),
                    dateField.getText()
            );

            JOptionPane.showMessageDialog(
                    this,
                    "Attendance Recorded!"
            );

        });

    }
}