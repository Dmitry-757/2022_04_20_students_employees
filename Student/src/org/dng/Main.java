package org.dng;

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
