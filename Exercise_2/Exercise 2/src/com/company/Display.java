package com.company;

public class Display implements View {

    @Override
    public void displayProduct(String product) {
        System.out.println("Register Display");
        System.out.println("____________");
        System.out.println(product);
    }
}