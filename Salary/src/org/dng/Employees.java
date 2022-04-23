package org.dng;

public class Employees {

    private String surname;
    private PaymentType paymentType;
    private double paymentValue;
    private boolean hasChildren = false; //for task 3

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

    public int getTaxRate(){
        return paymentType.getTaxRate() + (hasChildren ? 0 : 5);
    }
    public double getSalaryValue() {
        //childless discrimination ((
        return paymentValue * (100 - getTaxRate() ) / 100;
    }

    //** unused **
//    public String getSummary() {
//        return "Employee: " + surname + "  paymentType: " + paymentType + "  paymentValue: " + paymentValue + "(tugrik(s))  TaxRate(%):" + paymentType.getTaxRate();
//    }

    //** Summary for task1
    public void printSummary1() {
        System.out.printf("%10s %11s %14.2f %11d \n", getSurname(), getPaymentType(), getPaymentValue(), getTaxRate());
    }

    //** Summary for task2 & task3
    public void printSummary2() {
        System.out.printf("%10s %11d %14.2f %11s  \n", getSurname(), getTaxRate(), getPaymentValue(), getSalaryValue());
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

