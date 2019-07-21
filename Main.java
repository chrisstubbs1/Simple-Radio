package com.chrisstubbs;

public class Main {

    public static void main(String[] args) {
        Radio radio = new Radio();
        
        System.out.println("The radio station is " + radio.getStation() + " and the volume " +
                "level is " + radio.getVolume());

        radio.changeVolume();

        System.out.println("The radio station is " + radio.getStation() + " and the volume " +
                "level is " + radio.getVolume());

        radio.changeStation();

        System.out.println("The radio station is " + radio.getStation() + " and the volume " +
                "level is " + radio.getVolume());

    }
}
