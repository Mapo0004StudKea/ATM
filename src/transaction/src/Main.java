package transaction.src;

import transaction.src.transaction.ITransactionProcessor;
import transaction.src.transaction.TransactionProcessor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ITransactionProcessor transactionProcessor = new TransactionProcessor();

        Scanner scanner = new Scanner(System.in);
        String cardNumber = "";
        System.out.println("""
                **********************
                **** ATM TERMINAL ****
                **********************
                """);
        while(!cardNumber.equalsIgnoreCase("q")) {

        System.out.println("Please input card number: (q = quit)");
        cardNumber = scanner.nextLine();

        // if cardnumber valid
        System.out.println("Please input pin code:");
        int pinCode = scanner.nextInt();

        // if cardnumber and pin is valid, do:
            System.out.println("Please input amount to withdraw:");
            double amount = scanner.nextDouble();

            if (transactionProcessor.doTransaction(amount, cardNumber)) { // hent account fra cardNumber somehow?
                // cashdispenser.dispense(amount);
            };

        }
    }
}
