package com.example.payment.model;

public class PaymentResponse {
    private int paymentId;
    private String fromAccountNo;
    private String toAccountNo;
    private double amount;
    private String paymentStatus;

    public PaymentResponse() {
    }

    public PaymentResponse(int paymentId, String fromAccountNo, String toAccountNo, double amount, String paymentStatus) {
        this.paymentId = paymentId;
        this.fromAccountNo = fromAccountNo;
        this.toAccountNo = toAccountNo;
        this.amount = amount;
        this.paymentStatus = paymentStatus;
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

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Override
    public String toString() {
        return "PaymentResponse{" +
                "paymentId=" + paymentId +
                ", fromAccountNo='" + fromAccountNo + '\'' +
                ", toAccountNo='" + toAccountNo + '\'' +
                ", amount=" + amount +
                ", paymentStatus='" + paymentStatus + '\'' +
                '}';
    }
}
