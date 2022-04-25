package org.dng;

public class SalaryMain {
    public static void main(String[] args) {

        Employees employee1 = new Employees("Ivanov", PaymentType.RATE, 300);
        Employees employee2 = new Employees("Sidorov", PaymentType.HOURLY, 800);
        Employees employee3 = new Employees("Petrov", PaymentType.PIECEWORK, 5500);

        //task 1
        /*
            Разработать и протестировать набор классов для решения задачи подсчета зароботной платы сотрудников некоторой фирмы.
            На фирме есть несколько способов оплаты труда:
            ■ ставка – указывается, сколько сотрудник получает за
            рабочий день; для каждого сотрудника записывается,
            сколько дней он отработал в месяце;
            ■ почасовая – указывается, сколько сотрудник получает в
            час, для каждого сотрудника; записывается, сколько часов
            он отработал в месяце
            ■ сдельная – указывается, сколько сотрудник получит за
            выполненную работу; для каждого сотрудника записываются
            суммы для каждой работы, что он успел сделать за месяц
        */
        System.out.println("Task 1");
        employee1.printHead();
        employee1.printSummary();
        employee2.printSummary();
        employee3.printSummary();
        System.out.println();

        //task 2
        /*
            Для предыдущего задания вывести отчет с учетом налогов. Для сотрудников, которые на ставке и почасовой оплате
            – налог 20%.
            Для сотрудников со сдельной оплатой труда – 15%.
        */
        System.out.println("Task2");
        employee1.printSalaryValueHead();
        employee1.printSummarySalaryValue();
        employee2.printSummarySalaryValue();
        employee3.printSummarySalaryValue();
        System.out.println();

        //task 3
        /*
            На основе предыдущего задания сделать новый отчет
            таким образом, что для сотрудников, у которых нет детей,
            ставка налога выше на 5%.
        */
        System.out.println("Task 3");
        employee1 = new EmplDependedByChild_t3("Ivanov_with_Chaild", PaymentType.RATE, 300, false);
        employee2 = new EmplDependedByChild_t3("Sidorov_child_free", PaymentType.HOURLY, 800);
        employee3 = new EmplDependedByChild_t3("Petrov_child_free", PaymentType.PIECEWORK, 5500);
        employee1.printSalaryValueHead();
        employee1.printSummarySalaryValue();
        employee2.printSummarySalaryValue();
        employee3.printSummarySalaryValue();
        System.out.println();

        //task 4
        /*
            На основе предыдущего задания переделать отчет, с учетом того, что сотрудники с почасовой оплатой, половину
            зарплаты получают в валюте (тугриках), по курсу на день
            начисления заработной платы
        */
        System.out.println("Task 4");
        EmplDependedByChildAndCurrency_t4.setCurrencyRate(10);
        employee1 = new EmplDependedByChildAndCurrency_t4("Ivanov_with_Chaild", PaymentType.RATE, 300, false);
        employee2 = new EmplDependedByChildAndCurrency_t4("Sidorov_child_free", PaymentType.HOURLY, 800, true);
        employee3 = new EmplDependedByChildAndCurrency_t4("Petrov_child_free", PaymentType.PIECEWORK, 5500, true);

        employee1.printSalaryValueHead();

        employee1.printSummarySalaryValue();
        employee2.printSummarySalaryValue();
        employee3.printSummarySalaryValue();


        //Task 5
        /*
         Фирма переводит часть сотрудников в офшорную зону.
         Сотрудники, находящиеся в офшоре, не платят налогов. Создать новый отчет с учетом данного нововведения.
         */
        System.out.println("Task 5");
        EmplDependedByChildAndCurrency_t4.setCurrencyRate(10);
        employee1 = new EmplDependedByChldCurrencyOfShore_t5("Ivanov_with_Chaild_domestic", PaymentType.RATE,
                300, false, false);
        employee2 = new EmplDependedByChldCurrencyOfShore_t5("Sidorov_child_free_ofShore", PaymentType.HOURLY,
                800, true, true);
        employee3 = new EmplDependedByChldCurrencyOfShore_t5("Petrov_child_free_ofShore", PaymentType.PIECEWORK,
                5500, true, true);

        employee1.printSalaryValueHead();

        employee1.printSummarySalaryValue();
        employee2.printSummarySalaryValue();
        employee3.printSummarySalaryValue();
        System.out.println();


        //Task 6
        /*
             Фирма вводит премии сотрудникам, которые работали
             больше 200 часов в месяц, но не находятся в офшоре. Премии должны суммироваться в основную зарплату. Создать
             новый отчет с учетом изменений.
        */
        System.out.println("Task 6");
        employee1 = new EmplDependedByAllandWorkingTime_t6("Ivanov_withChaild_domestic_bonus50_wu26", PaymentType.RATE,
                300, false, false, 50, 26);
        employee2 = new EmplDependedByAllandWorkingTime_t6("Sidorov_childFree_domestic_bonus50_h300", PaymentType.HOURLY,
                800, true, false, 50.0, 300);
        employee3 = new EmplDependedByAllandWorkingTime_t6("Petrov_childFree_ofShore_bonus200_h250", PaymentType.PIECEWORK,
                5500, true, true, 100.0, 250);
        Employees employee4 = new EmplDependedByAllandWorkingTime_t6("Pupkin_childFree_domestic_bonus100_h200", PaymentType.PIECEWORK,
                5500, true, false, 100.0, 200);
        Employees employee5 = new EmplDependedByAllandWorkingTime_t6("Tjapkin_withChaild_domestic_bonus100_h210", PaymentType.PIECEWORK,
                5500, false, false, 100.0, 210);
        Employees employee6 = new EmplDependedByAllandWorkingTime_t6("Pumkin_childFree_domestic_bonus100_h220", PaymentType.PIECEWORK,
                5500, true, false, 100.0, 220);

        employee1.printSalaryValueHead();

        employee1.printSummarySalaryValue();
        employee2.printSummarySalaryValue();
        employee3.printSummarySalaryValue();
        employee4.printSummarySalaryValue();
        employee5.printSummarySalaryValue();
        employee6.printSummarySalaryValue();

    }
}
