package gui;

import file.MemberReportGenerator;

import javax.swing.*;

public class ReportPanel extends JPanel {

    public ReportPanel() {

        JButton button =
                new JButton(
                        "Export Members Report"
                );

        add(button);

        button.addActionListener(e -> {

            MemberReportGenerator.exportMembers();

            JOptionPane.showMessageDialog(
                    this,
                    "MembersReport.txt Generated!"
            );

        });

    }

}