package org.dng;

public class Employees {

    private String surname;
    private PaymentType paymentType;
    private double paymentValue;

    public Employees(String surname, PaymentType paymentType, double paymentValue) {
        this.surname = surname;
        this.paymentType = paymentType;
        this.paymentValue = paymentValue;
    }

    public String getSurname() {
        return surname;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public double getPaymentValue() {
        return paymentValue;
    }

    public void setPaymentValue(double paymentValue) {
        this.paymentValue = paymentValue;
    }

    public String getSummary(){
        return "Employee: "+surname+"  paymentType: "+paymentType+"  paymentValue: "+paymentValue+"(tugrik(s))";
    }
}

enum PaymentType {
    RATE, HOURLY, PIECEWORK
}

