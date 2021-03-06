package com.example.payment.model;

public class PaymentRequest {
    private int paymentId;
    private String fromAccountNo;
    private String toAccountNo;
    private double amount;

    public PaymentRequest() {
    }

    public PaymentRequest(int paymentId, String fromAccountNo, String toAccountNo, double amount) {
        this.paymentId = paymentId;
        this.fromAccountNo = fromAccountNo;
        this.toAccountNo = toAccountNo;
        this.amount = amount;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public String getFromAccountNo() {
        return fromAccountNo;
    }

    public void setFromAccountNo(String fromAccountNo) {
        this.fromAccountNo = fromAccountNo;
    }

    public String getToAccountNo() {
        return toAccountNo;
    }

    public void setToAccountNo(String toAccountNo) {
        this.toAccountNo = toAccountNo;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "PaymentRequest{" +
                "paymentId=" + paymentId +
                ", fromAccountNo='" + fromAccountNo + '\'' +
                ", toAccountNo='" + toAccountNo + '\'' +
                ", amount=" + amount +
                '}';
    }
}
