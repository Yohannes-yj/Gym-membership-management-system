package gui;

import service.PaymentService;

import javax.swing.*;
import java.awt.*;

public class PaymentPanel extends JPanel {

    public PaymentPanel() {

        setLayout(new GridLayout(4,2));

        JTextField idField =
                new JTextField();

        JTextField amountField =
                new JTextField();

        JTextField dateField =
                new JTextField();

        JButton button =
                new JButton(
                        "Make Payment");

        add(new JLabel("Member ID"));
        add(idField);

        add(new JLabel("Amount"));
        add(amountField);

        add(new JLabel("Date"));
        add(dateField);

        add(button);

        button.addActionListener(e -> {

            PaymentService service =
                    new PaymentService();

            service.makePayment(
                    Integer.parseInt(
                            idField.getText()
                    ),

                    Double.parseDouble(
                            amountField.getText()
                    ),

                    dateField.getText()
            );

            JOptionPane.showMessageDialog(
                    this,
                    "Payment Successful"
            );
        });
    }
}
