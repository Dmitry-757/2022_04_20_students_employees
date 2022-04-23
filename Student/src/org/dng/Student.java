package org.dng;

import java.time.LocalDate;

public class Student extends User{
    private int year;

    public Student(String name, String surname, int year) throws Exception {
//        super(name, surname);
        if (year <=0 ){
            throw new Exception("For student "+name+" "+surname+" year must be > 0 !");
        }
        if(year > LocalDate.now().getYear()){
            throw new Exception("For student "+name+" "+surname+" year must be <= "+LocalDate.now().getYear());
        }
        if( (LocalDate.now().getYear()-year) > 5){
            throw new Exception("Dear "+name+" "+surname+", our bursa has only 5 years education, not more! )))");
        }
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public int getCourse(){
        return LocalDate.now().getYear()-year;
    }
}
