package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //objects
        Display display = new Display();
        TicketPrinter ticketPrinter = new TicketPrinter();
        CashRegister cashRegister = new CashRegister(display);
        Keyboard keyboard = new Keyboard(cashRegister);
        CashScanner cashScanner = new CashScanner(cashRegister);

        //Variables
        String manual;

        // Scanner object
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int input = 0;
        int receipt = 0;

        while(input != 3){
            System.out.println("Select an input:" + "\n" + "Enter 1 for Scanner" + "\n" + "Enter 2 for Keyboard" +
                    "\n" + "Enter 3 to exit");

            input = sc.nextInt();

            // Scanner method
            if(input == 1){

                System.out.println("Please scan UPC code for product: ");
                manual = sc.next();
                cashScanner.scannedUPCCode(manual);

                // Automatically update display
                cashRegister.setView(display);
                cashRegister.getCurrentProductInfo();

                // Prompt to print receipt
                System.out.println("Press 1 to print receipt any other key to exit: ");
                receipt = sc2.nextInt();
                if(receipt == 1) {
                    cashRegister.setView(ticketPrinter);
                    cashRegister.getCurrentProductInfo();
                }else
                    continue;

            }
            // Keyboard method
            else if (input == 2) {

                System.out.println("Please enter UPC code for product: ");
                manual = sc.next();
                keyboard.setUPCCode(manual);

                // Automatically update display
                cashRegister.setView(display);
                cashRegister.getCurrentProductInfo();

                // Prompt to print receipt
                System.out.println("Press 1 to print receipt any other key to exit: ");
                receipt = sc2.nextInt();
                if(receipt == 1) {
                    cashRegister.setView(ticketPrinter);
                    cashRegister.getCurrentProductInfo();
                }else
                    continue;

            }
            else if (input == 3) {
                break;
            }
            // Not a valid entry try again
            else {

                System.out.println("Invalid entry");
                continue;
            }

        }
    }
}