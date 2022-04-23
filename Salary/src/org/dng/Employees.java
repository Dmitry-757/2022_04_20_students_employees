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
        double salaryVal = 0;
        //for first 3 tasks condition must provide calculating of salary value without currency
        if ((paymentType == PaymentType.HOURLY)&&(currencyRate != 0 )){
            salaryVal = paymentValue * (100 - getTaxRate() ) / 100 / 2;
        }
        else{
            salaryVal = paymentValue * (100 - getTaxRate() ) / 100;
        }
        return salaryVal;
    }
    public double getCurrencySalaryValue() {
        //discrimination of childless employees ((
        double salaryVal = 0;
        if (paymentType == PaymentType.HOURLY){
            salaryVal = paymentValue * (100 - getTaxRate() ) / 100 / 2 / currencyRate;
        }

        return salaryVal;
    }

    //** unused **
//    public String getSummary() {
//        return "Employee: " + surname + "  paymentType: " + paymentType + "  paymentValue: " + paymentValue + "(tugrik(s))  TaxRate(%):" + paymentType.getTaxRate();
//    }

    public static void setCurrencyRate(double currencyR) {
        currencyRate = currencyR;
    }

    //** Summary for task1
    public void printSummary1() {
        System.out.printf("%10s %11s %14.2f %11d \n", getSurname(), getPaymentType(), getPaymentValue(), getTaxRate());
    }

    //** Summary for task2 & task3
    public void printSummary2() {
        System.out.printf("%10s %11d %14.2f %11.2f  \n", getSurname(), getTaxRate(), getPaymentValue(), getSalaryValue());
    }

    //** Summary for task4
    public void printSummary4() {
        System.out.printf("%10s %11d %14.2f   (%8.2f /%7.2f)   \n", getSurname(), getTaxRate(), getPaymentValue(), getSalaryValue(), getCurrencySalaryValue());
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

