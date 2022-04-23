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

    //** unused **
//    public void setPaymentType(PaymentType paymentType) {
//        this.paymentType = paymentType;
//    }

    public double getPaymentValue() {
        return paymentValue;
    }

    //** unused **
//    public void setPaymentValue(double paymentValue) {
//        this.paymentValue = paymentValue;
//    }

    public double getSalaryValue() {
        return paymentValue * (100 - paymentType.getTaxRate()) / 100;
    }

    //** unused **
//    public String getSummary() {
//        return "Employee: " + surname + "  paymentType: " + paymentType + "  paymentValue: " + paymentValue + "(tugrik(s))  TaxRate(%):" + paymentType.getTaxRate();
//    }

    //** Summary for task1
    public void printSummary1() {
        System.out.printf("%10s %11s %14.2f %11d \n", getSurname(), getPaymentType(), getPaymentValue(), paymentType.getTaxRate());
    }

    //** Summary for task2
    public void printSummary2() {
        System.out.printf("%10s %11d %14.2f %11s  \n", getSurname(), paymentType.getTaxRate(), getPaymentValue(), getSalaryValue());
    }

}

enum PaymentType {
    RATE(20), HOURLY(20), PIECEWORK(15);
    private int taxRate;

    PaymentType(int taxRate) {
        this.taxRate = taxRate;
    }

    public int getTaxRate() {
        return taxRate;
    }
}

