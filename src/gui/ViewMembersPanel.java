package gui;

import javax.swing.*;

public class ViewMembersPanel extends JPanel {

    public ViewMembersPanel() {

        JTextArea area =
                new JTextArea();

        add(new JScrollPane(area));
    }
}
