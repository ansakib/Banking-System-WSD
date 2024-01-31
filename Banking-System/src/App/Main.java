package App;

import Accounts.*;
import Bank.Bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = Bank.getInstance();
        System.out.println("1. Create a new account");
        System.out.println("2. Display all accounts");
        System.out.println("3. Update an account");
        System.out.println("4. Delete an account");
        System.out.println("5. Deposit an amount into your account");
        System.out.println("6. Withdraw an amount from your account");
        System.out.println("7. Search for account");
        System.out.println("8. Exit");
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter Account Type: current/savings/salary");
                    String accountType = sc.next();
                    System.out.println("Enter Name: ");
                    String name = sc.next();
                    String accountNumber = String.valueOf((int)(Math.random() * 1000000000));
                    System.out.println("Enter Initial Deposit: ");
                    double initialDeposit = sc.nextDouble();
                    bank.addAccount(accountType, name, accountNumber, initialDeposit);
                    break;
                case 2:
                    bank.displayAccounts();
                    break;
                case 3:
                    System.out.println("Enter Account Number: ");
                    String accountNumber1 = sc.next();
                    System.out.println("Enter New Name: ");
                    String name1 = sc.next();
                    bank.updateAccount(accountNumber1, name1);
                    break;
                case 4:
                    System.out.println("Enter Account Number: ");
                    String accountNumber2 = sc.next();
                    bank.deleteAccount(accountNumber2);
                    break;
                case 7:
                    System.out.println("Enter Account Number: ");
                    String accountNumber3 = sc.next();
                    Account acc = bank.searchAccount(accountNumber3);
                    acc.accountInfo();
                    break;

                case 8:
                    System.exit(0);
                    break;

            }
        }
    }
}
