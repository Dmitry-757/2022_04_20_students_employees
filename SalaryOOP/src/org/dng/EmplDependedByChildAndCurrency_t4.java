package org.dng;

/**
 На основе предыдущего задания переделать отчет, с учетом того, что сотрудники с почасовой оплатой, половину
 зарплаты получают в валюте (тугриках), по курсу на день
 начисления заработной платы.
 */

public class EmplDependedByChildAndCurrency_t4 extends EmplDependedByChild_t3 {
    private static double currencyRate = 0;

    public EmplDependedByChildAndCurrency_t4(String surname, PaymentType paymentType, double paymentValue, boolean childFree) {
        super(surname, paymentType, paymentValue, childFree);
    }
    public static double getCurrencyRate() {
        return currencyRate;
    }
    public static void setCurrencyRate(double currencyRate) {
        EmplDependedByChildAndCurrency_t4.currencyRate = currencyRate;
    }

    @Override
    public double getSalaryValue() { //override method for consider "currency payment" condition
        if (getPaymentType() == PaymentType.HOURLY){
            return (super.getSalaryValue() / 2);
        }
        else{
            return (super.getSalaryValue());
        }
    }
    public double getSalaryValueCurrency() {
        if (getPaymentType() == PaymentType.HOURLY){
            return (super.getSalaryValue() / 2) * currencyRate;
        }
        else{
            return 0;
        }
    }


    @Override
    protected void printSalaryValueHead() {
        System.out.printf("%30s %12s %13s %24s \n", "Surname", "TaxRate(%)", "Summ", "SalaryValue (grn/tugr)");
        System.out.printf("%73s 1/%3.2f \n","currency rate", currencyRate);
    }

    @Override
    protected void printSummarySalaryValue() {
        if(getSalaryValueCurrency() != 0)
            System.out.printf("%30s %11d %14.2f   (%9.2f / %7.2f )   \n", getSurname(), getTaxRate(), getPaymentValue(),
                    getSalaryValue(), getSalaryValueCurrency());
        else
            System.out.printf("%30s %11d %14.2f   %10.2f   \n", getSurname(), getTaxRate(), getPaymentValue(),
                    getSalaryValue());
    }
}
