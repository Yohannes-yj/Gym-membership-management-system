package gui;

import database.MemberDAO;
import exception.InvalidMembershipException;
import model.Member;
import service.MemberService;

import javax.swing.*;
import java.awt.*;

public class RegisterMemberPanel extends JPanel {

    private JTextField idField;
    private JTextField nameField;
    private JTextField ageField;
    private JTextField phoneField;
    private JTextField typeField;

    public RegisterMemberPanel() {

        setLayout(new GridLayout(6,2));

        add(new JLabel("ID"));
        idField = new JTextField();
        add(idField);

        add(new JLabel("Name"));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("Age"));
        ageField = new JTextField();
        add(ageField);

        add(new JLabel("Phone"));
        phoneField = new JTextField();
        add(phoneField);

        add(new JLabel("Membership Type"));
        typeField = new JTextField();
        add(typeField);

        JButton registerButton = new JButton("Register");
        add(registerButton);

        registerButton.addActionListener(e -> registerMember());
    }

    private void registerMember() {

        try {

            int id = Integer.parseInt(idField.getText());

            String name = nameField.getText();

            int age = Integer.parseInt(ageField.getText());

            String phone = phoneField.getText();

            String type = typeField.getText();

            Member member =
                    new Member(
                            id,
                            name,
                            age,
                            phone,
                            type
                    );

            MemberService service = new MemberService();

            service.registerMember(member);

            MemberDAO dao = new MemberDAO();

            dao.addMember(member);

            JOptionPane.showMessageDialog(
                    this,
                    "Member Registered Successfully!"
            );

        }
        catch (InvalidMembershipException ex) {

            JOptionPane.showMessageDialog(
                    this,
                    ex.getMessage()
            );
        }
        catch (Exception ex) {

            JOptionPane.showMessageDialog(
                    this,
                    ex.getMessage()
            );
        }
    }
}