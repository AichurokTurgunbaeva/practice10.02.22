package com.company.people;

public class Musician extends Person{

    @Override
    public String toString() {
        return playingPiano();
    }

    private static String playingPiano() {
        return "Musician is playing on piano";
    }
}
