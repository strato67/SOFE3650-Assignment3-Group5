package com.company;

public class ProductDB {

    public String GetProductInfo(String upcCode){

        return switch (upcCode) {
            case "1" -> ("Basic car wash 9.99");
            case "2" -> ("Deluxe car wash 12.99");
            case "3" -> ("Supreme car wash 14.99");
            default -> ("Not an option");
        };
        //return Product;
    }

}
