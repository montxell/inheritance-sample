package com.codethen.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Machine fridge = new Fridge();
        Machine fridge2 = new Fridge();
        Machine oven = new Oven();
        Machine oven2 = new Oven();

        //Fridge fridge = new Fridge();
        //Oven oven = new Oven();

        //fridge.turnOn();
        //oven.turnOn();

        //oven.increaseTemp(20);

        List<Machine> list = new ArrayList<>();
        list.add(oven);
        list.add(oven2);
        list.add(fridge);
        list.add(fridge2);


/*
        for (int i=0; i<list.size(); i++) {
            Machine machine = list.get(i);
            System.out.println(i + " - ");
            machine.turnOn();
        }
*/


        for (Machine machine : list) {
            machine.turnOn();
        }


    }
}
