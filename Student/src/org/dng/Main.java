package org.dng;

/**
 Реализуйте классStudent(Студент), который будет наследоваться от класса User.
 Этот класс должен иметь следующие свойства: name(имя, наследуется от User),
 surname(фамилия, наследуется от User), year(год поступления в вуз).
 Класс должен иметь метод getFullName()(наследуется от User), с помощью которого можно вывести
 одновременно имя и фамилию студента. Также класс должен иметь метод getCourse(), который будет выводить
 текущий курс студента (от 1 до 5). Курс вычисляется так: нужно от текущего года отнять год поступления в вуз.
 Текущий год получите самостоятельно.
 */
public class Main {

    public static void main(String[] args) {
        Student student = null;
        Student student2 = null;
        try {
            student = new Student("Ivan", "Petrov", 2015);
            System.out.println("Student "+student.getFullName()+" is studying for the "+student.getCourse()+" course");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            student2 = new Student("Petr", "Ivanov", 2021);
            System.out.println("Student "+student2.getFullName()+" is studying for the "+student2.getCourse()+" course");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
    }
}
