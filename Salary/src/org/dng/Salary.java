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
        System.out.println();

        //task 3
        Employees employee4 = new Employees("Ivanov_3", PaymentType.RATE, 300, true);
        Employees employee5 = new Employees("Sidorov_3", PaymentType.HOURLY, 800, false);
        Employees employee6 = new Employees("Petrov_3", PaymentType.PIECEWORK, 5500, false);
        System.out.printf("%10s %12s %13s %11s \n", "Surname", "TaxRate(%)", "PaymentValue", "SalaryValue");
        employee4.printSummary2();
        employee5.printSummary2();
        employee6.printSummary2();


    }
}
