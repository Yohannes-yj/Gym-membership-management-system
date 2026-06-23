package model;

public class Payment {

    private int memberId;
    private double amount;
    private String paymentDate;

    public Payment(int memberId,
                   double amount,
                   String paymentDate) {

        this.memberId = memberId;
        this.amount = amount;
        this.paymentDate = paymentDate;
    }

    public int getMemberId() {
        return memberId;
    }

    public double getAmount() {
        return amount;
    }

    public String getPaymentDate() {
        return paymentDate;
    }
}