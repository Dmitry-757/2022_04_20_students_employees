package org.dng;

public class Salary {
    public static void main(String[] args) {
        Employees employee1 = new Employees("Ivanov", PaymentType.RATE, 300);
        Employees employee2 = new Employees("Sidorov", PaymentType.HOURLY, 800);
        Employees employee3 = new Employees("Petrov", PaymentType.PIECEWORK, 5500);

        System.out.printf("%10s %10s %10s \n", "Surname", "PaymentType", "PaymentValue");
        System.out.printf("%10s %11s %12.2f \n", employee1.getSurname(), employee1.getPaymentType(), employee1.getPaymentValue());
        System.out.printf("%10s %11s %12.2f \n", employee2.getSurname(), employee2.getPaymentType(), employee2.getPaymentValue());
        System.out.printf("%10s %11s %12.2f \n", employee3.getSurname(), employee3.getPaymentType(), employee3.getPaymentValue());
    }
}
