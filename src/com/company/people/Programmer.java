package com.company.people;

public class Programmer extends Person{

    @Override
    public String toString() {
        return coding();
    }

    private static String coding() {

        return "Programmer is coding";
    }

}
