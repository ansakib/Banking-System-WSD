package Bank;

// Singleton class

import Accounts.Account;

import java.util.ArrayList;
import java.util.List;

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
        } else {
            System.out.println("Account type not supported!");
        }
    }
}
