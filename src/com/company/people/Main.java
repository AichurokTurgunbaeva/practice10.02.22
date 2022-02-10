package com.company.people;

import com.company.people.Person;

public class Main {

    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        programmer.setName("Aichurok");
        programmer.setAge(28);
        programmer.setDesignation("Back-end developer");
        System.out.println(programmer.getName()+" "+programmer.getAge()+" years old. "+programmer.getDesignation()+". "
                +programmer.toString());

        Doctor doctor = new Doctor();
        doctor.setName("Ayzirek");
        doctor.setAge(24);
        doctor.setDesignation("Pediatrician");
        System.out.println(doctor.getName()+" "+doctor.getAge()+" years old. "+doctor.getDesignation()+". "
                +doctor.toString());

        Musician musician = new Musician();
        musician.setName("Yanni");
        musician.setAge(67);
        musician.setDesignation("Piano player");
        System.out.println(musician.getName()+" "+musician.getAge()+" years old. "+musician.getDesignation()+". "
        + musician.toString());




    }
}
