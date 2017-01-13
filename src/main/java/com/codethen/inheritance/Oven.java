package com.codethen.inheritance;

public class Oven implements Machine {   // que hereda de clase Machine, se pone extends Machine
                                        // que hereda de interface Machine, se pone implements Machine

    public void turnOn() {

        System.out.println("Oven is on");

    }

}
