package com.company;

public class TicketPrinter extends Observer{

    public void displayText(String text){

        System.out.println("\n");
        System.out.println("Ticket Printer");
        System.out.println("____________");
        System.out.println(text);
        System.out.println("\n");
    }

    @Override
    public void updateDisplay(String text) {
        this.displayText(text);
    }
}
