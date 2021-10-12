package com.company;

public class Keyboard {

    private final CashRegister cash;

    public Keyboard(CashRegister cash) {
        this.cash = cash;
    }

    public void setUPCCode(String UPCCode){
        cash.setCurrentProductUPCCode(UPCCode);
    }

}