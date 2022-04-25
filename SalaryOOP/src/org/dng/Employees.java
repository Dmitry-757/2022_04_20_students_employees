package org.dng;

/**
 * it is a base class for class-system for calculating salary
 * it has only properties and method for printing
 */

public class Employees {
    private String surname;
    private PaymentType paymentType;
    private double paymentValue;
    private int taxRate;

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

    public double getPaymentValue() {
        return paymentValue;
    }

    protected int getTaxRate() {
        return paymentType.getTaxRate();
    }

    public double getSalaryValue() {
        return getPaymentValue() * (100 - getTaxRate() ) / 100;
    }


    protected void printHead() {
        System.out.printf("%20s %12s %11s \n", "Surname", "PaymentType", "Summa");
    }
    protected void printSummary() {
        System.out.printf("%20s %11s %12.2f \n", getSurname(), getPaymentType(), getPaymentValue());
    }

    //**with PaymentValue
    protected void printSalaryValueHead() {
        System.out.printf("%20s %12s %11s %13s \n", "Surname", "TaxRate(%)", "Summa", "SalaryValue");

    }
    protected void printSummarySalaryValue() {
        System.out.printf("%20s %11d %12.2f %13.2f \n", getSurname(), getTaxRate(), getPaymentValue(), getSalaryValue());
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

