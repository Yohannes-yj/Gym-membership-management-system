package gui;

import service.PaymentService;

import javax.swing.*;
import java.awt.*;

public class PaymentPanel extends JPanel {

    private PaymentService service;

    public PaymentPanel() {

        service = new PaymentService();

        setLayout(new GridLayout(4,2));

        JTextField memberField =
                new JTextField();

        JTextField amountField =
                new JTextField();

        JTextField dateField =
                new JTextField();

        JButton button =
                new JButton(
                        "Make Payment");

        add(new JLabel("Member ID"));
        add(memberField);

        add(new JLabel("Amount"));
        add(amountField);

        add(new JLabel("Date"));
        add(dateField);

        add(button);

        button.addActionListener(e -> {

            service.makePayment(

                    Integer.parseInt(
                            memberField.getText()),

                    Double.parseDouble(
                            amountField.getText()),

                    dateField.getText()

            );

            JOptionPane.showMessageDialog(
                    this,
                    "Payment Successful!"
            );

        });

    }
}