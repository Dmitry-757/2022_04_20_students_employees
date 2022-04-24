package org.dng;

public class SalaryCalcService {
    private static double currencyRate = 0; //for task 4

    public static void setCurrencyRate(double currencyR) {
        currencyRate = currencyR;
    }

    public static double getCurrencyRate() {
        return currencyRate;
    }

    public static double getSalaryValue(Employees employee) {
        //childless discrimination ((
        double salaryVal = 0;
        //for first 3 tasks condition must provide calculating of salary value without currency
        if ((employee.getPaymentType() == PaymentType.HOURLY)&&(currencyRate != 0 )){
            salaryVal = employee.getPaymentValue() * (100 - employee.getTaxRate() ) / 100 / 2;
        }
        else{
            salaryVal = employee.getPaymentValue() * (100 - employee.getTaxRate() ) / 100;
        }
        return salaryVal;
    }
    public static double getCurrencySalaryValue(Employees employee) {
        //discrimination of childless employees ((
        double salaryVal = 0;
        if (employee.getPaymentType() == PaymentType.HOURLY){
            salaryVal = employee.getPaymentValue() * (100 - employee.getTaxRate() ) / 100 / 2 * currencyRate;
        }

        return salaryVal;
    }

    //** Summary for task1
    public static void printSummary1(Employees employee) {
        System.out.printf("%10s %11s %14.2f %11d \n", employee.getSurname(), employee.getPaymentType(),
                employee.getPaymentValue(), employee.getTaxRate());
    }

    //** Summary for task2 & task3
    public static void printSummary2(Employees employee) {
        System.out.printf("%10s %11d %14.2f %11.2f  \n", employee.getSurname(), employee.getTaxRate(),
                employee.getPaymentValue(), getSalaryValue(employee));
    }

    //** Summary for task4
    public static void printSummary4(Employees employee) {
        if(getCurrencySalaryValue(employee) != 0)
            System.out.printf("%10s %11d %13.2f   (%8.2f / %7.2f)   \n", employee.getSurname(), employee.getTaxRate(),
                employee.getPaymentValue(), getSalaryValue(employee), getCurrencySalaryValue(employee));
        else
            System.out.printf("%10s %11d %13.2f   %9.2f   \n", employee.getSurname(), employee.getTaxRate(),
                    employee.getPaymentValue(), getSalaryValue(employee));
    }

}
