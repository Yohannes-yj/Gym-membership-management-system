package gui;

import database.MemberDAO;
import javax.swing.*;
import java.awt.*;

public class DeleteMemberPanel extends JPanel {

    public DeleteMemberPanel() {

        setLayout(new GridLayout(2,2));

        JLabel idLabel = new JLabel("Member ID");

        JTextField idField = new JTextField();

        JButton deleteButton = new JButton("Delete");

        add(idLabel);

        add(idField);

        add(deleteButton);

        deleteButton.addActionListener(e -> {

            try {

                int id = Integer.parseInt(
                        idField.getText()
                );

                MemberDAO dao = new MemberDAO();

                dao.deleteMember(id);

                JOptionPane.showMessageDialog(
                        this,
                        "Member deleted successfully!"
                );

            }

            catch(Exception ex) {

                ex.printStackTrace();

            }

        });

    }

}