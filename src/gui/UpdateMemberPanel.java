package gui;

import database.MemberDAO;
import javax.swing.*;
import java.awt.*;

public class UpdateMemberPanel extends JPanel {

    public UpdateMemberPanel() {

        setLayout(new GridLayout(3,2));

        JLabel idLabel = new JLabel("Member ID");
        JTextField idField = new JTextField();

        JLabel phoneLabel = new JLabel("New Phone");
        JTextField phoneField = new JTextField();

        JButton updateButton = new JButton("Update");

        add(idLabel);
        add(idField);

        add(phoneLabel);
        add(phoneField);

        add(updateButton);

        updateButton.addActionListener(e -> {

            try {

                int id = Integer.parseInt(idField.getText());

                String phone = phoneField.getText();

                MemberDAO dao = new MemberDAO();

                dao.updatePhone(id, phone);

                JOptionPane.showMessageDialog(
                        this,
                        "Phone updated successfully!"
                );

            }

            catch (Exception ex) {

                ex.printStackTrace();

            }

        });

    }

}