package org.dng;

public class EmplDependedByChldCurrencyOfShore_t5 extends EmplDependedByChildAndCurrency_t4 {

    private boolean isOfShore = false;

    //add to constructor property isOfShore
    public EmplDependedByChldCurrencyOfShore_t5(String surname, PaymentType paymentType, double paymentValue, boolean childFree, boolean isOfShore) {
        super(surname, paymentType, paymentValue, childFree);
        this.isOfShore = isOfShore;
    }

    //may be, it suddenly will be needed ))
    public void setOfShore(boolean ofShore) {
        isOfShore = ofShore;
    }
    public boolean isOfShore() {
        return isOfShore;
    }

    // Сотрудники, находящиеся в офшоре, не платят налогов
    @Override
    protected int getTaxRate() {
        if(isOfShore)
            return 0;
        else
            return super.getTaxRate();
    }
}
