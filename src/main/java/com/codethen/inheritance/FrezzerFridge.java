package com.codethen.inheritance;


public class FrezzerFridge extends Fridge {


    @Override //Anotación Sobreescribir el método padre que viene de Fridge
    public void turnOn() {  // Cuando hereda/interface se tiene que poner public

        System.out.println("Frezzer is on");

    }

    void freeze() {
        System.out.println("freezing!");
    }

    void unfreeze() {
        System.out.println("unfreezing!");
    }

}
