package org.dng;

public class Employees {

    private String surname;
    private PaymentType paymentType;
    private double paymentValue;
    private boolean hasChildren = false; //for task 3
    private static double currencyRate = 0; //for task 4

    public Employees(String surname, PaymentType paymentType, double paymentValue) {
        this.surname = surname;
        this.paymentType = paymentType;
        this.paymentValue = paymentValue;
    }

    //constructor for task 3
    public Employees(String surname, PaymentType paymentType, double paymentValue, boolean hasChildren) {
        this.surname = surname;
        this.paymentType = paymentType;
        this.paymentValue = paymentValue;
        this.hasChildren = hasChildren;
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String name) {
        this.surname = name;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }


    public double getPaymentValue() {
        return paymentValue;
    }

    public int getTaxRate() {
        return paymentType.getTaxRate() + (hasChildren ? 0 : 5);
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

