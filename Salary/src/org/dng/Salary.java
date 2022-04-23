package org.dng;

public class Salary {
    public static void main(String[] args) {
        Employees employee1 = new Employees("Ivanov", PaymentType.RATE, 300);
        Employees employee2 = new Employees("Sidorov", PaymentType.HOURLY, 800);
        Employees employee3 = new Employees("Petrov", PaymentType.PIECEWORK, 5500);


        //task 1
        System.out.printf("%10s %12s %13s %12s \n", "Surname", "PaymentType", "PaymentValue", "Tax rate(%)");
        employee1.printSummary1();
        employee2.printSummary1();
        employee3.printSummary1();
        System.out.println();

        //task 2
        //Surname, TaxRate, PaymentValue, SalaryValue
        System.out.printf("%10s %12s %13s %11s \n", "Surname", "TaxRate(%)", "PaymentValue", "SalaryValue");
        employee1.printSummary2();
        employee2.printSummary2();
        employee3.printSummary2();

    }
}
