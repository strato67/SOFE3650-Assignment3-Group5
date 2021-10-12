package com.company;

import java.util.Scanner;

public class CashRegister {

    // Cash register objects
    private String currentUPC;
    private ProductDB db ;
    private View view;

    // constructor for CashRegister
    public CashRegister(View view) {
        currentUPC = "";
        db = new ProductDB();
        this.view = view;
    }
    public void setView(View view){
        this.view = view;
    }

    // keyboard and scanner use this method to pass UPC code to cash register
    public void setCurrentProductUPCCode(String UPCCode){
        this.currentUPC = UPCCode;
    }

    // Calls upon display and ticket printer to display text
    public void getCurrentProductInfo(){

        String output = db.GetProductInfo(this.currentUPC);
        view.displayProduct(output);
    }

}