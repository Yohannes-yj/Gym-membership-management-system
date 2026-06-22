package model;

import java.io.Serializable;
public class Payment implements Serializable {
    private int paymentID;
    private int memberID;
    private double amount;
    private String payDate;

    public Payment(int paymentID,int memberID, double amount, String payDate) {
        this.paymentID = paymentID;
        this.memberID = memberID;  
        this.amount = amount;
        this.payDate = payDate;
        }
        public int getPaymentID() {
            return paymentID;
        }
        public int getMemberID() {
            return memberID;
        }
        public double getAmount() {
            return amount;
        }
        public String getPayDate() {
            return payDate;
        }
        public void setPaymentID(int paymentID) {
            this.paymentID = paymentID;
        }
        public void setMemberID(int memberID) {
            this.memberID = memberID;
        }
        public void setAmount(double amount) {
            this.amount = amount;
        }
        public void setPayDate(String payDate) {
            this.payDate = payDate;
        }
        public void displayInfo() {
            System.out.println("Payment ID: " + paymentID);
            System.out.println("Member ID: " + memberID);
            System.out.println("Amount: " + amount);
            System.out.println("Payment Date: " + payDate);
        }
        @Override
        public String toString() {
            return paymentID + "," + memberID + "," + amount + "," + payDate;
        }
    
}
