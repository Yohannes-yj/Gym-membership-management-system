package gui;

import javax.swing.*;

public class MainFrame extends JFrame {

    public MainFrame() {

        setTitle("FitTrack Gym Management System");
        setSize(700,500);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);

        JTabbedPane tabs = new JTabbedPane();

        tabs.add("Register Member", new RegisterMemberPanel());
        tabs.add("Attendance", new AttendancePanel());
        tabs.add("Payment", new PaymentPanel());
        tabs.add("View Members", new ViewMembersPanel());

        add(tabs);

        setVisible(true);
    }
}