package Bank;

// Singleton class

import Accounts.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {
    private static Bank bankInstance;
    private List<Account> accounts;

    private Bank() {
        accounts = new ArrayList<>();
    }

    public static Bank getInstance() {
        if (bankInstance == null) {
            bankInstance = new Bank();
        }
        return bankInstance;
    }

    public void addAccount(String accountType, String name, String accountNumber, double initialDeposit) {
        Account newAccount = AccountFactory.createAccount(accountType, name, accountNumber, initialDeposit);
        if (newAccount != null) {
            accounts.add(newAccount);
        }
    }

    public void displayAccounts() {
        for (Account account : accounts) {
            account.accountInfo();
        }
    }

    public Account searchAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    public void updateAccount(String accountNumber, String name) {
        Account account = searchAccount(accountNumber);
        if (account != null) {
            account.updateAccount(name);
            account.accountInfo();
        } else {
            System.out.println("Account not found");
        }
    }
    public void deleteAccount(String accountNumber) {
        Account account = searchAccount(accountNumber);
        if (account != null) {
            System.out.println("Are you sure you want to delete this account? (y/n)");
            Scanner sc = new Scanner(System.in);
            String choice = sc.next();
            if (choice.toLowerCase().equals("y")) {
                accounts.remove(account);
                System.out.println("Account deleted successfully");
            }
        } else {
            System.out.println("Account not found");
        }
    }
}
