package org.dng;

public class EmplDependedByChild_t3 extends Employees{
    private boolean childFree = true;
    public EmplDependedByChild_t3(String surname, PaymentType paymentType, double paymentValue) {
        super(surname, paymentType, paymentValue);
    }

    public EmplDependedByChild_t3(String surname, PaymentType paymentType, double paymentValue, boolean childFree) {
        super(surname, paymentType, paymentValue);
        this.childFree = childFree;
    }

    @Override
    protected int getTaxRate() {
        //ChildFree discrimination ((
        if(childFree)
            return (super.getTaxRate() + 5);
        else
            return super.getTaxRate();
    }
}
