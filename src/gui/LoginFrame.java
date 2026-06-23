package gui;

import java.awt.*;
import javax.swing.*;

public class LoginFrame extends JFrame {

    public LoginFrame() {

        setTitle("Login");

        setSize(300,200);

        setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(3,2));

        JTextField usernameField =
                new JTextField();

        JPasswordField passwordField =
                new JPasswordField();

        JButton loginButton =
                new JButton("Login");

        add(new JLabel("Username"));
        add(usernameField);

        add(new JLabel("Password"));
        add(passwordField);

        add(loginButton);

        loginButton.addActionListener(e -> {

            String username =
                    usernameField.getText();

            String password =
                    new String(
                            passwordField.getPassword());

            if(username.equals("admin")
                    &&
                    password.equals("1234")) {

                new MainFrame();

                dispose();

            }

            else {

                JOptionPane.showMessageDialog(
                        this,
                        "Invalid Login");

            }

        });

        setLocationRelativeTo(null);

        setVisible(true);

    }

}