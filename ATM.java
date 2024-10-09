
import java.util.Scanner;

public class ATM {
    private String cardNumber;
    private int pin;
    private double balance;

    public ATM(String cardNumber, int pin, double balance) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.balance = balance;
    }

    public void login() {
        System.out.println("-----ATM INTERFACE----- ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Card Number: ");
        String inputCardNumber = scanner.nextLine();
        System.out.print("Enter PIN: ");
        int inputPin = scanner.nextInt();

        if (inputCardNumber.equals(cardNumber) && inputPin == pin) {
            System.out.println(".....Login Successful.....");
            displayMenu();
        } else {
            System.out.println("....Invalid Card Number or PIN....");
        }
    }

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {System.out.println("**\nATM Menu*");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Balance Inquiry");
            System.out.println("4. Transfer");
            System.out.println("5. Exit");

            System.out.print("Enter your Choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    withdraw();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    checkbalance();
                    break;
                case 4:
                    transfer();
                    break;
                case 5:
                    System.out.println("Thank you for using ATM!");
                    return;
                default:
                    System.out.println("Invalid Choice. Please try again.");
            }
        }
    }

    public void withdraw() {Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Amount: ");
        double amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("Insufficient Balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal Successful. Remaining Balance: " + balance);
        }
    }

    public void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Amount: ");
        double amount = scanner.nextDouble();

        balance += amount;
        System.out.println("Deposit Successful. New Balance: " + balance);
    }

    public void checkbalance() {
        System.out.println("Current Balance: " + balance);
    }

    public void transfer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Account Number: ");
        String recipientAccount = scanner.next();
        System.out.print("Enter Amount: ");
        double amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("Insufficient Balance.");
        } else {
            balance -= amount;
            System.out.println("Transfer Successful. Remaining Balance: " + balance);
        }
    }

    public static void main(String[] args) {
        ATM atm = new ATM("123456789", 1234, 1000);
        atm.login();
    }
}