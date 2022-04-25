package org.dng;

public class EmplDependedByAllandWorkingTime_t6 extends EmplDependedByChldCurrencyOfShore_t5 {
    private double bonus = 0;
    private int WorkingHours = 0;

    public EmplDependedByAllandWorkingTime_t6(String surname, PaymentType paymentType, double paymentValue, boolean childFree,
                                              boolean isOfShore, double bonus, int workingUnits) {
        super(surname, paymentType, paymentValue, childFree, isOfShore);
        this.bonus = bonus;
        if((paymentType == PaymentType.HOURLY)||(paymentType == PaymentType.PIECEWORK) )
            WorkingHours = workingUnits;
        if(paymentType == PaymentType.RATE )
            WorkingHours = workingUnits * 8;
    }


    @Override
    public double getPaymentValue() {
        if(isOfShore()||(WorkingHours <= 200))//
            return super.getPaymentValue();
        else //больше 200 часов в месяц, но не находятся в офшоре
            //because of in task method of calculating bonus is absent, make it by one-time payment
            return super.getPaymentValue() + bonus;
    }

    @Override
    public double getSalaryValueCurrency() {
        return super.getSalaryValueCurrency();
    }

    @Override
    protected void printSalaryValueHead() {
        System.out.printf("%45s %12s %13s   %13s %24s \n", "Surname", "TaxRate(%)", "Summ", "Summ with bonus", "SalaryValue (grn/tugr)");
        System.out.printf("%107s 1/%3.2f \n","currency rate", getCurrencyRate());
    }

    @Override
    protected void printSummarySalaryValue() {
        if(getSalaryValueCurrency() != 0)
            System.out.printf("%45s %11d %14.2f  %15.2f   (%9.2f / %7.2f )   \n", getSurname(), getTaxRate(), super.getPaymentValue(),
                    getPaymentValue(), getSalaryValue(), getSalaryValueCurrency());
        else
            System.out.printf("%45s %11d %14.2f  %15.2f  %11.2f   \n", getSurname(), getTaxRate(), super.getPaymentValue(),
                    getPaymentValue(), getSalaryValue());

    }
}
