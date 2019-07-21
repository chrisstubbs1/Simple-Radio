package com.chrisstubbs;

import java.util.Scanner;

public class Radio implements RadioMethods {
    private Scanner scan = new Scanner(System.in);
    private double station;
    private int volume;
    private boolean on;

    public Radio(double station, int volume) {
        this.station = station;
        this.volume = volume;
    }

    public Radio() {
        this(1.00, 1);
        this.on = false;
    }

    @Override
    public double getStation() {
        return this.station;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public void turnOn() {
        System.out.println("Turning radio on");
        this.on = true;
    }

    @Override
    public void turnOff() {
        System.out.println("Turning radio off");
        this.on = false;
    }

    @Override
    public void changeStation() {
        if (on) {
            System.out.println("Change station: ");
            double newStation = scan.nextDouble();

            do {
                if (newStation < 0 || newStation > 299.99) {
                    System.out.println("Invalid station: Re enter a valid station");
                }

                this.station = newStation;
            } while (station < 0 || station > 299.99);
        }else {
            System.out.println("The radio is off.");
        }
    }

    @Override
    public void changeVolume() {
        if (on) {
            System.out.println("Change volume: ");
            int newVolume = scan.nextInt();

            do {
                if (volume < 0 || volume > 20) {
                    System.out.println("Invalid volume: Re enter a valid volume level");
                }

                this.volume = newVolume;
            } while (volume < 0 || volume > 20);
        }else{
            System.out.println("The radio is off.");
        }
    }

}
