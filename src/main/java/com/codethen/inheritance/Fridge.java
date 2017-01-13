package com.codethen.inheritance;


public class Fridge implements Machine {  // que hereda de clase Machine, se pone extends Machine
                                          // que hereda de interface Machine, se pone implements Machine

    @Override
    public void turnOn() {  // Cuando hereda/interface se tiene que poner public

        System.out.println("Fridge is on");

    }

    void turnLightOn(){
        System.out.println("Light turned on");
    }
}
