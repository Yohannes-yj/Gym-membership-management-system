package service;

import model.Payment;
import java.util.ArrayList;

public class PaymentService {

    private ArrayList<Payment> payments;

    public PaymentService() {
        payments = new ArrayList<>();
    }

    public void makePayment(
            int memberId,
            double amount,
            String paymentDate) {

        payments.add(
                new Payment(
                        memberId,
                        amount,
                        paymentDate
                )
        );

        System.out.println(
                "Payment successful."
        );
    }

    public void displayPayments() {

        if(payments.isEmpty()) {

            System.out.println(
                    "No payments found."
            );

            return;
        }

        for(Payment payment : payments) {

            System.out.println(
                    "Member ID: "
                    + payment.getMemberId()
                    + " Amount: "
                    + payment.getAmount()
                    + " Date: "
                    + payment.getPaymentDate()
            );
        }
    }

    public ArrayList<Payment> getPayments() {
        return payments;
    }
}
