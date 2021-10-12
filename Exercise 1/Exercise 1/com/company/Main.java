package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //objects

        Display display = new Display();
        TicketPrinter ticketPrinter = new TicketPrinter();
        CashRegister cashRegister = new CashRegister(display, ticketPrinter);
        Keyboard keyboard = new Keyboard(cashRegister);
        CashScanner cashScanner = new CashScanner(cashRegister);

        //Variables
        String manual;

        // Scanner object
        Scanner sc = new Scanner(System.in);
        int input = 0;

        while(input != 3){
            System.out.println("Select an input:" + "\n" + "Enter 1 for Scanner" + "\n" + "Enter 2 for Keyboard" +
                    "\n" + "Enter 3 to exit");

            input = sc.nextInt();

            // Scanner method
            if(input == 1){

                System.out.println("Please scan UPC code for product: ");
                manual = sc.next();
                cashScanner.scannedUPCCode(manual);
            }
            // Keyboard method
            else if (input == 2) {

                System.out.println("Please enter UPC code for product: ");
                manual = sc.next();
                keyboard.setUPCCode(manual);
            }
            else if (input == 3) {
                    break;
            // Not a valid entry try again
            }
            else {

                System.out.println("Invalid entry");
                continue;
            }
            cashRegister.getCurrentProductInfo();
        }
    }
}
