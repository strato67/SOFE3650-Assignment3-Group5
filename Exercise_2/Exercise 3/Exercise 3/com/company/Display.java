package com.company;

public class Display extends Observer {

    public void displayText(String text){

        System.out.println("Register Display");
        System.out.println("____________");
        System.out.println(text);
    }

    @Override
    public void updateDisplay(String text) {
        this.displayText(text);
    }
}
