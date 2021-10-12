package com.company;

class TicketPrinter implements View {


    @Override
    public void displayProduct(String product) {
        System.out.println("\n");
        System.out.println("Ticket Printer");
        System.out.println("____________");
        System.out.println(product);
        System.out.println("\n");
    }
}