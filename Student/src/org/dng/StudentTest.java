package org.dng;
import org.junit.jupiter.api.Assertions;

class StudentTest {

    @org.junit.jupiter.api.Test
    void createStudent() {
        try {
            Student student = new Student("Ivan", "Petrov", 2015);
            Assertions.fail("Exception was expected!");
        }
        catch (Exception ex){
            System.out.println("Test done. Caught exception = "+ ex.getMessage());
            Assertions.assertNotEquals("", "Dear Ivan Petrov, our bursa has only 5 years education, not more!");
        }
    }


    @org.junit.jupiter.api.Test
    void getCourse() {
        try {
            Student student2 = new Student("Petr", "Ivanov", 2021);
            int expected = 1;
            int actual = student2.getCourse();
            Assertions.assertEquals(expected, actual);
            System.out.println("test of getCourse() done.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}