package org.dng;

public class User {
    protected String name;
    protected String surname;

    public User() {
    }

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    protected String getFullName(){
        return name+" "+surname;
    }
}
