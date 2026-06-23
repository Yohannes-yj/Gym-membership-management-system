package gui;

import java.awt.*;
import javax.swing.*;

public class MainFrame extends JFrame {

    public MainFrame() {

        setTitle("FITTRACK GYM MANAGEMENT SYSTEM");

        setSize(1100,700);

        setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);

        JTabbedPane tabs =
                new JTabbedPane();

        tabs.setBackground(
                Color.BLACK);

        tabs.setForeground(
                Color.CYAN);

        tabs.addTab(
                "Dashboard",
                new DashboardPanel());

        tabs.addTab(
                "Register Member",
                new RegisterMemberPanel());

        tabs.addTab(
                "View Members",
                new ViewMembersPanel());

        tabs.addTab(
                "Attendance",
                new AttendancePanel());

        tabs.addTab(
                "Payment",
                new PaymentPanel());

        tabs.addTab(
                "Reports",
                new ReportPanel());

        add(tabs);

        setVisible(true);

    }

}