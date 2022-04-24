package org.dng;

public class Salary {
    public static void main(String[] args) {
        Employees employee1 = new Employees("Ivanov", PaymentType.RATE, 300);
        Employees employee2 = new Employees("Sidorov", PaymentType.HOURLY, 800);
        Employees employee3 = new Employees("Petrov", PaymentType.PIECEWORK, 5500);


        //task 1
        System.out.println("Task 1");
        System.out.printf("%10s %12s %13s %12s \n", "Surname", "PaymentType", "PaymentValue", "Tax rate(%)");
        SalaryCalcService.printSummary1(employee1);
        SalaryCalcService.printSummary1(employee2);
        SalaryCalcService.printSummary1(employee3);
        System.out.println();

        //task 2
        System.out.println("Task 2");
        //Surname, TaxRate, PaymentValue, SalaryValue
        System.out.printf("%10s %12s %13s %11s \n", "Surname", "TaxRate(%)", "PaymentValue", "SalaryValue");
//        employee1.printSummary2();
        SalaryCalcService.printSummary2(employee1);
        SalaryCalcService.printSummary2(employee2);
        SalaryCalcService.printSummary2(employee3);
        System.out.println();

        //task 3
        System.out.println("Task 3");
        Employees employee4 = new Employees("Ivanov_3", PaymentType.RATE, 300, true);
        Employees employee5 = new Employees("Sidorov_3", PaymentType.HOURLY, 800, false);
        Employees employee6 = new Employees("Petrov_3", PaymentType.PIECEWORK, 5500, false);
        System.out.printf("%10s %12s %13s %11s \n", "Surname", "TaxRate(%)", "PaymentValue", "SalaryValue");
//        employee4.printSummary2();
        SalaryCalcService.printSummary2(employee4);
        SalaryCalcService.printSummary2(employee5);
        SalaryCalcService.printSummary2(employee6);
        System.out.println();

        //task 4
        /*
        На основе предыдущего задания переделать отчет, с учетом того, что сотрудники с почасовой оплатой, половину
        зарплаты получают в валюте (тугриках), по курсу на день начисления заработной платы
         */
        System.out.println("Task 4");
        employee4.setSurname("Ivanov_4");
        employee5.setSurname("Sidorov_4");
        employee6.setSurname("Petrov_4");
        SalaryCalcService.setCurrencyRate(10); //set new currency rate
        System.out.printf("%10s %12s %13s %20s \n", "Surname", "TaxRate(%)", "PaymentValue", "SalaryValue (grn/tugr)");
        System.out.printf("%50s 1/%3.2f \n","current rate", SalaryCalcService.getCurrencyRate());
//        employee4.printSummary4();
        SalaryCalcService.printSummary4(employee4);
        SalaryCalcService.printSummary4(employee5);
        SalaryCalcService.printSummary4(employee6);
        System.out.println();

        //task5
        /*
        Фирма переводит часть сотрудников в офшорную зону.
        Сотрудники, находящиеся в офшоре, не платят налогов. Создать новый отчет с учетом данного нововведения.
        */
        Employees employee7 = new Employees("Ivanov_5", PaymentType.RATE, 300, true);
        Employees employee8 = new Employees("Sidorov_5", PaymentType.HOURLY, 800, false);
        Employees employee9 = new Employees("Petrov_5", PaymentType.PIECEWORK, 5500, false);
        //employee7.setOffshore(true);
        employee8.setOffshore(true);//pass employee to ofshore
        employee9.setOffshore(true);

        System.out.println("Task 5");
        System.out.printf("%10s %10s %12s %13s %20s \n", "Surname", "in_ofShore", "TaxRate(%)", "PaymentValue", "SalaryValue (grn/tugr)");
        System.out.printf("%62s 1/%3.2f \n","current rate", SalaryCalcService.getCurrencyRate());
        SalaryCalcService.printSummary5(employee7);
        SalaryCalcService.printSummary5(employee8);
        SalaryCalcService.printSummary5(employee9);
        System.out.println();


    }
}
