package com.company.people;

public class Doctor extends Person{


    @Override
    public String toString() {
        return makingSurgery();
    }

     private static String makingSurgery() {
        return "Doctor is making a surgery";
    }

}
