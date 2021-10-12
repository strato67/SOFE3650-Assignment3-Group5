package com.company;

public class CashScanner {

    private final CashRegister cash;

    public CashScanner(CashRegister cash) {
        this.cash = cash;
    }

    public void scannedUPCCode(String UPCCode){

        cash.setCurrentProductUPCCode(UPCCode);
    }
}