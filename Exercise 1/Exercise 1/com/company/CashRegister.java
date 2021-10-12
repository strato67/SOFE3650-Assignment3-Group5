package com.company;

import java.util.Scanner;

public class CashRegister {

    private String currentUPC;
    private ProductDB db ;
    private final Display display;
    private final TicketPrinter ticketPrinter;
    private Scanner scan;

    // constructor for CashRegister
    public CashRegister(Display display, TicketPrinter ticketPrinter) {
        currentUPC = "";
        scan = new Scanner(System.in);
        db = new ProductDB();
        this.display = display;
        this.ticketPrinter = ticketPrinter;
    }


    // keyboard and scanner use this method to pass UPC code to cash register
    public void setCurrentProductUPCCode(String UPCCode){
        this.currentUPC = UPCCode;
    }


    // Calls upon display and ticket printer to display text
    public void getCurrentProductInfo(){

        String output = db.GetProductInfo(this.currentUPC);
        display.displayText(output);
        ticketPrinter.displayText(output);

    }

}
