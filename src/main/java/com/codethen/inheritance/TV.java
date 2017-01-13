package com.codethen.inheritance;


public class TV implements Machine {

    @Override
    public void turnOn() {
        System.out.println("TV is on!");
    }
}
